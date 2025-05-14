package com.rith.vibechekr.review.view;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.rith.vibechekr.review.viewmodel.InsightsViewModel;

import java.util.UUID;

public class InsightsActivity extends AppCompatActivity {
    private InsightsViewModel viewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityIntent();
        initUi();
        setupOnClickListeners();
        setupDisplayObservers();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.fetchAllReviewsByTenant(UUID.fromString("2864ae8f-59ff-4fc1-adef-6ecef81375c0"));
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

    private void getActivityIntent() {
    }

    private void initUi() {
        viewModel = new ViewModelProvider(this).get(InsightsViewModel.class);
    }

    private void setupOnClickListeners() {
    }

    private void setupDisplayObservers() {
    }
}
