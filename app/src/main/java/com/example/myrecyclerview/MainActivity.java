package com.example.myrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Paint> list = new ArrayList<>(); //panggil array yang sudah dibuat pada PaintsData.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(PaintsData.getListData()); //panggil PaintsData nya, ambil list data yang ada di line 12, pindahkan kesini
        showRecyclerList(); //untuk menampilkannya
        showRecyclerGrid();
    }

    private void showRecyclerGrid() {
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridPaintAdapter gridPaintAdapter = new GridPaintAdapter(list);
        rvCategory.setAdapter(gridPaintAdapter);
    }

    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListPaintAdapter listPaintAdapter = new ListPaintAdapter(this);
        listPaintAdapter.setListPaint(list);
        rvCategory.setAdapter(listPaintAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //membuat sebuah menu
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //untuk memilih mana yang ingin dipilih
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;

            case R.id.action_grid:
                showRecyclerGrid();
                break;

            case R.id.action_card:
                break;
        }
    }
}