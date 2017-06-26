package com.example.administrator.activitycollector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
   private EditText accountEd;
    private EditText passwordEd;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        accountEd = (EditText) findViewById(R.id.account);
        passwordEd = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = accountEd.getText().toString();
                String password = passwordEd.getText().toString();
                if (account.equals("admin")&&password.equals("123")){
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this,"用户名密码错误！",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
