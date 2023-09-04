package com.crtv.creativetechnocollege;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.creativetechnocollege.R;


public class Semistar_Elibrary extends Fragment {
    CardView sem1, sem2, sem3, sem4, sem5, sem6;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_semistar__elibrary, container, false);

        sem1 = (CardView) view.findViewById(R.id.sem1);
        sem2 = (CardView) view.findViewById(R.id.sem2);
        sem3 = (CardView) view.findViewById(R.id.sem3);
        sem4 = (CardView) view.findViewById(R.id.sem4);
        sem5 = (CardView) view.findViewById(R.id.sem5);
        sem6 = (CardView) view.findViewById(R.id.sem6);

        Bundle bundle = getArguments();


        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bundle != null) {
                    String value = bundle.getString("1st");
                    if (value.equals("bca")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BCA_sem1_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bba")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BBA_sem1_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bsc")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BSC_sem1_material())
                                .addToBackStack(null).commit();

                    }
                }

            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bundle != null) {
                    String value = bundle.getString("1st");
                    if (value.equals("bca")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BCA_sem2_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bba")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BBA_sem2_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bsc")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BSC_sem2_material())
                                .addToBackStack(null).commit();

                    }
                }

            }
        });
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bundle != null) {
                    String value = bundle.getString("1st");
                    if (value.equals("bca")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BCA_sem3_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bba")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BBA_sem3_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bsc")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BSC_sem3_material())
                                .addToBackStack(null).commit();

                    }
                }

            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bundle != null) {
                    String value = bundle.getString("1st");
                    if (value.equals("bca")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BCA_sem4_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bba")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BBA_sem4_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bsc")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BSC_sem4_material())
                                .addToBackStack(null).commit();

                    }
                }

            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bundle != null) {
                    String value = bundle.getString("1st");
                    if (value.equals("bca")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BCA_sem5_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bba")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BBA_sem5_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bsc")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BSC_sem5_material())
                                .addToBackStack(null).commit();

                    }
                }

            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bundle != null) {
                    String value = bundle.getString("1st");
                    if (value.equals("bca")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BCA_sem6_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bba")) {
                        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BBA_sem6_material())
                                .addToBackStack(null).commit();
                    } else if (value.equals("bsc")) {
                            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new BSC_sem6_material())
                                    .addToBackStack(null).commit();

                    }
                }

            }
        });


        return view;
    }
}