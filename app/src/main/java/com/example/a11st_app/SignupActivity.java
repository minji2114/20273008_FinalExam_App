package com.example.a11st_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void OnClicktosignup(View v) {
        Toast.makeText(this, "등록되었습니다.", Toast.LENGTH_LONG).show();
    }
}
