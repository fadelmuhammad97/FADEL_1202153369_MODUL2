package com.example.fadelmuhammadrizki.fadel_1202153369_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<pilihMenu> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        listmenu.add(new pilihMenu(R.drawable.bruschetta, "bruschetta", 20000, "roti panggang, bawah putih, minyak zaitun, garam, merica"));
        listmenu.add(new pilihMenu(R.drawable.lasagna, "lasagna", 10000, "ragù, bechamel, dan Parmigiano Reggiano"));
        listmenu.add(new pilihMenu(R.drawable.panino, "panino", 17000, "ciabatta, rosetta dan baguette"));
        listmenu.add(new pilihMenu(R.drawable.tortellini, "tortellini", 20000, "campuran daging panggang atau keju"));
        listmenu.add(new pilihMenu(R.drawable.tramezzino, "tramezzino", 22000, "potongan tuna, buah zaitun dan prosciutto"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}