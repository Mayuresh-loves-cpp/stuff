package com.example.login.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.R;
import com.example.login.ui.HomeScreen;

import static com.example.login.R.id.button2;

public class NewAccount extends AppCompatActivity {
    public Button GotoHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
        GotoHome = findViewById(R.id.button2);
        GotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewAccount.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}