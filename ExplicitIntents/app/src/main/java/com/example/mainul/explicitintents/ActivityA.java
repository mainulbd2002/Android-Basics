package com.example.mainul.explicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    private Button btnTst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTst = (Button) findViewById(R.id.btnTst);
        btnTst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"New Toast Created", Toast.LENGTH_LONG);
                toast.show();
            }
        });
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
