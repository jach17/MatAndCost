package com.example.matandcost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class view_singup extends AppCompatActivity {


    TextView tvGoToLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_singup);
        tvGoToLogin = (TextView) findViewById(R.id.tvGoToSignUP);


        tvGoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToLogin = new Intent(v.getContext(), view_login.class);
                startActivity(intentGoToLogin);
            }
        });
    }
}