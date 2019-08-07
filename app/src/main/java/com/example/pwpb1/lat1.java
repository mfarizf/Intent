package com.example.pwpb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lat1 extends AppCompatActivity implements View.OnClickListener {

    private Button lat2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat1);

        lat2 = findViewById(R.id.lat2);
        lat2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent lat2Intent = new Intent(this, lat2.class);
        startActivity(lat2Intent);
    }
}
