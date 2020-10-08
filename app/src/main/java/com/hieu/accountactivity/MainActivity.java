package com.hieu.accountactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        login=(Button) findViewById(R.id.buttonLogin);
        email=(EditText) findViewById(R.id.inputEmail);
        password=(EditText) findViewById(R.id.inputPassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_login();
            }
        });
    }
    void xml_login() {
        Intent intent = new Intent(this,Profile.class);
        intent.putExtra("mail",email.getText().toString());
        intent.putExtra("pass", password.getText().toString());
        this.startActivity(intent);
    }
}