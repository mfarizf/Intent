package com.example.pwpb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lat2 extends AppCompatActivity implements View.OnClickListener {

    private Button tugas1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat2);

        tugas1 = findViewById(R.id.tuglat1);
        tugas1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent moveIntent = new Intent(this, Tugas1.class);
        startActivity(moveIntent);
    }
}
