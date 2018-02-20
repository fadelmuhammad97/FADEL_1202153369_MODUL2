package com.example.fadelmuhammadrizki.fadel_1202153369_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.List;

public class Menu extends AppCompatActivity {
    RadioGroup ragr;
    // untuk deklarasi objek
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ragr = findViewById(R.id.ragr);
    }

    public void masukmenu(View view) {
        int id = ragr.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        String pilih = rb.getText().toString();
        switch (pilih) {
            case "Take Away":
                startActivity(new Intent(Menu.this, TakeAway.class));
                Toast.makeText(Menu.this, "Take Away", Toast.LENGTH_SHORT).show();
                break;
            case "Dine In":
                startActivity(new Intent(Menu.this, DineIn.class));
                Toast.makeText(Menu.this, "Dine In", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}