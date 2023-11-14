package com.kelompok8.finalproject2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_admin);

        // Mendapatkan referensi ke tombol login dari layout
        Button loginButton = findViewById(R.id.loginbutton);

        // Menambahkan onClickListener untuk menangani klik tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Memulai aktivitas baru setelah login berhasil
                Intent intent = new Intent(MainActivity.this, halaman_admin.class);
                startActivity(intent);
            }
        });
    }
}
