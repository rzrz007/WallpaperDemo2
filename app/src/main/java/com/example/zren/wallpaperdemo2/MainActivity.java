package com.example.zren.wallpaperdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(".idea文件夹\n" +
                ".gradle文件夹\n" +
                "所有的build文件夹\n" +
                "所有的.iml文件\n" +
                "local.properties文件\n" +
                "gradle文件夹\n");
    }
}
