package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view) {
        EditText usernameLogin = findViewById(R.id.usernameLogin);
        EditText passwordLogin = findViewById(R.id.passwordLogin);
        Log.i("Username", usernameLogin.getText().toString());
        Log.i("Password", passwordLogin.getText().toString());
        Toast.makeText(this, "Button pressed " + usernameLogin.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}