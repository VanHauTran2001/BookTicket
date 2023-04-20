package com.example.bookticket.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.Handler;

import com.example.bookticket.R;
import com.example.bookticket.databinding.ActivityHomeBinding;
import com.example.bookticket.model.Banner;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;
    private int current = 0;
    private Runnable ranable;
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home);
        customViewPager();
    }

    private void customViewPager() {
        ArrayList<Banner> bannerArrayList = new ArrayList<>();
        bannerArrayList.add(new Banner(R.drawable.img1));
        bannerArrayList.add(new Banner(R.drawable.img2));

    }
}