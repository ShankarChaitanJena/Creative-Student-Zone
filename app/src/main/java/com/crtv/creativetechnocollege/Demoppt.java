package com.crtv.creativetechnocollege;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.creativetechnocollege.R;

public class Demoppt extends Fragment {

    CardView unit1, unit2, unit3, unit4;

    String u1, u2, u3, u4;

    TextView setSubject;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_demoppt, container, false);

        Bundle bundle = this.getArguments();
        String pptdata = bundle.getString("bookdata");

        unit1 = view.findViewById(R.id.unit1);
        unit2 = view.findViewById(R.id.unit2);
        unit3 = view.findViewById(R.id.unit3);
        unit4 = view.findViewById(R.id.unit4);

        setSubject = view.findViewById(R.id.setSubject);
        setSubject.setText(pptdata);

        setLink(pptdata);


        unit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), pptdata, Toast.LENGTH_SHORT).show();
                gotoUrl(u1);
            }
        });
        unit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), pptdata, Toast.LENGTH_SHORT).show();
                gotoUrl(u2);
            }
        });
        unit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), pptdata, Toast.LENGTH_SHORT).show();
                gotoUrl(u3);
            }
        });
        unit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), pptdata, Toast.LENGTH_SHORT).show();
                gotoUrl(u4);
            }
        });

        return view;
    }

    private void setLink(String pptdata) {

        switch (pptdata) {
            case "C Programming" -> {
                u1 = "https://drive.google.com/drive/folders/19dInLzM8e1M9zmMZi52CDT4PV9stFHbI?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1hQ12VYX6tk2eTTw2lyj4SKvgtYVBh1DO?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/144P-UzKdmemBrV7opqI0bfa9X7PnkZVv?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/14nN_Crs82EWvAwu-nsFwYTW-NaPOUZRr?usp=share_link";
            }
            case "Digital Logic" -> {
                u1 = "https://drive.google.com/drive/folders/1OCHeEQfoPHgXsOsucQf6OLOfLilHR-sn?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1rOcVtfv0Huw7-7JtZ6tMb5s2Zezkwe8I?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1csj7nWr6vabidBz70FqUEG7NJtPXu3m-?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1LSJ5eShq-EmeBs16jXs0sslKhQ1tBv0U?usp=share_link";
            }
            case "Environment Science" -> {
                u1 = "https://drive.google.com/drive/folders/1uSmMWRuCjcFQiE4yIc_vlDClpKkR6x80?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1Lhqwc32lSU0Qd6cdTaNtWsKSPSEekD42?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1suPJsJXq7bzRenTSesITxeqh348LxAE8?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1WdSIka0BqRo9sXHqHowTgKWtqlSfsedc?usp=share_link";
            }
            case "Principle Of Management" -> {
                u1 = "https://drive.google.com/drive/folders/1uWOM-FNV5xOMuZQcgKKoScmkRTkfghyK?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1FsfpAAIMCy4wk3Y259A4y7Dt-POg0Cs0?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1lcsaZ8kgbFXlBNb1hgizVRv4NZQMBJaV?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1pz9qnNvOzc_aQkgWMNM2W3kxA7SphM50?usp=share_link";
            }
            case "Programming Using C++" -> {
                u1 = "https://drive.google.com/drive/folders/1Dz8OdmmP2kbcTj9lmWSQfWa579h6Pjjj?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1vCP2P8QD2fXFhZ7hIEBhZb9nr74UGwJA?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1HDCb6njQZF_7M0k3O37Ch4Q1ZJjwmi1F?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/14jB1vj-rR57SAWX4-jYsv-6Jg4G7JkYu?usp=share_link";
            }
            case "Data Structure" -> {
                u1 = "https://drive.google.com/drive/folders/1tPTOasoo9GQjF6tjc1VSZqGT5wgT9cZf?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1XtqID03qT04JaQBwL6dDY2s4q-mG5V_V?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1XkejFBumOHZy_oWqWuzNgefg5Fk3L2He?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1kzZuMXKgkJHrkMdZEVxSgye3CzakAm_u?usp=share_link";
            }
            case "English Communication" -> {
                u1 = "https://drive.google.com/drive/folders/1WwkNdM7Ilx-r7wj08Ue-uYMnVWDme_dd?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1SJXc4Q-Kob1dMKjDmrSOAWlTWA61ID-L?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1nG31rVDCE2uJu5-NVYkiZn20XtOedtoL?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1jjNNOuzF940nemWo6L4rZm_1sLNayzfU?usp=share_link";
            }
            case "Statistics" -> {
                u1 = "https://drive.google.com/drive/folders/1gxThCMptM2ZrqaGOgbaUj3VQduAsVTbk?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1rcsHgsyYLUQD8gKA-UAbgBzTNggB0Yog?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1rSjkvkFErJZCHKQrJYNPdXOTnnIqmDSj?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1UZpTNaZxOuHciKSRJPSbAr6RAonRbnOT?usp=share_link";
            }
            case "Java Programming" -> {
                u1 = "https://drive.google.com/drive/folders/1T70vdrr-cYIaI6DBUE7nsldC-ScicWx0?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1YLiz2v-jPW2xOsOtIw43pQWUzpL-tGFc?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1PL1b96TLvwr7r2I2WzgBQ1C5tjhe8k9f?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1LHa7bBGhxFj266cUFBhdBzhWwkn4-8EB?usp=share_link";
            }
            case "Computer Organisation" -> {
                u1 = "https://drive.google.com/drive/folders/19bj6XonEbll6ZSncjId3KHopnv54XF5W?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1fAo9-3q9DogX1GK3J3n69OqkbZ2Q1hgK?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1FfeAh0pgtZ8Mr4yZFtFGeFFBvOqy8o1K?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1ZvQuxxyef85N7utzAIyIpv28_N1TSSgx?usp=share_link";
            }
            case "Discrete Mathematical Structure" -> {
                u1 = "https://drive.google.com/drive/folders/17GTp3oYsr-tjctiEg1tXrB9EL_8WpVz1?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1TPO0btgeL20FKwABczI8Hvx4kT79MTvo?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1g50QGpYJlvCHR3dhvbB_AN9hXg-OW3ay?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1XJaHU3tbegfhSZla8kailoaMkYo89v0B?usp=share_link";
            }
            case "Python Programming" -> {
                u1 = "https://drive.google.com/drive/folders/1RU7NRakEbKHEGj9dISk4kAVvobMZDpXc?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1ZEZLL5O01RYxvTChrpFvXVS80kTFFY9F?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1N-Z9cQshg537o1_xq7wBgYvxci7murXw?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1CKXkCN2E2ty1Iog9CPHmybAXeC2LGUVG?usp=share_link";
            }
            case "Bussiness Accounting" -> {
                u1 = "https://drive.google.com/drive/folders/1CGer098lYepsAAVD9sIvOK3ZWRLtQyrB?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1SinNKYNRTe0QfVc82dCuwMq50ZFRNFAW?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1OtoZqTktScUlmbTIiPYflfWnvPsXUP6y?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1e4QRNOKyvBMif6u8zStZ6KHnJPrhAHVD?usp=share_link";
            }
            case "Operating System" -> {
                u1 = "https://drive.google.com/drive/folders/1b1qF7irZLUSW_az5DYz-6KbPWEoufoLH?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1giOos26p3iTKLI-4EYLEeA1496ejdpWG?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1QQeuVpJeJrNkJQNfrSE6qFzVepE4siS1?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1EfHLVwtJt9hH3oigBmse3JIzCbP6_NFr?usp=share_link";
            }
            case "Database System" -> {
                u1 = "https://drive.google.com/drive/folders/1Y363Vo1gZ7U0bgG0Ti2ciNxFlrz8qzVI?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1BViJzibCOMkP3GCGPybGpdYnJAsTT5a3?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1ZNnCvgEaXGSDH4epYPgCmgUcog_P5VLe?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1jdMOMyh7nIEncOMwmfMv57za2_Ck4Wjb?usp=share_link";
            }
            case "Computer Networks" -> {
                u1 = "https://drive.google.com/drive/folders/1m-DWM9qkWhF-uZ1ve1hMbcSqUl3qf_yu?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1JpgZVYfhcXXZ4UZE0wVe_NqufT2Xhq-l?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1p8BF9oH2CGGITpp2fsrhp7oEyTSqM3le?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1qnJqIqnEqVSuuK4FJf_8waBe8wfdqRYP?usp=share_link";
            }
            case "Android Programming" -> {
                u1 = "https://drive.google.com/drive/folders/1Nt65x8IFr4t6LYvMPSCiq4oMejTPykhr?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1HiWHW76qCTpzOIFc1YkG-lqNFft70MYL?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/123FUSCqL24g1TKCkOoRUCOFX4UCC9FOY?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1mkPuS0d_Nb7BjUcgzrqn44HnKBcwFxHV?usp=share_link";
            }
            case "Bussiness Economics" -> {
                u1 = "https://drive.google.com/drive/folders/12KGXWO5MPtMjVaHboF7vr1R62kY9A1if?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/12hz-b-VP4G39864eoil4f8UPd5957vGi?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1DuwTvM1mTModZSNd6BQZXjL2FlYZi7mT?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1yTfe8-sR6NRFPgWRzQBtthaED5l9b1U2?usp=share_link";
            }
            case "Unix" -> {
                u1 = "https://drive.google.com/drive/folders/1h5GlUmRG01hdaI0sE-zZZcjHfOWC0_Px?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1M0-zhzmXAPeBvtFENWn04wf9_Dqy_5Og?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1hJtT1NGyXkn7Go-_GT7O-62SeUl8FabI?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1ADG420NJcOtUzV-jly8u-cQYgGgdbFcH?usp=share_link";
            }
            case "Web Technology" -> {
                u1 = "https://drive.google.com/drive/folders/1blcFs5fvD4dsXliWuIZon32vJUbn_zoL?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1UmRAzync2YtEG9b1Tf07ajlpgw5bM49R?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1rQgl9RGwun7qGMp0tRlzaSMjZAEL21c6?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1p35bGPFU020JNoSW0PDmfUBAw_Rhox0W?usp=share_link";
            }
            case "Data Mining" -> {
                u1 = "https://drive.google.com/drive/folders/1oDTnUI1Cr-M8b_mT2Y7iBPxOPiqMAVwc?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1OPju99yPkj3ey10qlMpb8L4kcPn_t70O?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1CUL30uq8P7mH4pIp1aa6PKXKSoDMTqJ6?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1UmzvNJsQ2NTOP_XVCLgmAKk5oKpUEoNu?usp=share_link";
            }
            case "Software Engineering" -> {
                u1 = "https://drive.google.com/drive/folders/12X3rmN99QUjrO71iju6h0LwdELuTr5mC?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/17tKkmKL3pxzvdBIk32WzzGFmEsgSCv9M?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/199WOdqgJhsG_lEU2R8SVogA-XKTWmbuQ?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1KrvRqOicpX0L55fHD4Nn6ngxIeRoIeQy?usp=share_link";
            }
            case "Data Science" -> {
                u1 = "https://drive.google.com/drive/folders/1HsakqGLMbTh0AprwUq-3JDx3qxLTPqUT?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/17evAbHQuJUfGWh-sto2hJev4GFr8oVOj?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1EuUUJp8V_nxM8I9HkmrJ_toBD5w4HiJO?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/10imQNwDC97a7rfmLxcjUzg-0y8vHjoaJ?usp=share_link";
            }
            case "Computer Graphics" -> {
                u1 = "https://drive.google.com/drive/folders/1PikTki48ucG2COvZMU0nhHHYtOGjJ1XC?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1EVlI8a1Asmk-oZdVs6qGPRoDW8lqmZ3h?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1lHovS95tp2S5fsruWvyoVCY7ZS9yVNoy?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1xPs1Fc-qeCYMWN77Uy5ardotFfIdrGzx?usp=share_link";
            }
            case "Numerical Technique" -> {
                u1 = "https://drive.google.com/drive/folders/1VE_cQ_HugKMzvUrEyXGZwgqWd1exq5x8?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1q9SNwYr92QKN8dji6rK327oYl_9HhFOt?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1irOQ3Y53kF33NA-HJlbQ1i8CxBgMP-l6?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1HUDSpAs-NzIoFaIr5sVRafxH6iXOAHJm?usp=share_link";
            }
            case "Mathematics-1" -> {
                u1 = "https://drive.google.com/drive/folders/110bZ2ayU3W9YNLL_O3PP00kvsnbPR_WB?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1aHepXpL4P48T6a3sKZlLwL8ihuSw85g2?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1oBebYEgwPKD-6iUI_JIWJPdIAMJpQXEg?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1PYCYNrqOqi817nkfYX7eAct0axZVtG0e?usp=share_link";
            }
            case "Physics-1" -> {
                u1 = "https://drive.google.com/drive/folders/13vhB-sSSqYf9BVttEoawrc5iIwkRHD24?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/13dhdZF9CMXyUsloGqT4EVFmM9UxZgAYt?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1m192eb0x8VVTsq00duSpGBgxGWY5HEVV?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/13fM9kolx7sILmvHlDPMAxGINNz-zKSCf?usp=share_link";
            }
            case "Algebra" -> {
                u1 = "https://drive.google.com/drive/folders/1K8r-K9QooOY_IlHTyHSn24iG_8BpspbO?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1l-gkKwGWAesL4fD2qempNX8z_WGSMIWl?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1R8mVJr5hdgTHVLKjlntercJKu9rvRmBA?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1V_FrT4C--fH7_qQ4Yw39P5Uq91MlZbHe?usp=share_link";
            }
            case "Physics-2" -> {
                u1 = "https://drive.google.com/drive/folders/13jUtr5s-xer8XVD2JgNjcwEWkkgn3eaB?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1iYWJ3pySrnKpX-7kV0j1so-aTYqWYST8?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1rChOEhTYt_JiCy0hvS5QCR5CdZmxMpL9?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1eNTmlprUA_TN11xnt7gZh3G35v-UMtsy?usp=share_link";
            }
            case "Algorithm Design And Technique" -> {
                u1 = "https://drive.google.com/drive/folders/1JJHcf3WcWt_VfruNuWys0EJD97p7ozuf?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1K_bPaephRtzCKm9x6Yy5r6LSZP3PNL_-?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1ZwdTU_qTDvYnb6FHt4kfKGVE9pbpnSjM?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/100HE1V4xyo29XfMYXRw-idVCY0WeZMHA?usp=share_link";
            }
            case "Artificial Inteligence" -> {
                u1 = "https://drive.google.com/drive/folders/1K4oR3B2djC0sXW_GwBrZ1j4239rvSiEN?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1DN1p_Q-J0dskzo3kdpqIk75dO6SMYdZP?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1GvhN5BSSisIlJq6f_him6kaX3Q4p8Zrn?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/189YVi3ln1adr18egSalnB6xYJ_RndFyu?usp=share_link";
            }
            //BBA
            case "Introduction to bussiness" -> {
                u1 = "https://drive.google.com/drive/folders/1dqnDhELZQZ-8e-EEl2ePU7vmITN32W7j?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1RL2Z4xei4TpbMYLOveKcNpfTsu3fPcTc?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1qAFaU2IGYrNLjeTJ-Xmy19I6kBeoI_ks?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1ETwBr4iccJpVP0QvPTbArPoL1Mk2X29w?usp=share_link";
            }
            case "English Language And Litreture" -> {
                u1 = "https://drive.google.com/drive/folders/1hXFEtaW-A9AsqEZHqMZiNiKSesWQEyMF?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/18eWdWHSKbnCFknK9mTBPBANhKDDO0lq5?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1tppF7qvLnwDpo-1SHAXfT8EgKmTWydLb?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1rtY4ciYbSoKY3IuOUWKDeLJ6lSjxQhEk?usp=share_link";
            }
            case "Basics Of Financial Accounting" -> {
                u1 = "https://drive.google.com/drive/folders/1-I5YLPfcyiXkumj8y409XOl3lf-W4TWn?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1B1aANsgjOhMdPF4tOrnOypXiSa2mL_Wm?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1gyfSrZnozellff-Ey2miq7GP2LPdJkM6?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1lfKTeBKE7dzlSedMrdVoPFyCJmIJBzGJ?usp=share_link";
            }
            case "Quantitative Technique For Management" -> {
                u1 = "https://drive.google.com/drive/folders/1YOw5KhdzH4XNw1lZrnxp-g4tsy8QhxCK?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1ZxLjlSL5p1gBekViaspklUiYTEFua0ZR?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1jFO624uVxdLE-RGOcB9HDCf-yIX_Khch?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1DO1rk-hyaO7ix1qRpEo1kDBu8QiVDU2P?usp=share_link";
            }
            case "Economics" -> {
                u1 = "https://drive.google.com/drive/folders/1o0rGu8KYDeh3HIIbEdaoiQJMBqH-CepH?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1BxQotFylzjzaCLpy9hwQ3qgieKJSNflc?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1i_pfS7hjbwv2SYJDgEfNwuK66t95oHdg?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1spR8oQuUiVi6MnqOdscvC7KZ7Vgpwh1u?usp=share_link";
            }
            case "Management Theory And Practice" -> {
                u1 = "https://drive.google.com/drive/folders/1NrdTax6AT8X1fgW-rSVntFfHhF0ZZZmK?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1YiBahOSZFZzOAo9su68qwqaJ4st4CaEA?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/19nNQT-hBzOpr4jX924jWrbjOie0xjKGC?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1sTjIhf1zHpaKk1Ytl44YCl97SGpBT06S?usp=share_link";
            }
            case "Cost And Management Accounting" -> {
                u1 = "https://drive.google.com/drive/folders/1_0Ysei__mq7Kzgci-WuFnJme5sUCK0YH?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1UYO8ayLzzCZiiuggJ8fItvyQWCALcrwo?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1aTaGqfwwjrzAg9qtB0dzKpkGk9LZ-jqx?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/17eOj3b_89i7TQg_GzwvEtyZzZ7yP9v_U?usp=share_link";
            }
            case "Computer For Management" -> {
                u1 = "https://drive.google.com/drive/folders/1ODlYQj---Bv6BOumDPKZ4dLqtta85Qcf?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1Rq6JFUH5sf1JV-1CgmQvUvbCSlp8j4jM?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1lv0XFYPmzn2YT_i4jxdY3MRme-7U2BQr?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1g5J1YZAmsQ5TqreppPmIzv7yYLytvPPj?usp=share_link";
            }
            case "Pshycology For Management" -> {
                u1 = "https://drive.google.com/drive/folders/1A_kOCtNCgP0r0HCbC6WnpuU4m6V4kAZ0?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1kAeclKZBkkp_kU3-qGjbuVujY9l5EdzX?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1M38q8-cNXCl-Tnu0UahlQ7Fi0N2q1X6J?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1Gqyvh5SCDl5bjVtwGSDjl9IVbkniukdb?usp=share_link";
            }
            case "Business Ethics And Corporate Governance" -> {
                u1 = "https://drive.google.com/drive/folders/1BSJl9pL1m6cHjWcnFwmRMJNcVCd-4LUm?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/17-BoNvZGrN-bhD6X0-KtkrZVhTVK0p-v?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/11Az8QwfacxOGudpBs-VCdrgzicOae-8C?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1rdZxTScidcc4jzf8mUhtUUgJ-4ObNujP?usp=share_link";
            }
            case "Introduction To Banking And Insurance" -> {
                u1 = "https://drive.google.com/drive/folders/12rqS-pc_9muKxDFtjkVH_j44yAtIU3Io?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1_m2uquDYzD94TZNOYKOHJhmKrEUnuTmo?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1LzCg5yuzHNNnfutR8_iS8en1Y5TtJHsK?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1LzCg5yuzHNNnfutR8_iS8en1Y5TtJHsK?usp=share_link";
            }
            case "Bussiness And Corporate Law" -> {
                u1 = "https://drive.google.com/drive/folders/15M6m800qS6TMgVjAJBSwDEaDL0cMHy4x?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1HLK0d0PXCXbNOE1L2BB09ZDEoAFLxq36?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1GgmGVoBOdOiZ3PbZvSXCWLZ9RO12RP2u?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1Sof6JQenAr7wB95hJ4I-Spt_irmyhxys?usp=share_link";
            }
            case "Communicative English" -> {
                u1 = "https://drive.google.com/drive/folders/15Ild5hXxZNdh4YAwvww5Hg8jpJ8RVV6X?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1X44qltxG0wZ-nBT2FnSxNdrM_kRa3x5o?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/13pBXDiD6___3uoNNneBrsvxhTf60FhuY?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1E7fZDdYzQfbNgdCE3ULI0eg5mlr7fzbp?usp=share_link";
            }
            case "Finance Management" -> {
                u1 = "https://drive.google.com/drive/folders/1UlXsvDjjlu32bLuM5z_KDfnuPQP1SKge?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1pDdNVd2-qwxpd_8ypASeHVmZlWFm1R16?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1S5oNYmQanMgMvwb54fL1fHyUpsfesjIo?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1AVT6nLoQphTYrqq4K8YUQ9QX9s_HLgYE?usp=share_link";
            }
            case "Marketing Management" -> {
                u1 = "https://drive.google.com/drive/folders/1IqVxcZHSDtkkEG2uNek9EEjLL9D0WxdR?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1UC8K2CGlrftiRTlFPmcSHATu6f5418qr?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1XQli2pU5t_YzNAAG7-SDSemcplHrK7JX?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1h2dGxJVD0KPgPTAATXWYD5QTbl20ywlq?usp=share_link";
            }
            case "Human Resource Management" -> {
                u1 = "https://drive.google.com/drive/folders/1NimaH1XD0FY4taA1JkMD5qSCT8h3gkP4?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1iV5J4Pi6nQZEBnQxBRQRlUOpD6XNO4mM?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/11CZ4Jvu6uJApWc9OTVy5z0558zeIf6iw?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1jp66bGsspyBpQ7nTDmt_AIHCW-GY18wm?usp=share_link";
            }
            case "Production And Operation Management" -> {
                u1 = "https://drive.google.com/drive/folders/1GVRCvQXllApN3MPhk7uTcZspOJpboZw5?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1auHCXD1TLwuFqhQfZRZ6bIlJYB5_B0Hr?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1MlUu9q49xZKuARYGOKtiSVJ2MTwWdtHf?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/11PFBKL1c5JdSwPTpcp7uFBpHta9T8J5i?usp=share_link";
            }
            case "Environment Studies" -> {
                u1 = "https://drive.google.com/drive/folders/1G9XhQRwShvcNySWS_4COr5Sc78h4U-sh?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1XeCXsKkgcMyi8oS7OJxw3lCCsOQlTTAb?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1NfSLuvi-O6jWR6k1zPEfQqsxNf6e7bqR?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1vOaVQvB16v-jabVjTMWBno5IwiTFCzp8?usp=share_link";
            }
            case "Organizational Behaviour" -> {
                u1 = "https://drive.google.com/drive/folders/1YQ17-NkL7XUnDMuCXuGrbBNmk2EjqiUM?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1z90EAsHJc-yamU6gXcyXGnC5LnwoFLt7?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1sstZTTTfkyCCv_c1rluYSddMx-DfI3vd?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1YMmGqFYrEhX7vjaEZdrxkaBn8kEIk4yC?usp=share_link";
            }
            case "Financial And Market Institution" -> {
                u1 = "https://drive.google.com/drive/folders/1rB0IwR6sdfPVGrsbufRri0XRtOHRfgRk?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1k3_rTbMrvQ3lsNcCT2TeWyf2pss1PvRU?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1xTZIH9AD3CZ6V2P79NFPiHfSfJgmi85g?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1gAn9AlRw0JvMi_gqiyh3mPgeOUbaPsP8?usp=share_link";
            }
            case "Advertisement And Sales Promotion" -> {
                u1 = "https://drive.google.com/drive/folders/1GafaaoM89AVVM2DNp0u7ypkgT1aJuUb9?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/11-UH26cl0sZIlAWgrNB5FUBeQHz3kNzf?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1IX4Z36S0s6fr_ModyuvzuOzoP0GsPTRi?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1d4A-VaJZ_uIWzDWl6BDjPU5hI3b0AI5U?usp=share_link";
            }
            case "Management Information System And DSS" -> {
                u1 = "https://drive.google.com/drive/folders/1FtF17XbKbmGC97BcYVqiZqTbgFe1cvs5?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1oXMQefBzeJC99_xZwih4sX1KiB8X1m4o?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/111Z3KoDpqxdp7XsJkBa-x4XIShwjTftx?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1-socibSu9wKtoaIuSCf8levRyxQ4kDWe?usp=share_link";
            }
            case "Indian Socity And Culture" -> {
                u1 = "https://drive.google.com/drive/folders/1pBBKzuJRXYIKzXD1i8ZtBrXsE3_27w9h?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/11nFEyRdK1khjikeqnD8PYW9Y6OzswfZC?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1aCUxT6uLcci60GjinTtnKeDWLvNQYId9?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1ZFMWtGsXmW5ITx6wdFAE0F38LUx3YuKB?usp=share_link";
            }
            case "Research Methodology" -> {
                u1 = "https://drive.google.com/drive/folders/1ObPX_NaL3MJRecN54o98SHmIvIspB1bf?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1CsFsWTGMabyQkGwzV2ZHe7jlmPa4PtYX?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1Yi6qPQ0BicVKMyZjaigqzYMjDETlr2JJ?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1tOPnDU1Kcs-8-zlCv3Rl1csCRuYSrNp-?usp=share_link";
            }
            case "Entrepreneurship And Small Bussiness Management" -> {
                u1 = "https://drive.google.com/drive/folders/1ol9fFqB2GOqKFWBUyAp6jJbCXZ0SH03L?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1hFjMgdjLrH7oJ5E9aYzpNBFl96iXKHY4?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/19-CntvtHodbKm0c5xA0z0uwvJIPDoi3m?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1BinVhzUzIMbOqc_mCY2vZspqpnUQ3eOc?usp=share_link";
            }
            case "Organisational Change And Development" -> {
                u1 = "https://drive.google.com/drive/folders/1uoKPFQJSRGKYaPJTYyRDk1yYDwCNCzK0?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1iTyBtyDVzU6R9UuX0hL9VIuRWOLn1xPF?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1dG8wgnlzQ38rZ2a38UVs99eJ59ULQn-k?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1dW2LzD5HKNubk2B9NmyhhhtGtqkjB9Sp?usp=share_link";
            }
            case "E-Bussiness" -> {
                u1 = "https://drive.google.com/drive/folders/1mjohWVEqGURxj3y3h_F1wGejHoP_mpRK?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1fbF8zZgSGUbRrgoTI8sTg2qptuO8c8nx?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1XCnFAVd_6wbg2hO6pk_ezBPIvvQmpCet?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1oitS6Vad8y0IvIIH_WJp8zW5B5T264sG?usp=share_link";
            }
            case "Dissertion And Viva-voice" -> {
                u1 = "https://drive.google.com/drive/folders/1HIClPsbNmszWctsTpv2_pBrrhuR5yE0_?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1m_yyfjtjLhIxq8DKBEFaMif6drhz7h47?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1XH7_lGMmHyBril548Q0YbYwqe_RR7vtz?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1h6Z9uCValt_qTvIWzNHjqDiBKwhBdMNR?usp=share_link";
            }
        }
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}