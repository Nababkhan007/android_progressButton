package com.example.progressbutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

class ProgressButton {
    private LinearLayout linearLayout;
    private ProgressBar progressBar;
    private TextView textView;

    public ProgressButton(View view) {
        linearLayout = view.findViewById(R.id.linearLayoutId);
        progressBar = view.findViewById(R.id.progressBarId);
        textView = view.findViewById(R.id.textViewId);
    }

    @SuppressLint("SetTextI18n")
    public void buttonActivated() {
        progressBar.setVisibility(View.VISIBLE);
        textView.setText("Please wait...");
    }

    public void buttonFinished() {
        linearLayout.setBackgroundColor(linearLayout.getResources().getColor(R.color.colorPrimary));
        progressBar.setVisibility(View.GONE);
        textView.setText("Done");
    }
}
