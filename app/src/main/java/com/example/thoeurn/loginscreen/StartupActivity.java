package com.example.thoeurn.loginscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.thoeurn.loginscreen.R;

/**
 * Created by Thoeurn on 5/12/2017.
 */

public class StartupActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
    }
    public void OnSignUpClick(View view) {
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
}

