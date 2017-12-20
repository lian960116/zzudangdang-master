package com.example.administrator.zzudangdang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.zzudangdang.singlebook.SingleBookActivity;
import com.example.administrator.zzudangdang.singlebook.SingleBookActivity1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO 测试用活动跳转，下面的两行等待删除
        Intent intent = new Intent(this, SingleBookActivity1.class);
        intent.putExtra("bookid",1);
        intent.putExtra("bossid",1);
        startActivity(intent);
    }
}
