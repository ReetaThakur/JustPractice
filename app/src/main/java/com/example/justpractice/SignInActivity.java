package com.example.justpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    private EditText name;
    private EditText pass;
    private Button btn;
    private TextView singup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        name = findViewById(R.id.nameEnter);
        pass = findViewById(R.id.passwordEnter);
        btn = findViewById(R.id.btnsignin);
        singup=findViewById(R.id.signupforseondpage);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignInActivity.this,HomeScreenActivity.class);
                startActivity(intent);
            }
        });
    }
}