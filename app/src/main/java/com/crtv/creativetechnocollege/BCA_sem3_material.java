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


public class BCA_sem3_material extends Fragment {

    CardView sub1, sub2, sub3, sub4, sub5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_b_c_a_sem3_material, container, false);

        sub1=view.findViewById(R.id.bcajava);
        sub2=view.findViewById(R.id.bcaco);
        sub3=view.findViewById(R.id.bcadms);
        sub4=view.findViewById(R.id.bcapython);
        sub5=view.findViewById(R.id.bcaacc);

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Qbank = "https://drive.google.com/drive/folders/1UfVlrlnx6upKmliKPzuiXQBRrNCpRrqR?usp=sharing";
                showDialog(getActivity(), Demoppt.class, Demonotes.class, DemoAssignment.class, "Java Programming", Qbank);
            }
        });

        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Qbank = "https://drive.google.com/drive/folders/1pW0LBUCMnKx88g3M_-FDbD_RVnIohAlq?usp=sharing";
                showDialog(getActivity(), Demoppt.class, Demonotes.class, DemoAssignment.class, "Computer Organisation", Qbank);
            }
        });

        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Qbank = "https://drive.google.com/drive/folders/1wbu2PK6IXU2hIR64vsGvrAy8Ht_HVldl?usp=sharing";
                showDialog(getActivity(), Demoppt.class, Demonotes.class, DemoAssignment.class, "Discrete Mathematical Structure", Qbank);
            }
        });

        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Qbank = "https://drive.google.com/drive/folders/1suD1pQN_V2SJjkFB7lgkLx7ENxsvXwOy?usp=sharing";
                showDialog(getActivity(), Demoppt.class, Demonotes.class, DemoAssignment.class, "Python Programming", Qbank);
            }
        });
        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Qbank = "https://drive.google.com/drive/folders/17oLIJIkrYzGoM29h8aqXxL8powU2UcVo?usp=sharing";
                showDialog(getActivity(), Demoppt.class, Demonotes.class, DemoAssignment.class, "Bussiness Accounting", Qbank);
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