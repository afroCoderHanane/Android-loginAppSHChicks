package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText usernameLogin = findViewById(R.id.usernameLogin);
        EditText passwordLogin = findViewById(R.id.passwordLogin);
        Log.i("Username", usernameLogin.getText().toString());
        Log.i("Password", passwordLogin.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}