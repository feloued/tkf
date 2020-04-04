package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Connexion extends AppCompatActivity implements View.OnClickListener {
    private EditText email;
    private EditText password;
    private Button login_btn;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        login_btn=findViewById(R.id.login_btn);
        login_btn.setOnClickListener(this);
    }
    public void login()
    {
        String mail=email.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if (TextUtils.isEmpty(mail))
        {
            Toast.makeText(this,"l'adrese email est vide",Toast.LENGTH_LONG).show();
        }
        if (TextUtils.isEmpty(pass))
        {
            Toast.makeText(this,"le mot de passe est vide",Toast.LENGTH_LONG).show();
        }
       progressDialog.setMessage("veuillez patienter...");
        progressDialog.show();
    }

    @Override
    public void onClick(View v) {
        
    }
}
