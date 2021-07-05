package com.example.justpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity  {
    private EditText name;
    private EditText mail;
    private EditText pass;
    private Button btn;
    private TextView singin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.nameEnter);
        mail=findViewById(R.id.gmailEnter);
        pass=findViewById(R.id.passwordEnter);
        btn=findViewById(R.id.btnsignup);
        singin=findViewById(R.id.signupforseondpage);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUpActivity.this,SignInActivity.class);
                startActivity(intent);
                if(name.getText().length()<6){
                    Toast.makeText(SignUpActivity.this,"Minimum 4 charecter required",Toast.LENGTH_LONG).show();
                }
            }
        });


    }

}