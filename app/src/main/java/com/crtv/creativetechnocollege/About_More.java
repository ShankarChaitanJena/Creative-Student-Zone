package com.crtv.creativetechnocollege;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.creativetechnocollege.R;


public class About_More extends Fragment {

    ImageView insta, fb, link, web, yt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about__more, container, false);

        insta = view.findViewById(R.id.insta);
        fb = view.findViewById(R.id.fb);
        link = view.findViewById(R.id.link);
        web = view.findViewById(R.id.web);
        yt = view.findViewById(R.id.yt);

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://instagram.com/creative_techno_college_angul?igshid=YmMyMTA2M2Y=/");
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://facebook.com/creativetechnocollege.angul");
            }
        });

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.linkedin.com/company/creative-techno-college-angul/");
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.creativecollege.in/");
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/@creativetechnocollegeiangu9750");
            }
        });

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}