package com.example.facul.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.facul.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        EditText signUpUserName = findViewById(R.id.signUpEmail);
        EditText signUpPassword = findViewById(R.id.signUpPassword);
        Bundle bundle = getIntent().getExtras();

        if(bundle.getString("username") != null){
            signUpUserName.setText(bundle.getString("username"));
        }
        if(bundle.getString("password") != null){
            signUpPassword.setText(bundle.getString("password"));
        }

    }
}