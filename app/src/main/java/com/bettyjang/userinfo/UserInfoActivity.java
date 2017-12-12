package com.bettyjang.userinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public void login (View view){
        EditText edUserid = (EditText) findViewById(R.id.userid);
        EditText edPhone = (EditText) findViewById(R.id.phone);
        String userid = edUserid.getText().toString();
        String phone = edPhone.getText().toString();
        if ("Betty".equals(userid) && "1234567890".equals(phone)) {
            getIntent().putExtra("LOGIN_USERID",userid);
            getIntent().putExtra("LOGIN_PHONE",phone);
            setResult(RESULT_OK,getIntent());
            finish();
        }
    }
}
