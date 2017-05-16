package com.example.thoeurn.loginscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends Activity {
    public final String USERNAME= "admin";
    public final String PASSWORD="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void OnLogInClick(View view){
        EditText etxt_Username = (EditText) findViewById(R.id.etxt_username);
        EditText etxt_Password = (EditText)  findViewById(R.id.etxt_password);

        String username = etxt_Username.getText().toString();
        String password = etxt_Password.getText().toString();

        if(username.equals(USERNAME) && password.equals(PASSWORD)){
            Intent mainIntent = new Intent(this,MainActivity.class);
            startActivity(mainIntent);
        }else
        {
            Toast.makeText(this,"Incorrect Username or Password ",Toast.LENGTH_LONG).show();
        }
    }

}

