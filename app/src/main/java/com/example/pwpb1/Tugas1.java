package com.example.pwpb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tugas1 extends AppCompatActivity implements View.OnClickListener {

    private Button tugas2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);

        tugas2 = findViewById(R.id.tuglat2);
        tugas2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent tug2Intent = new Intent(this, Tugas2.class);
        startActivity(tug2Intent);
    }
}
