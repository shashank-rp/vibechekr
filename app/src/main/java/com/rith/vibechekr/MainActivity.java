package com.rith.vibechekr;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.rith.vibechekr.databinding.ActivityMainBinding;
import com.rith.vibechekr.review.view.InsightsActivity;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        initUi();
        setupOnClickListeners();
        setupOnDisplayObservers();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void initUi() {
        Intent intent = new Intent(MainActivity.this, InsightsActivity.class);
        startActivity(intent);
    }

    private void setupOnClickListeners() {
    }

    private void setupOnDisplayObservers() {
    }

}