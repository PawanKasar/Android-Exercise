package com.example.pawans.fragmentexercise;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    Button btnsecond;
    TextView textView;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);

        btnsecond = (Button)view.findViewById(R.id.button_1);
        textView = (TextView)view.findViewById(R.id.textview);

        btnsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((MainActivity)getActivity()).clearBackStack();
                textView.setText("");
                btnsecond.setVisibility(View.GONE);
                ((MainActivity)getActivity()).openSecondFragment();

            }
        });

        return view;
    }

}
