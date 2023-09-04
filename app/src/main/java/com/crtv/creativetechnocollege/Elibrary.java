package com.crtv.creativetechnocollege;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.creativetechnocollege.R;


public class Elibrary extends Fragment {

    CardView bca, bba, bsc;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view= inflater.inflate(R.layout.fragment_elibrary, container, false);

        bca=view.findViewById(R.id.bcabatch);
        bba=view.findViewById(R.id.bbabatch);
        bsc=view.findViewById(R.id.bscbatch);

        bca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Semistar_Elibrary semistar_elibrary =new Semistar_Elibrary();

                Bundle bundle = new Bundle();
                bundle.putString("1st","bca");

                semistar_elibrary.setArguments(bundle);


                FragmentTransaction fragmentTransaction= getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, semistar_elibrary);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Semistar_Elibrary semistar_elibrary =new Semistar_Elibrary();

                Bundle bundle = new Bundle();
                bundle.putString("1st","bba");

                semistar_elibrary.setArguments(bundle);


                FragmentTransaction fragmentTransaction= getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, semistar_elibrary);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        bsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Semistar_Elibrary semistar_elibrary =new Semistar_Elibrary();

                Bundle bundle = new Bundle();
                bundle.putString("1st","bsc");

                semistar_elibrary.setArguments(bundle);


                FragmentTransaction fragmentTransaction= getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, semistar_elibrary);
                fragmentTransaction.addToBackStack(null).commit();

            }
        });





         return view;
    }
}