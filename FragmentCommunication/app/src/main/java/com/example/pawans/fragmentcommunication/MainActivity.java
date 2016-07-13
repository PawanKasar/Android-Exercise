package com.example.pawans.fragmentcommunication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMsg = (EditText)findViewById(R.id.et_msg);

        findViewById(R.id.bn_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment fragment = new BlankFragment();
                Bundle args = new Bundle();
                args.putString("key", etMsg.getText().toString());
                fragment.setArguments(args);
                getSupportFragmentManager().beginTransaction().addToBackStack("Frament")
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .replace(R.id.fragment_holder,fragment).commit();
            }
        });
    }
}
