package com.example.fadelmuhammadrizki.fadel_1202153369_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class TakeAway extends AppCompatActivity {
    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }
    // method untuk mengarahkan ke aktivitas selanjutnya
    public void liatmenuu(View view) {
        startActivity(new Intent(TakeAway.this, ListMenu.class));
        finish();
    }
}

