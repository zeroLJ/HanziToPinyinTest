package com.zero.hanzitopinyin;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView=new TextView(this);
        tView.setTextSize(24);
        tView.setTextColor(Color.BLACK);
        String hanziString="你";
        String pinyinString= HanZiToPinYinUtil.toPinYin(hanziString.charAt(0));
        tView.setText("拼音："+pinyinString+"\n"+"汉字："+hanziString);
        setContentView(tView);

        String s = HanZiToPinYinUtil.stringToPinYin("你好");
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
