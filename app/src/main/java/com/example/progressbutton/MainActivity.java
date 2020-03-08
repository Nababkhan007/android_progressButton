package com.example.progressbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View progressBtnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBtnView = findViewById(R.id.progressBtnId);

        progressBtnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressButton progressButton = new ProgressButton(progressBtnView);
                progressButton.buttonActivated();
                progressBtnView.setEnabled(false);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressButton.buttonFinished();
                        progressBtnView.setEnabled(false);
                        startActivity(new Intent(MainActivity.this, HomeActivity.class));
                        finish();
                    }
                }, 3000);
            }
        });
    }
}
