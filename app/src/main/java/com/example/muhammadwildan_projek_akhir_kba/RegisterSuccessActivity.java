package com.example.muhammadwildan_projek_akhir_kba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.muhammadwildan_projek_akhir_kba.databinding.ActivityRegisterSuccessBinding;


public class RegisterSuccessActivity extends AppCompatActivity {
    ActivityRegisterSuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterSuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}