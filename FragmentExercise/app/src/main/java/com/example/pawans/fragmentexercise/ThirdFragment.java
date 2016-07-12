package com.example.pawans.fragmentexercise;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {

    Button btnhird;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        btnhird = (Button)view.findViewById(R.id.button_3);

        btnhird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"Wellcome to Third Fragment",Toast.LENGTH_LONG).show();
                ((MainActivity)getActivity()).openFourthFragment();
                btnhird.setVisibility(View.GONE);

            }
        });

        return view;
    }

}
