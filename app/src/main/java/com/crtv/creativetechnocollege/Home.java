package com.crtv.creativetechnocollege;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.creativetechnocollege.R;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Home extends Fragment {

//    ProgressBar progressBar;
    ProgressDialog dialog;

    ArrayList<LinearLayout> linearLayouts = new ArrayList<>();

    TextView name;

    SharedPreferences sharedPreferences;

    ImageView home_Image_View;
    String filename = "my_image.png";
    final FileInputStream[] fis = {null};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        dialog=new ProgressDialog(getContext());


//        progressBar = view.findViewById(R.id.prograssbar);
        dialog.setTitle("Loading...");
        dialog.show();


        name = view.findViewById(R.id.homename);
        setName();

        linearLayouts.add(view.findViewById(R.id.about));
        linearLayouts.add(view.findViewById(R.id.contact));
        linearLayouts.add(view.findViewById(R.id.library));
        linearLayouts.add(view.findViewById(R.id.profile1));
        linearLayouts.add(view.findViewById(R.id.sugation_box));
        linearLayouts.add(view.findViewById(R.id.notice));
        linearLayouts.add(view.findViewById(R.id.feedback));
        linearLayouts.add(view.findViewById(R.id.achivers));
        linearLayouts.add(view.findViewById(R.id.result));
        linearLayouts.add(view.findViewById(R.id.couese));




        home_Image_View = view.findViewById(R.id.homeimage);
        getImage();
        home_Image_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });

        for (LinearLayout linearLayout : linearLayouts) {

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.about ->
                            openAbout_us();
                            
                        case R.id.contact->
                            openContact();
                           
                        case R.id.library->
                            openLibrary();
                            
                        case R.id.profile1->
                            openProfile();
                            
                        case R.id.sugation_box->
                            openSugation_box();
                            
                        case R.id.feedback ->
                            openFeedBAck();
                        case R.id.notice ->
                                
                                openNotice();
                        case R.id.achivers ->

                                openAchivers();
                        case R.id.couese ->

                                openCouesr();


                        case R.id.result ->

                                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container,new Result())
                                        .addToBackStack(null).commit();


                    }
                }

            });

        }


        return view;
    }

    private void openCouesr() {
        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container,new Course())
                .addToBackStack(null).commit();
    }

    private void openNotice() {
        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container,new Digital_Notice_Board())
                .addToBackStack(null).commit();
    }

    private void getImage() {
        try {
            fis[0] = getActivity().openFileInput(filename);
            Bitmap bitmap = BitmapFactory.decodeStream(fis[0]);
            home_Image_View.setImageBitmap(bitmap);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis[0] != null) {
                try {
                    fis[0].close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void openAchivers() {
        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container,new AchieversFragment())
                .addToBackStack(null).commit();
    }


    public void setName() {
        sharedPreferences = this.getActivity().getSharedPreferences("Data", Context.MODE_PRIVATE);

        String s = sharedPreferences.getString("ID", null);


        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://creativecollege.in/Feedback/details.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.isEmpty()) {
//                            progressBar.setVisibility(View.VISIBLE);
                            dialog.setTitle("Loading...");
                            dialog.show();

                        } else {
//                            progressBar.setVisibility(View.INVISIBLE);
                            dialog.dismiss();

                            String[] parts = response.split(",");
                            String idvalue = parts[0];
                            String namevalue = parts[1];
                            name.setText(namevalue);
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), "CONNECTION FAILED", Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new HashMap<String, String>();

                params.put("id", s);

                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        requestQueue.add(stringRequest);


    }

    private void openFeedBAck() {
        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new Feedback_input_data())
                .addToBackStack(null).commit();
    }

    private void openSugation_box() {
        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new Suggestion_Box())
                .addToBackStack(null).commit();
    }

    private void openProfile() {
        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new Profile());

        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }

    private void openLibrary() {

        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new Elibrary());

        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    private void openContact() {
        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new Contact_Us());

        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void openAbout_us() {

        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new About_us());

        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();

    }

}