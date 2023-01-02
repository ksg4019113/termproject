package com.example.term_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info_add extends AppCompatActivity {
    Button finsh_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_add);
        finsh_btn = findViewById(R.id.finsh_btn);
        finsh_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_main_login = new Intent(info_add.this, MainActivity.class);
                startActivity(go_main_login);
            }
        });
    }
}