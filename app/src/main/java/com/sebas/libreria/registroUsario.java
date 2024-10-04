package com.sebas.libreria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class registroUsario extends AppCompatActivity {

        EditText edUsername, edEmail, edPassword;
        Button btnRegister;



        GetSetUser oUser = new GetSetUser();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usario);
        btnRegister = findViewById(R.id.register_button);
        edUsername = findViewById(R.id.username);
        edEmail = findViewById(R.id.email);
        edPassword = findViewById(R.id.password);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  RuserName = edUsername.getText().toString();
                String Remail = edEmail.getText().toString();
                String Rpassword = edPassword.getText().toString();
            }
        });


        private ArrayList<User> buscarUsuario (String userName){


        }
    }





}