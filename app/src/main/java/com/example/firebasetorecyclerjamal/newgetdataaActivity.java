package com.example.firebasetorecyclerjamal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class newgetdataaActivity extends AppCompatActivity {

    TextView tvTitle,tvMessage;

    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaydoubleval);

        tvTitle = findViewById(R.id.tvTitle);
        tvMessage = findViewById(R.id.tvMessage);

        intent=getIntent();
        tvTitle.setText(intent.getStringExtra("title"));
        tvMessage.setText(intent.getStringExtra("message"));


    }
}
