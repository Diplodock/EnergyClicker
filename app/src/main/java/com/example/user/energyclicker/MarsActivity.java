package com.example.user.energyclicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MarsActivity extends AppCompatActivity {
    private int clicks = 0;
    ProgressBar progressBar;
    TextView progressCount;
    Button burnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mars);
        burnButton = findViewById(R.id.burnButton);
        progressBar = findViewById(R.id.progressBar);
        progressCount = findViewById(R.id.progressCount);
    }

    public void click(View view) {
        progressCount.setText(Integer.toString(clicks+=2)+" cal/"+progressBar.getMax()+" cal");
        progressBar.setProgress(clicks);
        if (clicks>=progressBar.getMax()){
            Toast doneToast = Toast.makeText(getApplicationContext(), "Congratulations!", Toast.LENGTH_LONG);
            doneToast.show();
        }
    }

    }



