package com.crtv.creativetechnocollege;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.creativetechnocollege.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Digital_Notice_Board extends Fragment implements ImageAdapter.OnImageClickListener {

    ProgressDialog dialog;
    private RecyclerView recyclerView;
    private ImageAdapter imageAdapter;
    private List<Bitmap> imageList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_digital_notice_board, container, false);
        dialog = new ProgressDialog(getContext());
        dialog.setTitle("Loading...");
        dialog.show();

        recyclerView = view.findViewById(R.id.imageRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1, GridLayoutManager.VERTICAL, false));
        imageAdapter = new ImageAdapter(imageList, this); // Pass the listener to the adapter
        recyclerView.setAdapter(imageAdapter);

        fetchImages();

        return view;
    }

    private void fetchImages() {
        String url = "https://creativecollege.in/DNB/retrive.php";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        String[] imageStrings = response.split("\\r?\\n");
                        ListIterator<String> iterator = Arrays.asList(imageStrings).listIterator(imageStrings.length);
                        while (iterator.hasPrevious()) {
                            String imageString = iterator.previous();
                            byte[] imageBytes = Base64.decode(imageString, Base64.DEFAULT);
                            Bitmap bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
                            dialog.dismiss();
                            imageList.add(bitmap);
                        }
                        imageAdapter.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                dialog.setTitle("No Internet Connection");
            }
        });
        Volley.newRequestQueue(getActivity()).add(stringRequest);
    }

    @Override
    public void onImageClick(Bitmap image) {
        ImageDetailFragment fragment = new ImageDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("clicked_image", image);
        fragment.setArguments(bundle);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment); // R.id.fragment_container is the container in your activity layout
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
