package com.example.user.energyclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton cake;
    ImageButton bigmac;
    ImageButton muffin;
    ImageButton sandwich;
    ImageButton mars;
    ImageButton borsh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bigmac = findViewById(R.id.bigmac);
        borsh =  findViewById(R.id.borsh);
        sandwich =  findViewById(R.id.sandwich);
        muffin =  findViewById(R.id.muffin);
        mars =  findViewById(R.id.mars);
        cake =  findViewById(R.id.cake);

        bigmac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BigmacActivity.class);
                startActivity(intent);
            }
        });

        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CakeActivity.class);
                startActivity(intent);
            }
        });

        borsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BorshActivity.class);
                startActivity(intent);
            }
        });

        muffin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MuffinActivity.class);
                startActivity(intent);
            }
        });

        mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MarsActivity.class);
                startActivity(intent);
            }
        });

        sandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SandwichActivity.class);
                startActivity(intent);
            }
        });


    }



}
