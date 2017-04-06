package com.zero.hanzitopinyin;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView=new TextView(this);
        tView.setTextSize(24);
        tView.setTextColor(Color.BLACK);
        String hanziString = "你好";
        String pinyinString= HanZiToPinYinUtil.stringToPinYin(hanziString);
        tView.setText("拼音："+pinyinString+"\n"+"汉字："+hanziString);
        setContentView(tView);
    }
}
