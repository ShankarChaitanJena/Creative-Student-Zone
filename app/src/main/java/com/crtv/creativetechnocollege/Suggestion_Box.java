package com.crtv.creativetechnocollege;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

import java.util.HashMap;
import java.util.Map;

public class Suggestion_Box extends Fragment {
    TextView suggestion_id, suggestion_course, suggestion_name;
    EditText suge_message;
    Button submit;
    ProgressDialog dialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        dialog = new ProgressDialog(getContext());
        dialog.setTitle("Loading...");
        dialog.show();
        setData();
        View rootview = inflater.inflate(R.layout.fragment_suggestion__box, container, false);
        suggestion_id = rootview.findViewById(R.id.suggestion_id);
        suggestion_course = rootview.findViewById(R.id.suggestion_course);
        suggestion_name = rootview.findViewById(R.id.suggestion_name);

        suge_message = rootview.findViewById(R.id.suggestion_Message);
//        String msg =(String)suge_message.getText().toString().trim();
        submit = rootview.findViewById(R.id.submit_msg);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg =(String)suge_message.getText().toString().trim();

                if(msg.isEmpty()){
                    Toast.makeText(getActivity(), "Enter Your Suggestion", Toast.LENGTH_SHORT).show();
                }else {
                        SendMailTask sendMailTask = new SendMailTask("angul.creative@gmail.com", "Creative Techno College(Suggestion ❤️)  ",
                            msg);
                    sendMailTask.execute();
                }

                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container,new Home()).commit();

            }
        });



        return rootview;
    }


    private void setData() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("Data", Context.MODE_PRIVATE);

        String s = sharedPreferences.getString("ID", null);

        String url = "https://creativecollege.in/Feedback/details.php";

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        String[] parts = response.split(",");
                        String idvalue = parts[0];
                        String namevalue = parts[1];
                        String dobvalue = parts[2];
                        String emailvalue = parts[3];
                        String phonevalue = parts[4];
                        String coursevalue = parts[5];
                        String addressvalue = parts[6];
                        suggestion_id.setText(idvalue);
                        suggestion_course.setText(coursevalue);
                        suggestion_name.setText(namevalue);
                        dialog.dismiss();


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


    private void logout() {
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("Data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear().apply();

        FragmentManager fragmentManager = getParentFragmentManager();
        fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);


        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new Login_page()).commit();

    }
}