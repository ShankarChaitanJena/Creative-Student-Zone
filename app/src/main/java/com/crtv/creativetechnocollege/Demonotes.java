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


public class Demonotes extends Fragment {

    CardView unit1, unit2, unit3, unit4;

    String u1, u2, u3, u4;

    TextView setSubject;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demonotes, container, false);





        Bundle bundle = this.getArguments();
        String notedata = bundle.getString("bookdata");

        unit1 = view.findViewById(R.id.unit1);
        unit2 = view.findViewById(R.id.unit2);
        unit3 = view.findViewById(R.id.unit3);
        unit4 = view.findViewById(R.id.unit4);

        setSubject = view.findViewById(R.id.setSubject);
        setSubject.setText(notedata);

        setLink(notedata);

        unit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), notedata, Toast.LENGTH_SHORT).show();
                gotoUrl(u1);
            }
        });
        unit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), notedata, Toast.LENGTH_SHORT).show();
                gotoUrl(u2);
            }
        });
        unit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), notedata, Toast.LENGTH_SHORT).show();
                gotoUrl(u3);
            }
        });
        unit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), notedata, Toast.LENGTH_SHORT).show();
                gotoUrl(u4);
            }
        });

        return view;
    }

    private void setLink(String notedata) {
        switch (notedata) {
            case "C Programming" -> {
                u1 = "https://drive.google.com/drive/folders/1dds15fEImwioSKoqmqun7v6Fnt2-WTjp?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/15jMdrT97ZXiAIbdfCqZ2uuGMvOd-TpPZ?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1MbwOEun7t5LnTuU3H1XjiceVzahZHnmq?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1ZhtEzqUkw5PlUEzu_Nf2uqDZraN5vzxQ?usp=share_link";
            }
            case "Digital Logic" -> {
                u1 = "https://drive.google.com/drive/folders/1zpiVJ9Sqz7Wu4sKnQfFBKk6FlrmiY1Ne?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1keR32oliT4L1z_zDg7CXYq2kWxWsiQ-J?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1lbBob_mqjVTd7itRkAjNLrJhGGjPayb-?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1MTDB7kJbKhQOF0a3B8SIVsTO9npORUoK?usp=share_link";
            }
            case "Environment Science" -> {
                u1 = "https://drive.google.com/drive/folders/1QydWW1bqL2Wr5Tg67oOJJi77mM_cl3wB?usp=sharing";
                u2 = "https://drive.google.com/drive/folders/1pgUvQjGLgsbBhhW8mJ3U40TTad7J9Vir?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1eA9u2zQQJdLL6jxn_OHvoGvymKs4YrOR?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1vz52ZKIZxKKL3oTIVi7dmIhUu-P3-8km?usp=share_link";
            }
            case "Principle Of Management" -> {
                u1 = "https://drive.google.com/drive/folders/1SbQnJZLIMJyDU514r2mMkCVHGsNuptmK?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1NcUSqrLC8-kRoVTD4Oea2C-CXwOj-RYE?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1JUA6m0MDokw_HlgbIMdjqRq0_6dsS2QC?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1gnivLU7BDKaNX89obREtXXUxUYFaNpMq?usp=share_link";
            }
            case "Programming Using C++" -> {
                u1 = "https://drive.google.com/drive/folders/1YTrOkeD4SOcui0o1_OUXPjBFp0CUT4UJ?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1GHUiBcml7NlDbxQSL00F3Fy2hosAGmkd?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1MoDg9EsFSHDQqOfKDFjpv5qBxvblvDu1?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1NzVKlTLc_COGUjFAu9J6rGx2FhNIRE08?usp=share_link";
            }
            case "Data Structure" -> {
                u1 = "https://drive.google.com/drive/folders/1x8vFQF_37oi3nJ_uPSJeAPFN1TiZnQHm?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1jrWNpqKJa8lndcLW_wH4s_UVpoYFli_5?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1KFHAimmOBYgn20hdQQvoee_Uzh7qQsY1?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1bVrQYY1X7cqNaoAEtewsy6d6Wu4kfM8K?usp=share_link";
            }
            case "English Communication" -> {
                u1 = "https://drive.google.com/drive/folders/1WORyCDzQRAakwL4-LXwE4ItFhIRGsL7R?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1zStMQ9X9nmGvtTtbvRTFTXywXqVchz3V?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1JIymFpZ42x1BQmxAXzlpb1GGJCs8NgTB?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1OnpYbRvW3wN3JKLE87Fs72LDjhGDdzF3?usp=share_link";
            }
            case "Statistics" -> {
                u1 = "https://drive.google.com/drive/folders/1A53MNmHL0bbdbTnTRcTIE-CQBqN-Jvc2?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1fT4NqeayL2QCE1q9MymEBFh3-gg02EJV?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/19FXUadyLVuPq4K1wTQrYj1aZuy2Lp7tf?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1rIrpoJdEzP5AxgNmfN11RocBhBTwHeBo?usp=share_link";
            }
            case "Java Programming" -> {
                u1 = "https://drive.google.com/drive/folders/1B3LirbN7cyt6a2Sl8ryheOtvEl9ppHor?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1t9zJtOf6ZUYc9kfsJUBcHcjj_jRhym31?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/13cCFX9izaMbkVf4xlWgmMW9U-MSSdaL8?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1GYHbJoOxr2ka32FZzoOzntPH8Tn3qLUW?usp=share_link";
            }
            case "Computer Organisation" -> {
                u1 = "https://drive.google.com/drive/folders/1LkI5ao5wfrBsy9MjITbg7v7-vKw48jpw?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1tCxet3H055nGjpYRKcqzh07N6ymIJ9mu?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1xLUjho9JiygFrHblXmr4xn6j9Hxw-fxL?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1gP4db7LgYjwE3VFkA7v1tpmPnIBp3zBl?usp=share_link";
            }
            case "Discrete Mathematical Structure" -> {
                u1 = "https://drive.google.com/drive/folders/10EEj8dzHF-9roWU2ST-sLvGsoDV80VCS?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1IUFbvGKsiiNvplFV9YxXbtqSbMbe0lpa?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1LGlG-kNVt8-vPgChiHopgEe1bQ1bS8SE?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1Hok5woXczPLfp9JW6EdqUPUvD5GmLM5B?usp=share_link";
            }
            case "Python Programming" -> {
                u1 = "https://drive.google.com/drive/folders/1i4y18mIcdkVQLGX2yWGgIScMMiVUYoo6?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/19Qw6ZvOtaORKeEc24kbuyrCXRgARyyb4?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1DlwiEEdCZKTF2xBM57tP5HJrJa_vT6Kx?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1w5AEC6hFR9JOQ-VgzM4bMH9dVcD-4VdP?usp=share_link";
            }
            case "Bussiness Accounting" -> {
                u1 = "https://drive.google.com/drive/folders/14KerPiR6gB_AxPZml--ede-6tbtkpVXl?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1SU9Hv7DFEk5PO6t5qSbihZyDNWfNaYqi?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1O4Bc2xH-dVFYsVMvcUK3pugox0XLbAbb?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1a7ofi4VleKC0tNRsFzqHKY5CTQh4Qlds?usp=share_link";
            }
            case "Operating System" -> {
                u1 = "https://drive.google.com/drive/folders/1aofal-HDIF-xWPxLgCkMIqExMqi2XHqX?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1dkpj7k_ZQHkZcEYIBzhJLj4rNTPPB9j4?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1-DtU26Sz_2ERJaQFjj4QFu7F_lR3Oslp?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1k88Ntcl4IAPC6tKrbXifT2b_ZTF1xCsx?usp=share_link";
            }
            case "Database System" -> {
                u1 = "https://drive.google.com/drive/folders/1_AcMEI9U9QMRyhaJM1Q53ES0yiSjeVkp?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1qlELAtHYmv1nyKXIQK9obydDJ20X7gFi?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1EU_aajzcgpgeiY6_xY7tV3z9YtMcV05R?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/12qVu6RGSnjYMNxtl2-Rct6RKRuQlh9Cn?usp=share_link";
            }
            case "Computer Networks" -> {
                u1 = "https://drive.google.com/drive/folders/10io9M7_DBigkVVfky3YYFk_8jCNKWl6_?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1F-dhaWE7I6xESIYSEet_U-_hH54zejoS?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1G4bGeuKr89A3RqFrjy23GcKEgmhlN5-m?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1clcQr65GPMYDPA8QlEJ7ohVNVhzKxj06?usp=share_link";
            }
            case "Android Programming" -> {
                u1 = "https://drive.google.com/drive/folders/17TofoQ3-Zi79qvShcnkmJn88KKRlzwpk?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1ynwpIhOwDIi-0YNL6hJ4p_2V1S5sCBg6?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1ifZJ0QZItP67Zbll1AJhdQdRUFnm6wr0?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1HokHRUeY7Vm90Kq9mnzY3aLNnKfhQgnj?usp=share_link";
            }
            case "Bussiness Economics" -> {
                u1 = "https://drive.google.com/drive/folders/1RqwXV7QGdcIgq10i54JWn0XClGTUo0jn?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1AnY1Kshymsgh-6GnRAXloq6J-LDvnDt2?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/175GG5l1CzCmJao8MqpwZMmrGZSgyjSB5?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1n6NfJz0OivtzzdIns8QvFUcPdPb0Sqtp?usp=share_link";
            }
            case "Unix" -> {
                u1 = "https://drive.google.com/drive/folders/1O0y9a0CbGhjpY1-UyCeywEP0duLLZ63s?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1vgZFzbRaiTB4pEY8Ye9_sX2Ku9ClNyaK?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1RKiaWtGit7ZHeuqL05lbYTLNCGjYWwwj?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1NQWup4ptWx-FIAyyKrutQw686dno8N_3?usp=share_link";
            }
            case "Web Technology" -> {
                u1 = "https://drive.google.com/drive/folders/1yRsnk5EtQ5ymCFhAzLxhNbu7Bmwi2Riu?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1cHm6VR6P08GHIIRWjazJaTJT0s5G7BU4?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1BXNSHUt6PlLUgPXII-F3eiZLr6fjfcqC?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1GBJXfYaH3JgS2qr7U8G9XB_74JU3Dvm1?usp=share_link";
            }
            case "Data Mining" -> {
                u1 = "https://drive.google.com/drive/folders/16-vM1lzNNiCzNPTtzN2qI6H_leUjbMkA?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1XvDU6vN4FXtrL6tXhb0muVI8DNFhXaDv?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1E8QX8UlCzeYO4wQCvjg_49nY6C2ditfs?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1-y3Fvn40NTvuoWUYrWtV1v9_cahYYe_A?usp=share_link";
            }
            case "Software Engineering" -> {
                u1 = "https://drive.google.com/drive/folders/10s7bLL4geu1-wNTNQu6XLur-hFuMAvWN?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/16aUcXjgVR9d_lYe3It8mpO_DW48hfnmF?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1GDy4P_htkpcc6vdnHW0baSG3iWVuoMit?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1TbOEjCfei3ERnY7LlW1SoMfpGuny46-T?usp=share_link";
            }
            case "Data Science" -> {
                u1 = "https://drive.google.com/drive/folders/1DB5d3p-6VHJsrjtwQKoezvm6hcnNYYWp?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1LgU4S1Usp5HD6P0qQmeb49SIG1LaJJU5?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1W9paXKacksDsrqoSJufY5oMAO-4EUC7u?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1vARdF-iaQ_JkCfWv9Mv1V-87QcUbcNyN?usp=share_link";
            }
            case "Computer Graphics" -> {
                u1 = "https://drive.google.com/drive/folders/1c8SGZDmAKo8hJBnKCeoFl0Ed6SRGdp4o?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1SQ2XI7uUXMbUF4IoggCN9oU6M46hbHYd?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1wsKP0MnNfsh8h78RAUDzvXeyC3Wrr21r?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1QZT55K24bKbEClBuwjUHdxz_7P1QAyXc?usp=share_link";
            }
            case "Numerical Technique" -> {
                u1 = "https://drive.google.com/drive/folders/1jV0XgmfE5suZAmLM1WvRt4Js6LbiWZBE?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1jHW6FPe5w5iGDRkde0L6ZMRAqBU-zWmm?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1XorVgUNjR2AwmrVWZjpyt2EF_ckIKdSO?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1EJKjejulS0pFeya4HYeh3lmfKMX_eZyv?usp=share_link";
            }
            case "Mathematics-1" -> {
                u1 = "https://drive.google.com/drive/folders/1pmStqzH4w4BMSQTnzs4RKuJdVDK74N5C?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1gRMX8xzTesB283v62iEUVpI8bv9zU2x3?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/15tfu9m0UnBKNmn9zIrPKv3SEcThddBSz?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1sEQp5BvNrk57BhgV707dEnQb-15BCEIK?usp=share_link";
            }
            case "Physics-1" -> {
                u1 = "https://drive.google.com/drive/folders/11JMDTBrRP6vTUhRJ5ELcw_td_jTThiHG?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1kDB0Ni25XtjQDdXbrhMx0kT54epc1JfI?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1AXKCu2DH49dpIiOmelsdDANh9wFXKjF3?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1OyWIverm6Z6oFB9oPBGUhj7fMHUIwUrV?usp=share_link";
            }
            case "Algebra" -> {
                u1 = "https://drive.google.com/drive/folders/1dDTOmgozsM3lbYZXblysI5jVF-wP9MH3?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1HdidiHf-BH88TUPopnLhnqwjAMkIq7Z-?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1Ff05Aql9VmJgUaptdaX6BnIv4yeLznUZ?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1SSYRhY3Aqk9l_so_PALvEYGnDM-UlfNc?usp=share_link";
            }
            case "Physics-2" -> {
                u1 = "https://drive.google.com/drive/folders/1u4MYHYQOiqu4Ifk-nZyiLoEbNb4jjrxO?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1lMTH0l6G-MqQpDxGLDwz3mHOaA4pdaEE?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1BrAFdheSk2T5VUickecUss1kfg2T5HRk?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1aK-sKDPeVjJ5LgUCZsdi8xEmty3W93FJ?usp=share_link";
            }
            case "Algorithm Design And Technique" -> {
                u1 = "https://drive.google.com/drive/folders/1WvnCtOiF_Uk6JRr7QX6AboQ-_BvuYEKQ?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1XiVDmhhh7NgcIl5Cwz3JrE9FJNNkceHo?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1GS6_WTHfAMW-J7lARcjdfrKQwtQqLbaF?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1eC7ZHw2snZGc8PuvVej00m5Zz_ZMVZ8c?usp=share_link";
            }
            case "Artificial Inteligence" -> {
                u1 = "https://drive.google.com/drive/folders/1LPzNXaWY9e_XpCrOD3S8OVwU-0XHSzx1?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/19ogcEemxPk2Wmt5FaWCXrwlfj8LvmymU?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1TqdqW9Tk5Pv0ANKy1suSVRkA8XjRPntB?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1KnGSXAsLf_F2kPD5iFFVAmHeY3S6pVEP?usp=share_link";
            }
            //BBA
            case "Introduction to bussiness" -> {
                u1 = "https://drive.google.com/drive/folders/1XLYKAq6B0ydifhRP2tQDzbktPZqoKGHk?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1ti9XWN7-VNDmRy1w2I_DdXKuh7OT0rAb?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1wrAyIZePouzuWfamiBYLLbuoEP661bMi?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1m8A1T4OHsmbg0Zycxri6hnmYf2apt3hy?usp=share_link";
            }
            case "English Language And Litreture" -> {
                u1 = "https://drive.google.com/drive/folders/1BgDdaXlKkWwhs3faPSuv5MFeKxk61yEz?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1BWtEBRQSr-p2aLVZ7ZNAMTQDBygq2NMS?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1L39KGiEpIHuEftQyeofzfULAyJ-n4w9s?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1hWOZERWj5BUGPrK6ptOh_ljWbcztTndg?usp=share_link";
            }
            case "Basics Of Financial Accounting" -> {
                u1 = "https://drive.google.com/drive/folders/1GY-m5g4giidm2rWbFriRFy-h9013LVbU?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1oKoURCbt3PVTH0MkXaBPMQ6U8rSfQiVH?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1XAfaJIagHHeWyuOqLlZ05JrefQaMaTdg?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1Kf0nk-FjaDTZCdqGHVFZX5x6Fb-yZt98?usp=share_link";
            }
            case "Quantitative Technique For Management" -> {
                u1 = "https://drive.google.com/drive/folders/1QvyjGFtgF7UL2HtdGEfKWrKR0aC-wtJ9?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/169OmMzxbOHUIVpk6gMjvz1f-G1hmtINz?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/18OB1e9eZcfaIi2NimOscl8lER3xsSnfY?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1pckBSnfcHOIQoJSUuVmPMfFmGOTL_rEw?usp=share_link";
            }
            case "Economics" -> {
                u1 = "https://drive.google.com/drive/folders/17fjPodjQ43QOkEifHKR7j6Na8WBbrzhn?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1y1gvamMlSPgTQ0JYe9MTAnUzZBHI9H3J?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1yjiqooTaaFInACmppuf9xgrG7atA0t-h?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1tVPgrctN8PsqAs3EzdEwBkUnFqSKJopK?usp=share_link";
            }
            case "Management Theory And Practice" -> {
                u1 = "https://drive.google.com/drive/folders/1F433ojkjeU3SvAII821nVvgP5UVEJUaf?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1bxGogSf5E_XQso7g3mk7Viedgg9a2P8D?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1L1yTtvZ_KtMeLUa5FWFsZV0D7Fno6D-6?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1d6cLLIIxgIGlRBpo8VRtlGuFphlQRzWb?usp=share_link";
            }
            case "Cost And Management Accounting" -> {
                u1 = "https://drive.google.com/drive/folders/1gJO6lTp37r5DXuQoCa6rtgtrPSZfGfmK?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1WK2-xlG7mIExwM6YFKFRo5XsJqP8u8sJ?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1bL7Tjl8ACxCca6ipplWl3dxMy-CiV7uw?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1zeZByUMHGzuvRpaBvsizqyx02uA9q6og?usp=share_link";
            }
            case "Computer For Management" -> {
                u1 = "https://drive.google.com/drive/folders/1lfgA3KOAiGUL7kAI_wFaGTeewvpeIA7l?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1_zKr2lg7UqcWOM-sLFk20R1_9YetaDPf?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/12-WBkjisrAfwALZ9mmL1opu6R0H0AJt6?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1fZWiZZUPBYmkCf73cZ2XXcvFwkX_C9RC?usp=share_link";
            }
            case "Pshycology For Management" -> {
                u1 = "https://drive.google.com/drive/folders/1NdH6eulL5s0otGwiCIPdGNHYmOOJJNq9?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1XoB1rcz3ILh1ttgP5-laV0erdksrHoIp?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1UDUCj8JF7tt6U5RRbk84hoEGDHSNRJJO?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/120Dsbz2olC-GygVfuRnluPIngxrvl1pX?usp=share_link";
            }
            case "Business Ethics And Corporate Governance" -> {
                u1 = "https://drive.google.com/drive/folders/1rLzGWXTDhy-Jv7okbOdFscarOvG_l27v?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1C6Zyt0xqI4IVjKoNCCOBWXH62S55FrkM?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1nONZ-f43Kli_rWSGhmmO1aZovntBrrGE?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1F0zOKjnM7olVcsOHY2obQ77deN_tlml8?usp=share_link";
            }
            case "Introduction To Banking And Insurance" -> {
                u1 = "https://drive.google.com/drive/folders/1SGMsLfV-9RGfu_v4OVgwcDhfmQCnILVW?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1Gt35PdAggMQP80LgETbmjKBNaAV8dldr?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1VNTwPK1Ik_48hLo2UpKUpv-W2TgutnnN?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1NNA4MIy8-ffJ9lw9SpVPwaHYUTFkBQPP?usp=share_link";
            }
            case "Bussiness And Corporate Law" -> {
                u1 = "https://drive.google.com/drive/folders/1gtI5Za-78R5btAOH-CNb0TupdyEVDCc5?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1R2w3savQiDzYpOab_YFND1XF0ExwaRX0?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1h7Wb0lTKyYISyTcatc8EuKq0qxyvs7SI?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1pLD0L-mfjRku91aSLXWEsKwc1qFnAMrC?usp=share_link";
            }
            case "Communicative English" -> {
                u1 = "https://drive.google.com/drive/folders/122w77eElU229txrjg_lLL0BVF1M4qrpy?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1LhQi4AbhspGlgENMRT_llFWMcb3m5tnu?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1JfEdxEZDZOfq-vOp4cR3cHA4bnEP33Sk?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/18b9YWTJYDDxHRaeHaDVcbsXoHNmSb4Lt?usp=share_link";
            }
            case "Finance Management" -> {
                u1 = "https://drive.google.com/drive/folders/1Fe2uYpeznRRuzVni-HEFjXgt26iAgJ98?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1IFxOoQ2uQArP5UWO9-7TPxoS2umi6yJB?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1MMwimuIS4vYPTtYN90542yaKQYARleD6?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1zrd3hIlwtURa-sC1PItZD92r3k6uysYJ?usp=share_link";
            }
            case "Marketing Management" -> {
                u1 = "https://drive.google.com/drive/folders/1De5tj0o8DiVAX2KwGgArBGQolYlmm0ao?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1pwk80WfJ7eGYNTSXWCQ8D01y77pvXQY2?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1XfiSGmij7HGSGjdUBWVW7KwiaVaHHAA5?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1huo9P39eLkz3ZXGqLdvD3BHDcJya5KkL?usp=share_link";
            }
            case "Human Resource Management" -> {
                u1 = "https://drive.google.com/drive/folders/1_4yuuLutCsLpNJzgFrm3tyTMFL4FvcrM?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1lkadrhsfLhuZaYpsp1qBAjTsKAS6MgEJ?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1P42FevQtrW6ZVlPje0SCqbZzhEw7Ty1V?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1YETEP1CTuHeUnjtwfb6cnYDPPEK69vtc?usp=share_link";
            }
            case "Production And Operation Management" -> {
                u1 = "https://drive.google.com/drive/folders/1qZ9l3b_23MT9LM-aJLY--9OqTz4hf3LZ?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1mLjy6rRlJWcUzwYYshLY9Xdr7HVCyWhP?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1bmURn9RbIwmZVGf0Im0vaH0oL2BLZV5f?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1-PG4Os3OEKWmszmI3nGzwr1WsaxeAtCc?usp=share_link";
            }
            case "Environment Studies" -> {
                u1 = "https://drive.google.com/drive/folders/1vQtttlvCgGoqgWSZSh8Ifc1A_WElI809?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1pI_ABoo7L1y46fSirGt-wQCD2zDP6Qva?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1Lj7IrpQrbm94Vnvw80TvZlEhbLlwFsgZ?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/17BXLgR7vJawQM3LjFVHrmjy6gWImWTgW?usp=share_link";
            }
            case "Organizational Behaviour" -> {
                u1 = "https://drive.google.com/drive/folders/1ooJVWMGAmIzaGFsYpYZqeeGNf6Zn1_yS?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1zUyPcUNpYZbEHt_Tg_n3v4jCH-s1zQIM?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1OwTk3KpXYSTaV0hICDBGAeG6lj0FIhIv?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/192AgheSJs5oBexQaCvJuygFMf_DQFS2s?usp=share_link";
            }
            case "Financial And Market Institution" -> {
                u1 = "https://drive.google.com/drive/folders/13OzJmiGPzJOt2jTXlSfbRtMzI02bIepD?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/13rQlX1o_GDrGHZGpWCZG4fPsC2wgDVSn?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1zEUwResvwnsbNNDYxmqODep-rgM7R5tv?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1Q5v7zwQG6tkIB8FoeF4H1RhorEx_e7oI?usp=share_link";
            }
            case "Advertisement And Sales Promotion" -> {
                u1 = "https://drive.google.com/drive/folders/1vsmbP9T_44qyBKqLJNadqYUGHLz2wMYY?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1FRwjyLADIWtS3NKTpqIjBjnnjVCWncc2?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1Lo--KHKkofIyzRrMJHJe4rlE4s5nIc0D?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1bTZlU1Ljr7fOg-AMPFNJQZTs9L6Fz37j?usp=share_link";
            }
            case "Management Information System And DSS" -> {
                u1 = "https://drive.google.com/drive/folders/13tH-afkF7_RwHOm9-Wxx9L1xfJ5svL62?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/113gHtn706EpxjSMJUzmzebaT7Cg5p530?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1jK_doacPbmW8APhLH9gaCjIO6MCwH-TU?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1Qd-3LS4xblcgg1XmaiiRqKt6EU4n7Q_a?usp=share_link";
            }
            case "Indian Socity And Culture" -> {
                u1 = "https://drive.google.com/drive/folders/142aJF9yKDC7wuvYnAh1EcG_GmYgFYHtK?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/18BiZ2JEfxI59r80FYamnYCregggYVh59?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1m8rV_J6_v_j4Kozp3PfKkCuEvehJ8nhg?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1z_YUEABTxsNI9CwdDrK-bYVT76KonIW2?usp=share_link";
            }
            case "Research Methodology" -> {
                u1 = "https://drive.google.com/drive/folders/1rYwV7zTS7hTEw5yYGDqEtQ9vVUUzCLuE?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1rFcLDEnnjOKBGPCBskoh4yYXIIzX5mHX?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1ZMKJCKv8PB8iOkHpq77hSWDI2tR6UdOZ?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1VYuUGUq6ge9bvQsh5HknycPc5d3xK3o0?usp=share_link";
            }
            case "Entrepreneurship And Small Bussiness Management" -> {
                u1 = "https://drive.google.com/drive/folders/1BpRymPECvs2SETDJquaxiAzjSDQZS90x?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1vYN1ZiU6Ny0qxYUtBmzEX-VMTacknum1?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1kjnNqFqV_CTUXZWCrzRLgV1SVIau-9By?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1uM9dxoBTasPng8_4KUJiGyml2eunAafI?usp=share_link";
            }
            case "Organisational Change And Development" -> {
                u1 = "https://drive.google.com/drive/folders/1y3YSUBbtUFuSkWVoJRil3DgLQkp8pRbD?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/12Tk2UFYDHiXFXrNrHYojXXu90riHiESd?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1ARUGz_QCCybaj7t-IRP_FXw8vZR3apy6?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1fAnjP-7_-twVvjvFvNINNvJdqpyfWVMq?usp=share_link";
            }
            case "E-Bussiness" -> {
                u1 = "https://drive.google.com/drive/folders/1EpvYz8hXCZfgpKbG4GtQj62lBdPFKpQ8?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1f_DopLhqajIik4RXT2ZAR881CvOfJFpF?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/1g6Ww4roKe3TOAxw9KffbLs9Yh4HEHF8e?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1ANShofMhJRqggZdjRKqpYtDxI6KRUWkK?usp=share_link";
            }
            case "Dissertion And Viva-voice" -> {
                u1 = "https://drive.google.com/drive/folders/1eWRKj9jasKRr8m32Pw9f2Ts4pV5KDFSA?usp=share_link";
                u2 = "https://drive.google.com/drive/folders/1DxdCmdJ-rtf2US3Ye87zvrqZHQPk5syW?usp=share_link";
                u3 = "https://drive.google.com/drive/folders/15alWKPasNosIk_BrFep9naPqAdsLyMBX?usp=share_link";
                u4 = "https://drive.google.com/drive/folders/1AGviTkp89DgJW-_aaLwZmtR8Wfl3IbYL?usp=share_link";
            }
        }
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}