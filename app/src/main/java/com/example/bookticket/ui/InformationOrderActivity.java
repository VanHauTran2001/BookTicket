package com.example.bookticket.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.bookticket.R;
import com.example.bookticket.databinding.ActivityInformationOrderBinding;

public class InformationOrderActivity extends AppCompatActivity {

    ActivityInformationOrderBinding mBinding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_information_order);
    }
}