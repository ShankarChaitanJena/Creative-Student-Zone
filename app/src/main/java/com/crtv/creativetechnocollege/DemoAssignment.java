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


public class DemoAssignment extends Fragment {

    CardView unit1, unit2, unit3, unit4;

    String u1, u2, u3, u4;

    TextView setSubject;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo_assignment, container, false);

        Bundle bundle = this.getArguments();
        String assindata = bundle.getString("bookdata");

        unit1 = view.findViewById(R.id.unit1);
        unit2 = view.findViewById(R.id.unit2);
        unit3 = view.findViewById(R.id.unit3);
        unit4 = view.findViewById(R.id.unit4);

        setSubject = view.findViewById(R.id.setSubject);
        setSubject.setText(assindata);

        setLink(assindata);

        unit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), assindata, Toast.LENGTH_SHORT).show();
                gotoUrl(u1);
            }
        });
        unit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), assindata, Toast.LENGTH_SHORT).show();
                gotoUrl(u2);
            }
        });
        unit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), assindata, Toast.LENGTH_SHORT).show();
                gotoUrl(u3);
            }
        });
        unit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), assindata, Toast.LENGTH_SHORT).show();
                gotoUrl(u4);
            }
        });

        return view;
    }


    private void setLink(String assindata) {

        switch (assindata) {
            case "C Programming" -> {
                u1 = "https://drive.google.com/drive/folders/16_M9KFjCym8L2-s4wvbmIBsl3JUdzQ4d?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1DoaOEYMapQ7KARdYWcVeKXeUN8p95zSh?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1IIbq5akbELK0MroXWiyLVA_1_6r08w_s?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1dIWX4boaknw0GOAmZPFzKUSgqB7luSWI?usp=share_link";
            }
            case "Digital Logic" -> {
                u1 = "https://drive.google.com/drive/folders/1rddYAnc8jr6WQ8TRKHjyrlSnxzFRt_4G?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/145fBkEvtBx0-ahEJ7yVTYX4wKCyLH3zp?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1KrhwdK6FeDjYY5aPqVyymrGNwQB2Mjty?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1CiHwcl702M4d6M7XZEXjQ977b5jJIi86?usp=share_link";
            }
            case "Environment Science" -> {
                u1 = "https://drive.google.com/drive/folders/1sDFLErVGfMh4CuioIaUWg_ZwPoU_Jf6H?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1xzvROaJgrcYvsd6EfqAM8ng-4MH7JcCZ?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1nFXe5STL6P8BKBJ77R4fAi8WxyOCcJT_?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1_78xWs8VBWQkzJrzpJt_A7dwOjVsIpQV?usp=share_link";
            }
            case "Principle Of Management" -> {
                u1 = "https://drive.google.com/drive/folders/1LCEW4Ov8lrnWkmcqXvcLkW43LhLw2CRv?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/18TMR-DtTq48Bit8ANq1Sg8fS9l9ng4Jf?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/164wGMpO8rZtMAwp4FKboDxQCL9Tgn7pL?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1_WzyIU8PdskhQpvDGLe9t4gWNoieQS6B?usp=share_link";
            }
            case "Programming Using C++" -> {
                u1 = "https://drive.google.com/drive/folders/15RFoIS0lFwgB20AEmRN5jDPiT6JNtwz4?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1pXlEOXjdDKlbMHTs6E6DyfIqhWCMksRK?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/12uyOa-LnDFqcBa1AF05EFt95hfxRzVay?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1gZx_lzKlXcNbCxaAhHFGvz8e3V6CRxz6?usp=share_link";
            }
            case "Data Structure" -> {
                u1 = "https://drive.google.com/drive/folders/1BmDND66kCnseTzdQ8ye1a1WPmagOSnYT?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1YR-eJeYGBDa7p1rSwkqUSQTPZDAdPL6-?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1etsu2yHTBmNl1JhG4vOa2U5-5hLdGmJD?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1yvdnt9nCGFzUUG0oAvk2nDuualSZZpI6?usp=share_link";
            }
            case "English Communication" -> {
                u1 = "https://drive.google.com/drive/folders/1Wps8vkcgK8bf4yClD14UxBzm1CiQXrX8?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/15WBv40dHx-5Uzi9vFLJqjuklYBbtunNl?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1jA_KBPugoTdm31VO66h8pw1licac0s4M?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1X19YvFkVof-fZkHiByTARivTLJ7iWSJT?usp=share_link";
            }
            case "Statistics" -> {
                u1 = "https://drive.google.com/drive/folders/1Ozwrjnspr1s2_SKa97uoW4bisJufmAs4?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/15m8SHnU72L02qWNQuiuXIiOE8Ej5FFsC?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1hQ-U9dOu4imc0eCY6HLDid8Dy42sTZ4l?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1bka-ykePPinOsXjJEnjGSmEyDr2vF1SS?usp=share_link";
            }
            case "Java Programming" -> {
                u1 = "https://drive.google.com/drive/folders/1TF2waGtFjw3ZEEsHuYYyC7pypN6i_bO_?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1CAOYrF6rxLwSlMLbJgALOUuXOXjrSTnc?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1Ux8meMpnHqf0w7i3nyDnqe-1YwpfDgv3?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1WZ_v6iuukP2R9mLac7vd-zpgSRRLIKFH?usp=share_link";
            }
            case "Computer Organisation" -> {
                u1 = "https://drive.google.com/drive/folders/12ybCEAr53MuU3rYEN5qpywizEtsClWT9?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1nQfBX64tmnQtnvWgZB5SKc8qx6EBYH4k?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1UXka7ZlOOYwD-xKkb00QMWprShAPyp9V?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/15OLjFJhlT8JBs9x-wdPqZR5DaMGoYvvk?usp=share_link";
            }
            case "Discrete Mathematical Structure" -> {
                u1 = "https://drive.google.com/drive/folders/1YLPqb6qLbH6jKPQkvmoowAHL-hQ9OQbY?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1zOr-qmvJnMhLcCG3h0-HOVnH2UsO2xKG?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/15Tz7FD5bVoiTEuDvpWQBBrWS3Nk-YQ3n?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1nCh0dRfAfZOK5K-XAiUVoB8h5U7bYc4J?usp=share_link";
            }
            case "Python Programming" -> {
                u1 = "https://drive.google.com/drive/folders/1BT16v6nlMxmSZ1RxcingQRo8XboPBSal?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1TcQ9Y7lPEIjYbBzHYfxXL5APInLWvIyr?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1-z9XpVnA7nWjGnsOTotcp8qVkeuNH2z8?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1ZqaaeuwrsKedwDYVxfRz1H5vLvN5R9-d?usp=share_link";
            }
            case "Bussiness Accounting" -> {
                u1 = "https://drive.google.com/drive/folders/1QpywW-w2zGNJL05beiLJSNbFuZqGRGeY?usp=sharing";
                u2 = "https://drive.google.com/drive/folders/1uZSwEKV_7B96-x9lDXtQLApl5TnnCYNa?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/196LYs34-EYKs_4fuurMxMXx7RspbTSuF?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1vHeXRgmwme3edKQATYu6ginHDCjnTKox?usp=share_link";
            }
            case "Operating System" -> {
                u1 = "https://drive.google.com/drive/folders/1ZZUTfmwr18kctr0ztbn8HgBmpFo5T983?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1pRQVDCbaLQr0I9v0CX7jjpR4ar5NLqZS?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1C_e-FW5QUvo4tc9xqE1JlWEh7L3ykSF4?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1tY6t__kpWbGcx8FmavmRHFL41Wt64jP_?usp=share_link";
            }
            case "Database System" -> {
                u1 = "https://drive.google.com/drive/folders/1ojgc_dLUFaQDEmZUV_mviRc5aiMdID8J?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1JK5jzsYjx5LOU_DNmFaRZd0W1M2BH6Yr?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1xOSahr3anmMKreBmpL_1ZDEtRIaAMCVv?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1CRF-tYLt8k8yPgNL6E-8ICo3Np3n5zuT?usp=share_link";
            }
            case "Computer Networks" -> {
                u1 = "https://drive.google.com/drive/folders/1iMYKLDJByItixkQx6zeGRzir76Pswbn2?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1rUge41T6wY_cCp0iPozF1BiSQWFRfRR7?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1s2kweRBg8-ii5qsF_e7smlFFZQcDJ8IY?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1zYRC_b4topcb9e_-CPxS2BQvYUOkqZtC?usp=share_link";
            }
            case "Android Programming" -> {
                u1 = "https://drive.google.com/drive/folders/1I_gW3alVRzxmYdJ4scYkbJFk3H5HuP6X?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1xzJI1-p3lnzeiFU8R_bhoR6lXY2cM0UF?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1OrAGsBmuMCGl0TwuMR3-DoMPDIIu9WkW?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1eNDa3fpQFvKaxbHIHDyiYXf72L3rs-Qr?usp=share_link";
            }
            case "Bussiness Economics" -> {
                u1 = "https://drive.google.com/drive/folders/1WmD0L9rywMY70yaXbdwI7wNexLr_N9wx?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1FCmdfyUPy3Vmf2OFoQbSjffZqqtwHV1H?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1aDxSJAJ3JCtb4DsGRQpaYhTT5aet5ggy?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/188rDt2rR_1KrY6JsToPUM_BtvBUM5N1S?usp=share_link";
            }
            case "Unix" -> {
                u1 = "https://drive.google.com/drive/folders/1qeWBvYVj0UjeMTT0ZKnHPnqY5S055YCv?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1VedyHQRBDZLbzDHL9-KSZxiIXlhYAxti?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1-nePwOYUjBeovqg6S-sYJ0js0U3ibPh7?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1LHl-u8pawAPiTzBZ7ct5nNbWep5mRd6B?usp=share_link";
            }
            case "Web Technology" -> {
                u1 = "https://drive.google.com/drive/folders/1sTEe0IBgqC45Isnjsem81HTNXFz5EH-1?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1J2B-sW0tsMVY-jeWm3I3P_M3VksqooIy?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1OUx21xrzHg5whQJgi4Noh4xD0SoDuX_0?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1MjstbDcHUImbstUFi_doSRS4HJC71S-3?usp=share_link";
            }
            case "Data Mining" -> {
                u1 = "https://drive.google.com/drive/folders/1w95BaO3qpHFa24wIlhFQb7Pnpvh_y6jr?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1HAphlNh44XCFLTUU9srM9XA2Fj8szGFE?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/11apCJxRMMpMFTI9SdZzLMq3qTlBD1esN?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1zP1vXcg0BlphNJYOxRTczh0qCeJvS0Yi?usp=share_link";
            }
            case "Software Engineering" -> {
                u1 = "https://drive.google.com/drive/folders/1aogIOCWOJxkZVNnHrixlsROqqaKK9iR8?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1pV1FkuTALrnyMX5m8d6FwEYOnrlrJZ1D?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/18NdS5CiD2NGBAg2HeKNl3aHW8jwTNyPM?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1n99UmovUd3egctD2z7vICoBOnFQZWwDd?usp=share_link";
            }
            case "Data Science" -> {
                u1 = "https://drive.google.com/drive/folders/1NZP1HSEAYZOZl-VtHIhCifhy5nV_fhxN?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1IwVcfaQ0fKlxgvbjsq8mF2YUdFvyWOuV?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1D_wqF1Q8pOJowP7TJviUfTq4SIBiPHwX?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/145sFsvzjF8kT8yuy9YeLYWI_lYiMYUua?usp=share_link";
            }
            case "Computer Graphics" -> {
                u1 = "https://drive.google.com/drive/folders/1epOK7IRTXNnOGnPDDnO4W8g45a_II9h0?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/19bFZASfQgifF9S6f2ADMAn23vySe15zJ?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1mJ4AS0ObWALtNLhYVwxbsPuVcPZY-JNA?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1WnphqUOBt_TztBNCkIhLSy-NQ9sOw-dQ?usp=share_link";
            }
            case "Numerical Technique" -> {
                u1 = "https://drive.google.com/drive/folders/1Xwr7DDrCPSf7PjJwMJycFGz6cS8eDTWg?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1s4HT6fAB98wHNY7E6v1-hXG6MQaV69Uk?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1i1m4NTTTImZjuCO2SJub8-s1x9EJ_7pJ?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1MHVxfa1_Lc2yikK9FYoDuCfa2ieAdTue?usp=share_link";
            }
            case "Mathematics-1" -> {
                u1 = "https://drive.google.com/drive/folders/1EmGbAJ-NSmbXEHIFSfWqGDiCtSoK4JF5?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1qfTrB-hoQ9_viy21K-il8B_tA2aw_-Uu?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1IPziTolbbyj5DsGqqNgybrQySroNdJA9?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1fa8-SZR_-K-uCX3orwBwde28M9Xfss_5?usp=share_link";
            }
            case "Physics-1" -> {
                u1 = "https://drive.google.com/drive/folders/1Sw0sWIHX8OuvPdm9fQXy2-QB5nzViknp?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/16pYHpm7wgIt0N03m9oFfzG7OtAG4NEVK?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1ykuawULrdTBKPwTWmGpJaIsVvNg9RXmY?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1xgnABtqxwtjD6hmOC_VN9r6YGRD1GfsJ?usp=share_link";
            }
            case "Algebra" -> {
                u1 = "https://drive.google.com/drive/folders/1q5XTItaYqnN8K39FN7-zMNPm0yjPVDnj?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1_vwbJ0eAOGUi2wpZVxj0jZNslV4GJhxE?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1dLA0LMDmk5eXBdB99ygLSQDH8MyDbT7r?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/10FXd0WnWwpkmV3MfmH8CFMMFcfOe-nNJ?usp=share_link";
            }
            case "Physics-2" -> {
                u1 = "https://drive.google.com/drive/folders/13Dsc6w6INd1hNPHyUM3wUOitPX27Szrw?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1y9yY03KKKvM_b5R_TcxLBlNeC1eUYDHs?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1cUVghv5WegDGw1JrDMemRV0IwftxoTmb?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1w4tSUp9QMcj-V8D524TbGzRnzEJfZ1tK?usp=share_link";
            }
            case "Algorithm Design And Technique" -> {
                u1 = "https://drive.google.com/drive/folders/1iE8T4ZFVZU17VU3Hi0ErHTNbLQ2Mol4j?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/16IQYfNoewVWAZE93sY_gQrKviUzVgtvC?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1g7bm9HE02hkZlgLXbntWJdLo8aGQDQtS?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1l4GVgmF5qDclp0vQcs1vnVWz9c8GCb2S?usp=share_link";
            }
            case "Artificial Inteligence" -> {
                u1 = "https://drive.google.com/drive/folders/1rXF0KjHO_ltj5HONESkvw21Ugqj9ZHHi?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1WD2Ikn8vLsfpdWtF4GshWVuGgT4iro3K?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1rx0OciMXsvhe1wbTQSJCUyjOF6icprHt?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/163s5xDF7bB8TGfGXNjJTJOVUbbDwIvhW?usp=share_link";
            }
            //BBA
            case "Introduction to bussiness" -> {
                u1 = "https://drive.google.com/drive/folders/1iKuAM5BXXHvyR60s_ISAcZNl9RLL5CnB?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1d743Hc6YFNOLo-MMNeuOiiA7cFc8DlD7?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1FD_lgJSMYfXjuQS34Q_cmOMwkyWcnngd?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1hz8UIPxBnyv241pdKZ-gD3HtXS8DFdUM?usp=share_link";
            }
            case "English Language And Litreture" -> {
                u1 = "https://drive.google.com/drive/folders/1uOiqijP5l-GuJFz4Zn2KqETDNRjYtkQy?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1k9oLOKse4-dLchbHU9VGnEtMQcZIi3ZG?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1M4qPkYnLfYLTAJnN5OaMfjkN8SF1xZKa?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1vyWOcU6URS3pybrgRnWXHjVKxShmccE7?usp=share_link";
            }
            case "Basics Of Financial Accounting" -> {
                u1 = "https://drive.google.com/drive/folders/1t2CW2ytVp2cbwG5T0AmxukBWCW9tuSeM?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1Z7Ce8C2XoifUcNdWnOyGbdpx9tngVAQN?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1x7X4JiHQSHg-oDtDNWZnrxmoD2V9RPeZ?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1xeO46aqzLtI5Pv9gL41wBliXLeu8cE-r?usp=share_link";
            }
            case "Quantitative Technique For Management" -> {
                u1 = "https://drive.google.com/drive/folders/1IkX87hUo1vHcoU0uskmPkcIQFHN6xcuk?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1UA19y-Jm1XLeBpPlOHcjZACjeJ7Xm5E8?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1jjwHOLYLUFREhrm_hhcQJ9VCYjXZ6s31?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1KNm-QB7C9IO7aG7awSt9OuNBKbAbCn_7?usp=share_link";
            }
            case "Economics" -> {
                u1 = "https://drive.google.com/drive/folders/1t3Qe4aDx3CVU2kzeF8aehTXefWSp47lI?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/16q_yTaFM1TbnPVpJfrSPoXII_VxBXfto?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1pxA0cXcopW8NPNpNKcUx7GVtsPIZPc_b?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1A5vo09IQvEebwd1cFhVXEFp9Kc3bbfWK?usp=share_link";
            }
            case "Management Theory And Practice" -> {
                u1 = "https://drive.google.com/drive/folders/1guis97aobchthyQ1nRRC4G_Y7ttvvUJK?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1UNV34XcmBA5Lf8sPyJ7FJTTAw-3IwhjN?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1Nu70KwiXiK0rgpkyznjWuc75XQdnxs0C?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1UNV34XcmBA5Lf8sPyJ7FJTTAw-3IwhjN?usp=share_link";
            }
            case "Cost And Management Accounting" -> {
                u1 = "https://drive.google.com/drive/folders/1EJti-fvZs65bilSDnuIkSjJ35A57hKuW?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1sce1Yrii8eJyCQPqwB3zhChjqf6LYAtb?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1BkWvXlyV4JDDUI4EhdOwhP0Nl-D4bmHk?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1LsB0SukUVwM9JVqJsYLb8ve7581TmTp1?usp=share_link";
            }
            case "Computer For Management" -> {
                u1 = "https://drive.google.com/drive/folders/16cgSq97mqb0iRvBRwQ_rnqKfHQVmOcEM?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/13CNwqH_3gLK9mGL175-u_UY-VyqQLwb3?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/13_5MH4Tv5ibbfZH33l_mhc7ucc-EeL4D?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1LO7JF0CfNL17r19D7_aybWm7Lez_szji?usp=share_link";
            }
            case "Pshycology For Management" -> {
                u1 = "https://drive.google.com/drive/folders/1iWHTtFuz7teSLXlt5vW7zBqyXTZGi446?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1Cgjh1IrehXwsQ5B7nMho_YLwMIxpVH87?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1v5KIRFlBA1GwDc4494p8kekWB3b8AXBx?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/18weh4N4iinPeUOKlXyRi8SS2CDyl9d-E?usp=share_link";
            }
            case "Business Ethics And Corporate Governance" -> {
                u1 = "https://drive.google.com/drive/folders/1UkAGaKlal43YQCm1B4bfsVRtO6kl4KAe?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/10dkGRRYjgMqysDK-7aaRfbgu0pC1Rq6F?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1zFZh23T6v0QEuKuF6MAmLi0lmF8DjyGx?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1uWDpWR3BoAI7F9yBSYZGiet9gMHQp0ps?usp=share_link";
            }
            case "Introduction To Banking And Insurance" -> {
                u1 = "https://drive.google.com/drive/folders/1-FdL_IfSe6NIiTCVgREsJXkLlMAB654b?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1dt0iEEOpx7S2V4yG_lrtggliqh-phRA_?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1oDyTbZVyYsEr2p6hyqnkJQpxQSqFI7BS?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1dSBWG7MrKBo8Vfa_GUl-clpqlRjimo3P?usp=share_link";
            }
            case "Bussiness And Corporate Law" -> {
                u1 = "https://drive.google.com/drive/folders/14XgdN-jARRekTlou3mbhqFHWaCc18O8z?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1WCBSj4AWe9tPgpTXpoBgYgM_qfh6kQ_w?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1Gl9VC2LVlldTU1yCinwG6pPMhayZ0ZX0?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1l6vOPCKM8qHjSv2v5JUk7KkFyv1M7B7E?usp=share_link";
            }
            case "Communicative English" -> {
                u1 = "https://drive.google.com/drive/folders/1Uwd72-9dzpESygKBFoamA6et7xvKULaZ?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1GyP1uq2dU-OUuqorVlEYgQIrdOz6_Qc9?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1tVkbhrGHq0iNFm2Byt35fkuEoZa_LCmE?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1SdFlqaonMoRHOSaEoaucJkEeXOLH3h8o?usp=share_link";
            }
            case "Finance Management" -> {
                u1 = "https://drive.google.com/drive/folders/1E4o_UXSTlS34kXymaji1Jj5xp2OWs2gq?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1Dw4zujMa-Ip46NG0i0ITnjkVDBscL0-T?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1D8VWdmylaCbsQNYo4aY6sUxJLXjaqIR_?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1rMhEmGeTaNXzClV8RUPKU0ThPZL1ThDj?usp=share_link";
            }
            case "Marketing Management" -> {
                u1 = "https://drive.google.com/drive/folders/1ScuarellT9f6v8AROG8yWFWLxZqYMY25?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1Ody3A4PGPuuynSm_c4ABJq3XuMqI6CKp?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/17FK1MtK_vqbPGKbuRy8C6E6481UzrQ0I?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1yC98dx3ywMtLjFLub2-Yib2TDZi5pfXK?usp=share_link";
            }
            case "Human Resource Management" -> {
                u1 = "https://drive.google.com/drive/folders/1tnFVzexEQOZgYhQNmCaFVuS6-nsyW6xz?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1BVgZ74cEkeZAkSeDUB_8rcAE3CgVGfMy?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1DedS63FOHIlBbtLekq4dYhag-52kC-A1?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1GCzOfOuONH-gxZw4qr0VBOKN6UvaYJ_r?usp=share_link";
            }
            case "Production And Operation Management" -> {
                u1 = "https://drive.google.com/drive/folders/1hxN1Ihxh8r91KcrNvUZtDG45IOgpzGyr?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1KzoWkm4dJetA2QSdydRzA5dq6NOhoRl4?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1LNwAZq0DSG5XlTBqLXGQ2MvDaFDvQ2bK?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1Jf20jgQFeMj9VJGXL91bJEZe-53U44UK?usp=share_link";
            }
            case "Environment Studies" -> {
                u1 = "https://drive.google.com/drive/folders/1ZvT3Sfeaxb7R7eTs_fc-_tRimtjDJMkO?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1_XbU1wiJj8wO0z4L-BNt0Kgw1xo072y9?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1EQGjh_r8qPD8bo2A_zY4kekPylFW4n-s?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1AACd7Pm1hatf35latBrGndMokm7r03Wk?usp=share_link";
            }
            case "Organizational Behaviour" -> {
                u1 = "https://drive.google.com/drive/folders/1vp2XiMxcNdKF6uz4Eq9c9OVCxaoEkNwg?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1WZ1iXtMpi0yf8i4fhXw7iEHTWyFfEd2x?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1eicuI0hDat-SZ0tXBSQTnMQMWie16VQw?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1ym3VsWojJtZP-Qk-KIDPkfwFCgPdBfiW?usp=share_link";
            }
            case "Financial And Market Institution" -> {
                u1 = "https://drive.google.com/drive/folders/1YC3G0uVeRtPDp7OcJkVpTbqd_d0tgIas?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/17mphEl9l4h8CKh41DtL4iIxGdQTzHPp-?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1Feq4zLSNsW_yX_l_3Ks-jlfc7l7BlfNI?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/18jIoC0kudPeIjc9ZS5TgKJKbQxlcKDRX?usp=share_link";
            }
            case "Advertisement And Sales Promotion" -> {
                u1 = "https://drive.google.com/drive/folders/1nURWdjVYZ7aKHPoUhXoDuIkfL1mBx5kT?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1ewEy8NkoE11jFxHVLlPZxjqGbfy-skpg?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1yEHJSjme6J1g2hmPkaLKIGaCzAuv-7eQ?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/19w_0C7ZuYBZqJe7GU28U_wTI1YSb0gUs?usp=share_link";
            }
            case "Management Information System And DSS" -> {
                u1 = "https://drive.google.com/drive/folders/17BhI3BIedCJCvoaleUzHDijHMYKNLDWI?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1QOHPSNvOByPDo6D-xxgJj8VVgRK9WEBX?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1KUr64eAvvYaAG8MGKOM021CzTDCsFxDr?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1RJnshNcM00mTlWgnvsawT0erbml2vsT6?usp=share_link";
            }
            case "Indian Socity And Culture" -> {
                u1 = "https://drive.google.com/drive/folders/1nSXdMktuleBlsRB2_6MkI4cbRyiO6Qbh?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1C1-NjOFiAgL_KYsgYa4ah50lk7k94NQb?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1CkT5vivYgg1A1hAQtBGIRAEGPE8qRRCi?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/10QvfQWGvKHqYTNYb9dB37_oGsNb6sSvl?usp=share_link";
            }
            case "Research Methodology" -> {
                u1 = "https://drive.google.com/drive/folders/1M2mD6kD2ZRDX2T-v3CXsOVu6KVGkjLSJ?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1in-SV8fGovCs3ZWiRTxVF52cKhDY7XLA?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/11dp7qgm-6S6Fl-rZ5bBBRBh2j0Vd8e0w?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1Mfcf3dkuEEs0zj9hmMfX0QAxdkwGZ9Sn?usp=share_link";
            }
            case "Entrepreneurship And Small Bussiness Management" -> {
                u1 = "https://drive.google.com/drive/folders/1OGquAf7vVDw2cqRmzziDBeyqTKiC-eAq?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1uvwf2cxX58BvAoHiXoZeTWsktpv7UNec?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1KDtzqAZ0F4KvzhpLVA60rc75c3kASzF9?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1ICbZHpYM50YMOKoKeXlnpI2Z0YnQ5nJ-?usp=share_link";
            }
            case "Organisational Change And Development" -> {
                u1 = "https://drive.google.com/drive/folders/1uGUBfJLoNFUMcSxEVAGPoQxUDGWjWMan?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1oirdxHUajA9BLmaJ69wbWnGQlvspHjoN?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1Kz0wZwkw7uOuPymKJK1tTDqbNKAmg8SA?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1oxSM3kkVuo7ewXfE4ljv7GAAU-WDO_nv?usp=share_link";
            }
            case "E-Bussiness" -> {
                u1 = "https://drive.google.com/drive/folders/1yh-mAJHuF8mNTxacDJUGVosTWqBC4P7T?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1vI6K385phNFjabX7GnSpxX4s9I95peu3?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1D3VMw0GFkokpZYWoLxP8OI1Ro33w76fu?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1uYZzyESxhA7x6v9wCIWuQAb6TGNH9yId?usp=share_link";
            }
            case "Dissertion And Viva-voice" -> {
                u1 = "https://drive.google.com/drive/folders/1xDDANF-ZHbcyrofRj8No4LLAw_rFZykm?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1YmF-Em2mmv-g342A6VpjB1s_ksjGcBba?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1hnaVWoSzsqiRN3Jrm2jdoqFY5V3lPN-N?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1NCNHx1dNHUqCv-3bsjpy0u37RdYc-h8i?usp=share_link";
            }
        }
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}