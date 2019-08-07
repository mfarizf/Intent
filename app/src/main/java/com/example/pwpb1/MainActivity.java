package com.example.pwpb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button lat1, lat2Frame, latGrid, latCons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lat1 = findViewById(R.id.lat1);
        lat1.setOnClickListener(this);
//        lat1Frame = findViewById(R.id.lat1_frame);
//        lat1Frame.setOnClickListener(this);
        lat2Frame = findViewById(R.id.lat2_frame);
        lat2Frame.setOnClickListener(this);
        latGrid= findViewById(R.id.lat_grid);
        latGrid.setOnClickListener(this);
        latCons = findViewById(R.id.lat_constraint);
        latCons.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lat1:
                Intent lat1Intent = new Intent(this, lat1.class);
                startActivity(lat1Intent);
                break;
//            case R.id.lat1_frame:
//                Intent lat1frameIntent = new Intent(this, Lat1_Frame.class);
//                startActivity(lat1frameIntent);
//                break;
            case R.id.lat2_frame:
                Intent lat2frameIntent = new Intent(this, Lat2_Frame.class);
                startActivity(lat2frameIntent);
                break;
            case R.id.lat_grid:
                Intent latGridIntent = new Intent(this, LatGridLayout.class);
                startActivity(latGridIntent);
                break;
            case R.id.lat_constraint:
                Intent latConsIntent = new Intent(this, LatCons.class);
                startActivity(latConsIntent);
                break;
        }
    }
}
