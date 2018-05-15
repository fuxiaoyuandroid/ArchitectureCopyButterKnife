package com.architecture.architectureannotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.butterknife.annotations.BindView;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.login)
    Button login;
    @BindView(R.id.exit)
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
