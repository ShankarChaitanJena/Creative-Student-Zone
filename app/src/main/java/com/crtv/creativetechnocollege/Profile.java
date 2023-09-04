package com.crtv.creativetechnocollege;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

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
import java.util.HashMap;
import java.util.Map;

public class Profile extends Fragment {

    //Logout & Edit profile

    Button edit_profile, logout;

    Dialog dialog;


    ImageView profile_Image;
    String filename = "my_image.png";
    final FileInputStream[] fis = {null};

    ProgressDialog progressDialog;



    TextView name1, name2, collegeid, course, phn_no, email_id, address;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        progressDialog = new ProgressDialog(getContext());
        progressDialog.setTitle("Loading...");
        progressDialog.show();

        edit_profile = view.findViewById(R.id.edit_profile);
        logout = view.findViewById(R.id.logout);


        name1 = view.findViewById(R.id.profilename1);
        name2 = view.findViewById(R.id.profilename2);
        collegeid = view.findViewById(R.id.profileid);
        course = view.findViewById(R.id.profilecourse);
        phn_no = view.findViewById(R.id.profilePhonrno);
        email_id = view.findViewById(R.id.profileemailid);
        address = view.findViewById(R.id.profilecadress);

        profile_Image = view.findViewById(R.id.profileimage);
        getImage();



        try {
            setData();
        }
        catch (Exception|Error e){
            e.printStackTrace();
        }


        logout.setOnClickListener(v -> {
            openLogout();

        });
        edit_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("cemail", email_id.getText().toString());
                bundle.putString("cphone", phn_no.getText().toString());
                bundle.putString("caddress", address.getText().toString());

                EditProfile editProfile = new EditProfile();
                editProfile.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, editProfile).commit();
            }
        });

        return view;
    }

    private void getImage() {
        try {
            fis[0] = getActivity().openFileInput(filename);
            Bitmap bitmap = BitmapFactory.decodeStream(fis[0]);
            profile_Image.setImageBitmap(bitmap);
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

    private void openLogout() {
        dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.popup_dialog);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            dialog.getWindow().setBackgroundDrawable(getContext().getDrawable(R.drawable.buttonstyle));
        }
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        TextView logout_final = dialog.findViewById(R.id.finallogout);
        TextView cancel = dialog.findViewById(R.id.cancel);

        logout_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences("Data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear().apply();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);


                dialog.dismiss();

                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container,new Login_page())
                        .commit();

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }

    private void setData() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("Data", Context.MODE_PRIVATE);

        String s = sharedPreferences.getString("ID", null);

        String url = "https://creativecollege.in/Feedback/details.php";

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.isEmpty()) {
//                            progressBar.setVisibility(View.VISIBLE);
                            progressDialog.setTitle("Loading...");
                            progressDialog.show();
                        } else {
//                            progressBar.setVisibility(View.INVISIBLE);
                            progressDialog.dismiss();
                            String[] parts = response.split(",");
                            String idvalue = parts[0];
                            String namevalue = parts[1];
                            String dobvalue = parts[2];
                            String emailvalue = parts[3];
                            String phonevalue = parts[4];
                            String coursevalue = parts[5];
                            String addressvalue = parts[6];
//                            Toast.makeText(getActivity(), idvalue, Toast.LENGTH_SHORT).show();
//
                            collegeid.setText(idvalue);
                            name1.setText(namevalue);
                            name2.setText(namevalue);
                            course.setText(coursevalue);
                            phn_no.setText(phonevalue);
                            email_id.setText(emailvalue);
                            address.setText(addressvalue);
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


}