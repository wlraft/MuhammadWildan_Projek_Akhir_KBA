package com.example.muhammadwildan_projek_akhir_kba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.example.muhammadwildan_projek_akhir_kba.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = binding.etNama.getText().toString().trim();
                String email = binding.etRegemail.getText().toString().trim();
                String password = binding.etRegpassword.getText().toString().trim();

                if (TextUtils.isEmpty(nama)) {
                    binding.etNama.setError("Nama harus diisi");
                } else if (TextUtils.isEmpty(email)) {
                    binding.etRegemail.setError("Email harus diisi");
                } else if (TextUtils.isEmpty(email)) {
                    binding.etRegpassword.setError("Password harus diisi");
                }else{
                    Intent register = new Intent(RegisterActivity.this, RegisterSuccessActivity.class);
                    register.putExtra("nama", nama);
                    register.putExtra("email", email);
                    register.putExtra("password", password);
                    startActivity(register);
                    finish();
                }
            }
        });

        binding.tvPunyaakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pakun = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(Pakun);
            }
        });
    }
}