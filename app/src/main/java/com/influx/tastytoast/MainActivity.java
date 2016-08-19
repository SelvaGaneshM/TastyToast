package com.influx.tastytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sdsmdg.tastytoast.TastyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TastyToast.makeText(MainActivity.this," DEFAULT Toast",TastyToast.LENGTH_SHORT,TastyToast.DEFAULT);
        TastyToast.makeText(MainActivity.this," ERROR Toast",TastyToast.LENGTH_SHORT,TastyToast.ERROR);
        TastyToast.makeText(MainActivity.this," INFO Toast",TastyToast.LENGTH_SHORT,TastyToast.INFO);
        TastyToast.makeText(MainActivity.this," SUCCESS Toast",TastyToast.LENGTH_SHORT,TastyToast.SUCCESS);
        TastyToast.makeText(MainActivity.this," WARNING Toast",TastyToast.LENGTH_SHORT,TastyToast.WARNING);
    }
}
