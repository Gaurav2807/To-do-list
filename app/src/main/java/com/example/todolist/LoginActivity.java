package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    EditText FullName, UserName;
    Button loginButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FullName = findViewById(R.id.FullName);
        UserName = findViewById(R.id.UserName);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fullName;
                String userName;
                fullName = Objects.requireNonNull(FullName.getText()).toString();
                userName = Objects.requireNonNull(UserName.getText()).toString();

                Intent intent = new Intent(LoginActivity.this, MyNotesActivity.class);
                intent.putExtra("full_name", fullName);
                startActivity(intent);
            }
        });
    }
}