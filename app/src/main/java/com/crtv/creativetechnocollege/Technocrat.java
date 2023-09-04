package com.crtv.creativetechnocollege;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.creativetechnocollege.R;

public class Technocrat extends Fragment {

    WebView technocratweb;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_technocrat, container, false);

        technocratweb = view.findViewById(R.id.technocratweb);

        technocratweb.setWebViewClient(new WebViewClient());
        technocratweb.loadUrl("https://creativecollege.in/page-wings-technocrat.html#/");
        WebSettings webSettings = technocratweb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view;
    }
}