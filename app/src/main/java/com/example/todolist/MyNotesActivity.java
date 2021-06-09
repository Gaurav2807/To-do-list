package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Objects;

import static java.util.Objects.*;

public class MyNotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notes);

        String fullName;

        Intent intent = getIntent();
        fullName = intent.getStringExtra("full_name");

        requireNonNull(getSupportActionBar()).setTitle(fullName);
    }
}