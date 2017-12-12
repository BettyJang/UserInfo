package com.bettyjang.userinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private static final int USER_INFO = 10;
    boolean logon = false;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == USER_INFO){
            if (resultCode == RESULT_OK){
                String userid = data.getStringExtra("LOGIN_USERID");
                String phone = data.getStringExtra("LOGIN_PHONE");
                Toast.makeText(this,"暱稱"+"  "+userid+"  "+"電話"+"  "+phone,Toast.LENGTH_LONG)
                        .show();
            }else {
                finish();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!logon){
            Intent intent = new Intent(this,UserInfoActivity.class);
            startActivityForResult(intent,USER_INFO);
        }
    }
}
