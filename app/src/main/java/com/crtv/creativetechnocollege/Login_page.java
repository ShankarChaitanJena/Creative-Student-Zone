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
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

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

public class Login_page extends Fragment {

    ProgressDialog progressDialog;
    EditText editText1, editText2;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_page, container, false);

        progressDialog = new ProgressDialog(getContext());
        editText1 = view.findViewById(R.id.userid);
        editText2 = view.findViewById(R.id.userpwd);
        button = view.findViewById(R.id.ok);

        final SharedPreferences sharedPreferences = getActivity().getSharedPreferences("Data", Context.MODE_PRIVATE);
        final String type = sharedPreferences.getString("ID", "");
        final String type1 = sharedPreferences.getString("Password", "");

        progressDialog.dismiss();

        if (type.isEmpty()) {
            // User not logged in
        } else {
            // User already logged in, navigate to home screen
            FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new Home());
            fragmentTransaction.commit();
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = editText1.getText().toString().trim();
                String userPwd = editText2.getText().toString().trim();

                progressDialog.setTitle("Loading...");
                progressDialog.show();

                try {
                    login(userId, userPwd);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("ID", userId);
                editor.putString("Password", userPwd);
                editor.apply();
            }
        });

        return view;
    }

    private void login(String userId, String userPwd) {
        if (userId.isEmpty()) {
            Toast.makeText(getActivity(), "Enter ID", Toast.LENGTH_SHORT).show();
            return;
        } else if (userPwd.isEmpty()) {
            Toast.makeText(getActivity(), "Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://creativecollege.in/Feedback/login.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.equalsIgnoreCase("found")) {
                            progressDialog.dismiss();
                            Toast.makeText(getActivity(), "LOGIN SUCCESS", Toast.LENGTH_SHORT).show();
                            FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, new Home());
                            fragmentTransaction.commit();
                        } else if (response.equalsIgnoreCase("not found")) {
                            Toast.makeText(getActivity(), "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                try {
                    Toast.makeText(getActivity(), "CONNECTION FAILED", Toast.LENGTH_SHORT).show();
                } catch (Error e) {
                    e.printStackTrace();
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("id", userId);
                params.put("pwd", userPwd);
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        requestQueue.add(stringRequest);
    }
}
