package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.util.DisplayUtil;
import com.example.myapplication.util.Utils;


public class MainActivity extends AppCompatActivity {

    private TextView text_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_screen = findViewById(R.id.text);

        int dip_10 = Utils.dip2px(this,  10L);
        text_screen.setPadding(dip_10, dip_10, dip_10, dip_10);
        text_screen.setBackgroundColor(0x00f00);
        text_screen.setTextColor(0xffff77);
        showScreenInfo();
    }

    private void showScreenInfo(){
        int width = DisplayUtil.getScreeWidth(this);
        int height = DisplayUtil.getScreeHeight(this);
        float density = DisplayUtil.getScreeDensity(this);
        String info = String.format("当前屏幕宽度是%dpx，高度是%dpx，像素是%f",width,height,density);
        text_screen.setText(info);
    }
}