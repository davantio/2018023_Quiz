package com.example.a2018023_quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nama, alamat, nomor, hasilnama, hasilalamat, hasilnomor;
    Button proses;

    PembeliViewModel pembeliViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.et_nama);
        alamat = findViewById(R.id.et_alamat);
        nomor = findViewById(R.id.et_telepon);
        hasilnama = findViewById(R.id.tv_hslnama);
        hasilalamat = findViewById(R.id.tv_hslalamat);
        hasilnomor = findViewById(R.id.tv_hslno);
        proses = findViewById(R.id.bt_proses);

        pembeliViewModel = new ViewModelProvider(this).get(PembeliViewModel.class);

        pembeliViewModel.getNama().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                hasilnama.setText(s);
            }
        });

        pembeliViewModel.getAlamat().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                hasilalamat.setText(s);
            }
        });

        pembeliViewModel.getNomor().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                hasilnomor.setText(s);
            }
        });

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pembeliViewModel.getNama().setValue(nama.getText().toString());
                pembeliViewModel.getAlamat().setValue(alamat.getText().toString());
                pembeliViewModel.getNomor().setValue(nomor.getText().toString());
            }
        });
    }
}