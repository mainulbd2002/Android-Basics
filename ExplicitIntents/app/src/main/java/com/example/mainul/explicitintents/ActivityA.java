package com.example.mainul.explicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchActivity(View v){

        switch (v.getId()){
            case R.id.btnSwitch1:
                Intent i = new Intent(ActivityA.this,ActivityB.class);
                startActivity(i);
                break;

            case R.id.btnSwitch2:
                Intent j = new Intent("mainul.explicitintents.ActivityB");
                startActivity(j);
                break;

            case R.id.btnSwitch3:
                Intent k = new Intent();
                k.setClassName("com.example.mainul.explicitintents", "com.example.mainul.explicitintents.ActivityB");
                startActivity(k);
                break;
        }

    }
}
