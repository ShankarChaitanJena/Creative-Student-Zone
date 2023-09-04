package com.crtv.creativetechnocollege;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
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

public class  Feedback_input_data extends Fragment implements AdapterView.OnItemSelectedListener {

    View rootview;
    TextView feedback_course,feedback_name,feedback_id,feedback_semester;
    Spinner feedback_subject;
    Button Enterbutton,btn1;
//    ProgressBar progressBar;

    ProgressDialog dialog;
    String semester,COURSE;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview= inflater.inflate(R.layout.fragment_feedback__input_data, container, false);

        dialog= new ProgressDialog(getContext());
        dialog.setTitle("Loading...");
        dialog.show();
        feedback_id=rootview.findViewById(R.id.feedback_collegeid);
        feedback_name=rootview.findViewById(R.id.feedback_name);
        feedback_course=rootview.findViewById(R.id.feedback_course);
        feedback_semester=rootview.findViewById(R.id.feedback_semester);
        btn1=rootview.findViewById(R.id.btn1);

        try {
            setData();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        feedback_semester=rootview.findViewById(R.id.feedback_semester);
        feedback_subject=rootview.findViewById(R.id.feedback_subject);
//        progressBar=rootview.findViewById(R.id.prograssbar);


        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.INVISIBLE);
        Enterbutton.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                COURSE = feedback_course.getText().toString();
                semester=feedback_semester.getText().toString().trim();

                if (COURSE.equalsIgnoreCase("BSC-CS(H)") && semester.equalsIgnoreCase("1st")) {
                    BSC1();
                } else if (COURSE.equalsIgnoreCase("BSC-CS(H)") && semester.equalsIgnoreCase("2nd")) {
                    BSC2();
                } else if (COURSE.equalsIgnoreCase("BSC-CS(H)") && semester.equalsIgnoreCase("3rd")) {
                    BSC3();
                } else if (COURSE.equalsIgnoreCase("BSC-CS(H)") && semester.equalsIgnoreCase("4th")) {
                    BSC4();
                } else if (COURSE.equalsIgnoreCase("BSC-CS(H)") && semester.equalsIgnoreCase("5th")) {
                    BSC5();
                } else if (COURSE.equalsIgnoreCase("BSC-CS(H)") && semester.equalsIgnoreCase("6th")) {
                    BSC6();
                } else if (COURSE.equalsIgnoreCase("BCA") && semester.equalsIgnoreCase("1st")) {
                    BCA1();
                } else if (COURSE.equalsIgnoreCase("BCA") && semester.equalsIgnoreCase("2nd")) {
                    BCA2();
                } else if (COURSE.equalsIgnoreCase("BCA") && semester.equalsIgnoreCase("3rd")) {
                    BCA3();
                } else if (COURSE.equalsIgnoreCase("BCA") && semester.equalsIgnoreCase("4th")) {
                    BCA4();
                } else if (COURSE.equalsIgnoreCase("BCA") && semester.equalsIgnoreCase("5th")) {
                    BCA5();
                } else if (COURSE.equalsIgnoreCase("BCA") && semester.equalsIgnoreCase("6th")) {
                    BCA6();
                } else if (COURSE.equalsIgnoreCase("BBA") && semester.equalsIgnoreCase("1st")) {
                    BBA1();
                } else if (COURSE.equalsIgnoreCase("BBA") && semester.equalsIgnoreCase("2nd")) {
                    BBA2();
                } else if (COURSE.equalsIgnoreCase("BBA") && semester.equalsIgnoreCase("3rd")) {
                    BBA3();
                } else if (COURSE.equalsIgnoreCase("BBA") && semester.equalsIgnoreCase("4th")) {
                    BBA4();
                } else if (COURSE.equalsIgnoreCase("BBA") && semester.equalsIgnoreCase("5th")) {
                    BBA5();
                } else if (COURSE.equalsIgnoreCase("BBA") && semester.equalsIgnoreCase("6th")) {
                    BBA6();
                }
            }
        });

        return rootview;
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    private void setData() {

        SharedPreferences sharedPreferences = this.requireActivity().getSharedPreferences("Data", Context.MODE_PRIVATE);

        String s = sharedPreferences.getString("ID", null);

        String url = "https://creativecollege.in/Feedback/feedback_input.php";

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.isEmpty()){
//                            progressBar.setVisibility(View.VISIBLE);
                            dialog.show();
                        }
                        else {
//                            progressBar.setVisibility(View.INVISIBLE);
                            dialog.dismiss();
                            String[] parts = response.split(",");
                            String idvalue = parts[0];
                            String namevalue = parts[1];
                            String coursevalue = parts[2];
                            String semvalue = parts[3];

                            feedback_course.setText(coursevalue);
                            feedback_name.setText(namevalue);
                            feedback_id.setText(idvalue);
                            feedback_semester.setText(semvalue);
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
    public void BSC1()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BSC1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();

            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("PROGRAMMING USING C")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DIGITAL LOGIC")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("MATHEMATICS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ENVIRONMENTAL SCIENCE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BSC2()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BSC2, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);


            if (subject.equalsIgnoreCase("PROGRAMMING USING C++")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DATA STRUCTURE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("PHYSICS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ENGLISH")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BSC3()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BSC3, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);


            if (subject.equalsIgnoreCase("JAVA PROGRAMMING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DATABASE SYSTEM")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DISCRETE MATHEMATICAL STRUCTURE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("PYTHON PROGRAMMING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ALGEBRA")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BSC4()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BSC4, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);


            if (subject.equalsIgnoreCase("OPERATING SYSTEM")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("COMPUTER NETWORK")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("COMPUTER GRAPHICS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ANDROID PROGRAMMING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("PHYSICS 2")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BSC5()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BSC5, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("WEB TECHNOLOGIES")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("SOFTWARE ENGINEERING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("NUMERICAL TECHNIQUES")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("UNIX SHELL PROGRAMMING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BSC6()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BSC6, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);
            if (subject.equalsIgnoreCase("ARTIFICIAL INTELLIGENCE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ALGORITHM DESIGN TECHNIQUES")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DATA SCIENCE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BCA1()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BCA1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("PROGRAMMING USING C")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DIGITAL LOGIC")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("MANAGEMENT")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ENVIRONMENTAL SCIENCE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BCA2()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BCA2, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("PROGRAMMING USING C++")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DATA STRUCTURE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("COMMUNICATION ENGLISH")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("STATISTICS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml,feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BCA3()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BCA3, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("JAVA PROGRAMMING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("BUSINESS ACCOUNTING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DISCRETE MATHEMATICAL STRUCTURE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("PYTHON PROGRAMMING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("COMPUTER ORGANIZATION")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BCA4()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BCA4, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("OPERATING SYSTEM")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DATABASE SYSTEM")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("COMPUTER NETWORK")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ANDROID PROGRAMMING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("BUSINESS ECONOMICS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BCA5()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BCA5, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("WEB TECHNOLOGIES")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("SOFTWARE ENGINEERING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DATA MINING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("UNIX SHELL PROGRAMMING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BCA6()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BCA6, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("DATA SCIENCE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("NUMERICAL TECHNIQUES")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("COMPUTER GRAPHICS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BBA1()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BBA1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("INTRODUCTION TO BUSINESS")) {
                Feedback feedback1 =new Feedback();
                bundle.putString("tittle",subject);
                feedback1.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback1).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ENGLISH LANGUAGE AND LITERATURE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("QUANTITATIVE TECHNIQUES FOR MANAGEMENT")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("BASIC FINANCIAL ACCOUNTING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BBA2()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BBA2, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("ECONOMICS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("MANAGEMENT THEORY AND PRACTICAL")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("COST AND MANAGEMENT ACCOUNTING")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("COMPUTER FOR MANAGEMENT")) {

                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BBA3()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BBA3, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("PSYCHOLOGY FOR MANAGEMENT")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("BUSINESS ETHICS AND CORPORATE GOVERNANCE")) {

                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("INTRODUCTION TO BANKING AND INSURANCE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("BUSINESS AND CORPORATE LAW")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("COMMUNICATIVE ENGLISH")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BBA4()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BBA4, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);


            if (subject.equalsIgnoreCase("FINANCIAL MANAGEMENT")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("MARKETING MANAGEMENT")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("HUMAN RESOURCE MANAGEMENT")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("PRODUCT AND OPERATION MANAGEMENT")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ENVIRONMENTAL STUDIES")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BBA5()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BBA5, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("ORGANIZATIONAL BEHAVIOUR")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("FINANCIAL MARKETS AND INSTITUTIONS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ADVERTISEMENT AND SALES PROMOTION")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("MANAGEMENT INFORMATION SYSTEM AND DSS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("INDIAN SOCIETY AND CULTURE")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
    public void BBA6()
    {
        feedback_subject = rootview.findViewById(R.id.feedback_subject);
        Enterbutton = rootview.findViewById(R.id.ENTBTN);
        feedback_subject.setVisibility(View.VISIBLE);
        Enterbutton.setVisibility(View.VISIBLE);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootview.getContext(), R.array.BBA6, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedback_subject.setAdapter(adapter1);
        feedback_subject.setOnItemSelectedListener(this);
        Feedback feedback=new Feedback();
        Bundle bundle = new Bundle();
        Enterbutton.setOnClickListener(v -> {
            String subject = feedback_subject.getSelectedItem().toString();
            String id=feedback_id.getText().toString().trim();
            String name=feedback_name.getText().toString().trim();
            bundle.putString("id",id);
            bundle.putString("name",name);
            String course=feedback_course.getText().toString().trim();
            bundle.putString("course",course);

            if (subject.equalsIgnoreCase("RESEARCH METHODOLOGY")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ENTREPRENEURSHIP AND SMALL BUSINESS MANAGEMENT")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("E BUSINESS")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("DISSERTATION AND VIVA-VOCA")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
            else if (subject.equalsIgnoreCase("ORGANIZATIONAL CHANGE AND DEVELOPMENT")) {
                bundle.putString("tittle",subject);
                feedback.setArguments(bundle);
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.feedbackxml, feedback).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}