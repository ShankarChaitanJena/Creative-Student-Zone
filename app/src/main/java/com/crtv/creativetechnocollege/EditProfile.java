package com.crtv.creativetechnocollege;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EditProfile extends Fragment {

    private static final int PICK_IMAGE_REQUEST = 1;

    ImageView edit_profile_picture;
    String filename = "my_image.png";
    final FileInputStream[] fis = {null};
    Button save_profile;

    EditText email, phone, address;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_edit_profile, container, false);

        Bundle bundle = this.getArguments();
        String emaildata = bundle.getString("cemail");
        String phonedata = bundle.getString("cphone");
        String addressdata = bundle.getString("caddress");

        email=view.findViewById(R.id.update_email);
        phone=view.findViewById(R.id.update_phone);
        address=view.findViewById(R.id.update_address);
        save_profile=view.findViewById(R.id.save_profile);


        edit_profile_picture=view.findViewById(R.id.edit_profile_picture);
        getImage();

        edit_profile_picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectImage();
            }
        });

        email.setText(emaildata);
        phone.setText(phonedata);
        address.setText(addressdata);

        save_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                updateData();
            }
        });



        return view;
    }

    private void getImage() {
        try {
            fis[0] = getActivity().openFileInput(filename);
            Bitmap bitmap = BitmapFactory.decodeStream(fis[0]);
            edit_profile_picture.setImageBitmap(bitmap);
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

    private void selectImage() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.getData() != null) {
            Uri selectedImageUri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(requireActivity().getContentResolver(), selectedImageUri);

                // Save the bitmap to the phone's internal storage
                String filename = "my_image.png";
                FileOutputStream fos = requireActivity().openFileOutput(filename, Context.MODE_PRIVATE);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
                fos.close();

                // Set the ImageView's bitmap to the selected image
                edit_profile_picture.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }








private void updateData() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("Data", Context.MODE_PRIVATE);

        String s = sharedPreferences.getString("ID", null);

        String pHone,eMail,aDdress;
        pHone=phone.getText().toString().trim();
        eMail=email.getText().toString().trim();
        aDdress=address.getText().toString().trim();


        String url = "https://creativecollege.in/Feedback/updateprofile.php";
    if (pHone.isEmpty()){
        phone.setError("Empty");
        phone.requestFocus();
    } else if (eMail.isEmpty()) {
        email.setError("Empty");
        email.requestFocus();
    } else if (aDdress.isEmpty()) {
        address.setError("Empty");
        address.requestFocus();
    }else {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.isEmpty()) {
//                            progressBar.setVisibility(View.VISIBLE);
                            Toast.makeText(getActivity(), "Not Invocked", Toast.LENGTH_SHORT).show();
                        }
                        else {

                            Toast.makeText(getActivity(), response, Toast.LENGTH_SHORT).show();
//                            progressBar.setVisibility(View.INVISIBLE);
                            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container,new Profile())
                                    .commit();
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
                params.put("email", eMail);
                params.put("phone",pHone);
                params.put("address",aDdress);


                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        requestQueue.add(stringRequest);
    }
    }

}