package com.crtv.creativetechnocollege;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.creativetechnocollege.R;


public class BBA_sem1_material extends Fragment {


    CardView sub1, sub2, sub3, sub4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b_b_a_sem1_material, container, false);

        sub1=view.findViewById(R.id.bbaintrotobussi);
        sub2=view.findViewById(R.id.bbaenglishlitreture);
        sub3=view.findViewById(R.id.bbafinancialaccount);
        sub4=view.findViewById(R.id.bbaquantitativetechnique);

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(getActivity(),Demoppt.class, Demonotes.class, DemoAssignment.class, "Introduction to bussiness");
            }
        });

        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(getActivity(),Demoppt.class, Demonotes.class, DemoAssignment.class, "English Language And Litreture");
            }
        });

        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(getActivity(),Demoppt.class, Demonotes.class, DemoAssignment.class, "Basics Of Financial Accounting");
            }
        });

        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(getActivity(),Demoppt.class, Demonotes.class, DemoAssignment.class, "Quantitative Technique For Management");
            }
        });

        return view;
    }

    private void showDialog(Activity activity, Class next, Class next2, Class next3, String bookdata) {

        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetlayout);

        LinearLayout ppt = dialog.findViewById(R.id.ppt);
        LinearLayout note = dialog.findViewById(R.id.notes);
        LinearLayout assignment = dialog.findViewById(R.id.assign);

        Bundle bundle = new Bundle();
        bundle.putString("bookdata", bookdata);

        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Bundle bundle1 = new Bundle();
//                bundle1.putString("ppt", pptdata);

                Demoppt demoppt = new Demoppt();
                demoppt.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, demoppt)
                        .addToBackStack(null).commit();
                dialog.dismiss();
            }
        });



        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Bundle bundle2 = new Bundle();
//                bundle2.putString("note", notedata);

                Demonotes demonotes = new Demonotes();
                demonotes.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, demonotes)
                        .addToBackStack(null).commit();
                dialog.dismiss();
            }
        });

        assignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Bundle bundle3 = new Bundle();
//                bundle3.putString("assignment", assignmentdata);

                DemoAssignment demoAssignment = new DemoAssignment();
                demoAssignment.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, demoAssignment)
                        .addToBackStack(null).commit();
                dialog.dismiss();
            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);


    }


}