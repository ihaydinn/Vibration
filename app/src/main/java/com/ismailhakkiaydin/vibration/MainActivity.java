package com.ismailhakkiaydin.vibration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Vibration(MainActivity.this).Vibrate();
        //new Vibration(MainActivity.this).Vibrate2();

    }
}
