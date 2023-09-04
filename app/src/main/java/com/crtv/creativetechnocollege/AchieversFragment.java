package com.crtv.creativetechnocollege;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.example.creativetechnocollege.R;


public class AchieversFragment extends Fragment {
    WebView webView;

    public AchieversFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_achievers, container, false);

        webView = view.findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://creativecollege.in/page-achiever.html");
//        webView.loadUrl("https://creativecollege.in/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view;
    }

}