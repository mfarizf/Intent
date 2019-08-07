package com.example.pwpb1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tugas2 extends AppCompatActivity implements View.OnClickListener {

    private Button latTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas2);

        latTable = findViewById(R.id.lat_table);
        latTable.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent latTableIntent = new Intent(this, LatTableLayout.class);
        startActivity(latTableIntent);
    }
}
