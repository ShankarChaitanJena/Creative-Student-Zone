package com.crtv.creativetechnocollege;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.creativetechnocollege.R;


public class Contact_Us extends Fragment implements View.OnClickListener {



    ImageView phnBtn1, phnBtn2, phnBtn3, phnBtn4, phnBtn5, phnBtn6, phnBtn7, phnBtn8, phnBtn9, phnBtn10;

    Button locate_office, locate_college;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact__us, container, false);

        phnBtn1 = view.findViewById(R.id.phonebtn1);
        phnBtn2 = view.findViewById(R.id.phonebtn2);
        phnBtn3 = view.findViewById(R.id.phonebtn3);
        phnBtn4 = view.findViewById(R.id.phonebtn4);
        phnBtn5 = view.findViewById(R.id.phonebtn5);
        phnBtn6 = view.findViewById(R.id.phonebtn6);
        phnBtn7 = view.findViewById(R.id.phonebtn7);
        phnBtn8 = view.findViewById(R.id.phonebtn8);
        phnBtn9 = view.findViewById(R.id.phonebtn9);
        phnBtn10 = view.findViewById(R.id.phonebtn10);

        locate_office = view.findViewById(R.id.locate_office);
        locate_college = view.findViewById(R.id.locate_college);

        locate_office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOfficeMap();
            }
        });

        locate_college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCollegeMap();
            }
        });

        phnBtn1.setOnClickListener(this);
        phnBtn2.setOnClickListener(this);
        phnBtn3.setOnClickListener(this);
        phnBtn4.setOnClickListener(this);
        phnBtn5.setOnClickListener(this);
        phnBtn6.setOnClickListener(this);
        phnBtn7.setOnClickListener(this);
        phnBtn8.setOnClickListener(this);
        phnBtn9.setOnClickListener(this);
        phnBtn10.setOnClickListener(this);

        return view;
    }

    private void openOfficeMap() {
        Uri uri1 = Uri.parse("geo:0, 0?q=Creative Techno College Tamrit colony Angul Odisha");
        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
        intent1.setPackage("com.google.android.apps.maps");
        startActivity(intent1);
    }

    private void openCollegeMap() {
        Uri uri = Uri.parse("geo:0, 0?q=Creative Techno College Baluakata Odisha");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        switch (view.getId()) {
            case R.id.phonebtn1:
                intent.setData(Uri.parse("tel:8249090003"));
                startActivity(intent);

                break;

            case R.id.phonebtn2:
                intent.setData(Uri.parse("tel:9668844571"));
                startActivity(intent);

                break;

            case R.id.phonebtn3:
                intent.setData(Uri.parse("tel:9778427170"));
                startActivity(intent);

                break;

            case R.id.phonebtn4:
                intent.setData(Uri.parse("tel:8249652681"));
                startActivity(intent);

                break;

            case R.id.phonebtn5:
                intent.setData(Uri.parse("tel:9853698972"));
                startActivity(intent);
                break;

            case R.id.phonebtn6:
                intent.setData(Uri.parse("tel:8327725559"));
                startActivity(intent);
                break;

            case R.id.phonebtn7:
                intent.setData(Uri.parse("tel:6371239937"));
                startActivity(intent);
                break;

            case R.id.phonebtn8:
                intent.setData(Uri.parse("tel:7978729820"));
                startActivity(intent);
                break;

            case R.id.phonebtn9:
                intent.setData(Uri.parse("tel:6372271781"));
                startActivity(intent);
                break;

            case R.id.phonebtn10:
                intent.setData(Uri.parse("tel:9439137384"));
                startActivity(intent);
                break;

        }
    }}