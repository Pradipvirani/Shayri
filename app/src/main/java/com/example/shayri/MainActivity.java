package com.example.shayri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Custom_Adapter custom_adapter;
    String type[]={"Love Shayari","Birthday Shayari","Friendship Shayari","Romantic Shayari","Yaad Shayari","Good Morning Shayari","Good Night Shayari","Funny Shayari","Judai Shayari","Bewafa Shayari"};
    int image[]={R.drawable.love,R.drawable.birthday,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7,R.drawable.img_8,};
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        custom_adapter=new Custom_Adapter(MainActivity.this,type,image);
        lv=findViewById(R.id.activity_main_lv);
        lv.setAdapter(custom_adapter);
    }
}