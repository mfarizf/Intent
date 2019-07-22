package com.example.pwpb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button tugas1, tugas2, lat1, lat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tugas1 = findViewById(R.id.tuglat1);
        tugas1.setOnClickListener(this);
        tugas2 = findViewById(R.id.tuglat2);
        tugas2.setOnClickListener(this);
        lat1 = findViewById(R.id.lat1);
        lat1.setOnClickListener(this);
        lat2 = findViewById(R.id.lat2);
        lat2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tuglat1:
                Intent moveIntent = new Intent(this, Tugas1.class);
                startActivity(moveIntent);
                break;
            case R.id.tuglat2:
                Intent tug2Intent = new Intent(this, Tugas2.class);
                startActivity(tug2Intent);
                break;
            case R.id.lat1:
                Intent lat1Intent = new Intent(this, lat1.class);
                startActivity(lat1Intent);
                break;
            case R.id.lat2:
                Intent lat2Intent = new Intent(this, lat2.class);
                startActivity(lat2Intent);
                break;
        }
    }
}
