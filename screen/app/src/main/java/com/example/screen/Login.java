package com.example.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText user, pass;
    Button login,regis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.txt_username);
        pass = (EditText) findViewById(R.id.txt_password);
        login = (Button) findViewById(R.id.btn_login);
        regis = (Button) findViewById(R.id.btn_register);

    }

    public void Login(View view) {
        if (user.getText().toString().equals("vicko") && pass.getText().toString().equals("kakuse")){
            Toast next = Toast.makeText(getApplicationContext(),"berhasil masuk",Toast.LENGTH_LONG);
            next.show();
            startActivity(new Intent(Login.this,Menu.class));
        }else {
            Toast failed = Toast.makeText(getApplicationContext(),"maaf gagal",Toast.LENGTH_LONG);
            failed.show();
        }
    }

    public void Register(View view) {
        startActivity(new Intent(Login.this, register.class));
        finish();
    }
}
