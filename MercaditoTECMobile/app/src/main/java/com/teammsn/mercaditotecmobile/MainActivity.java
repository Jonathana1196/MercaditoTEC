package com.teammsn.mercaditotecmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText correoinstitucional, password;
    Button signin, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correoinstitucional = (EditText) findViewById(R.id.correoinstitucional);
        password = (EditText) findViewById(R.id.password);
        signin = (Button) findViewById(R.id.btnsignin);
        signup = (Button) findViewById(R.id.btnsignup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}