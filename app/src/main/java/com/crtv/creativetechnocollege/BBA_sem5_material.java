package com.crtv.creativetechnocollege;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
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


public class BBA_sem5_material extends Fragment {


    CardView sub1, sub2, sub3, sub4, sub5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b_b_a_sem5_material, container, false);

        sub1=view.findViewById(R.id.bbaorganisation);
        sub2=view.findViewById(R.id.bbafinacemarket);
        sub3=view.findViewById(R.id.bbaadvertisement);
        sub4=view.findViewById(R.id.bbamanageinfo);
        sub5=view.findViewById(R.id.bbaindia);



        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String QBank = "https://drive.google.com/drive/folders/1-HplVPBMwLb32JEQ4O0jme3t6TLMkRc-?usp=sharing";
                showDialog(getActivity(),Demoppt.class, Demonotes.class, DemoAssignment.class, "Organizational Behaviour", QBank);
            }
        });

        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String QBank = "https://drive.google.com/drive/folders/11KmI3_ANirFHshplimKaOm2mUUWEzBD-?usp=sharing";
                showDialog(getActivity(),Demoppt.class, Demonotes.class, DemoAssignment.class, "Financial And Market Institution", QBank);
            }
        });

        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String QBank = "https://drive.google.com/drive/folders/1ESUvRkUz0t5EE7GfgulZjuA1DJlH-YuF?usp=sharing";
                showDialog(getActivity(),Demoppt.class, Demonotes.class, DemoAssignment.class, "Advertisement And Sales Promotion", QBank);
            }
        });

        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String QBank = "https://drive.google.com/drive/folders/1PI4bsgkxSWQkCKP7abg1HXXZENTY8ijn?usp=sharing";
                showDialog(getActivity(),Demoppt.class, Demonotes.class, DemoAssignment.class, "Management Information System And DSS", QBank);
            }
        });

        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String QBank = "https://drive.google.com/drive/folders/1w13rJfpYDupw49xKDbVbRK3nDD8Nk_Us?usp=sharing";
                showDialog(getActivity(),Demoppt.class, Demonotes.class, DemoAssignment.class, "Indian Socity And Culture", QBank);
            }
        });

        return  view;

    }

    private void showDialog(Activity activity, Class next, Class next2, Class next3, String bookdata, String QBank) {

        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetlayout);

        LinearLayout ppt = dialog.findViewById(R.id.ppt);
        LinearLayout note = dialog.findViewById(R.id.notes);
        LinearLayout assignment = dialog.findViewById(R.id.assign);
        LinearLayout question = dialog.findViewById(R.id.ques);


        Bundle bundle = new Bundle();
        bundle.putString("bookdata", bookdata);

        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

                DemoAssignment demoAssignment = new DemoAssignment();
                demoAssignment.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, demoAssignment)
                        .addToBackStack(null).commit();
                dialog.dismiss();
            }
        });

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(QBank);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);


    }

}