package com.example.term_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_main extends AppCompatActivity {
    Button log_btn,join_member_btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_main);

        log_btn = findViewById(R.id.log_btn);
        join_member_btn = findViewById(R.id.join_member_btn);

        // 로그인버튼 이벤트 -> 로그인창으로
        log_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_login = new Intent(First_main.this, MainActivity.class);
                startActivity(go_login);
            }
        });

        // 가입버튼 이벤트 -> 가입창으로 finsh() 쓰지 않은 이유는 back해서 돌아오기 위해서
        join_member_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_join_member = new Intent(First_main.this, Id_add.class);
                startActivity(go_join_member);
            }
        });
    }
}