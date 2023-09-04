package com.crtv.creativetechnocollege;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.creativetechnocollege.R;


public class Result extends Fragment {

    WebView webView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_course, container, false);

        webView = view.findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://creativecollege.in/Result/index.php");
//        webView.loadUrl("https://creativecollege.in/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view;
    }
}