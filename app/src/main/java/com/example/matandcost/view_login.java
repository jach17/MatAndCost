package com.example.matandcost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class view_login extends AppCompatActivity {

    Button btnLogin;
    EditText txtUser, txtPassword;
    TextView tvGoToSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_login);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        txtUser = (EditText)findViewById(R.id.txtUser);
        txtPassword= (EditText)findViewById(R.id.txtPassword);
        tvGoToSignUp = (TextView)findViewById(R.id.tvGoToSignUP);


        tvGoToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToSignUp = new Intent(v.getContext(), view_singup.class);
                startActivity(intentGoToSignUp);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = txtUser.getText().toString();
                String passwordInput = txtPassword.getText().toString();
                if(auth(userInput, passwordInput)){
                    Toast.makeText(view_login.this, "Hola, Admin!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view_login.this, "Usuario no registrado, por favor crea una cuenta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    
    public boolean auth(String user, String password){
        String admin="admin";
        String passAdmin="admin";
        if(user.equals(admin) && passAdmin.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}