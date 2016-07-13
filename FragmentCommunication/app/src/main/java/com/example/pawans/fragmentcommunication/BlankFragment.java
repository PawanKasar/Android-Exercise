package com.example.pawans.fragmentcommunication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        TextView tvMsg = (TextView)view.findViewById(R.id.tv_msg);

        String value = getArguments().getString("key");
        Log.d("Firstfragment","Getting Value from Activity "+value);

        tvMsg.setText(value);

        return view;
    }

}
