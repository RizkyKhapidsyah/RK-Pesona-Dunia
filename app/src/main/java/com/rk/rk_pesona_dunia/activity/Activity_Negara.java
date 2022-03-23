package com.rk.rk_pesona_dunia.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.rk.rk_pesona_dunia.R;
import com.rk.rk_pesona_dunia.adapter.Adapter_CardViewNegara;
import com.rk.rk_pesona_dunia.adapter.Adapter_ListNegara;
import com.rk.rk_pesona_dunia.data.Data_GetterSetter;
import com.rk.rk_pesona_dunia.data.Data_Rincian;

import java.util.ArrayList;

public class Activity_Negara extends AppCompatActivity {
    private RecyclerView RecyclerView_NegaraNegara;
    private ArrayList<Data_GetterSetter> daftarDataGetterSetter = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView_NegaraNegara = findViewById(R.id.RecyclerView_Negara);
        RecyclerView_NegaraNegara.setHasFixedSize(true);

        daftarDataGetterSetter.addAll(Data_Rincian.dapatkanListDataNegara());
        Intent i = getIntent();

        tampilkanRecyclerView_ModeList_Negara();

        aturJudulActivity("Pilih Negara");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        pilihMenu(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void pilihMenu(int itemDipilih) {
        switch (itemDipilih) {
            case R.id.sub_menu_mode_tampilan_list:
                tampilkanRecyclerView_ModeList_Negara();
                break;
            case R.id.sub_menu_mode_tampilan_cardview:
                tampilkanRecyclerView_ModeCardView_Negara();
                break;
            case R.id.menu_bantuan:
                break;
            //menunggu code
            case R.id.menu_keluar:
                break;
            //menunggu code
        }
    }

    private void tampilkanRecyclerView_ModeList_Negara() {
        RecyclerView_NegaraNegara.setLayoutManager(new LinearLayoutManager(this));
        Adapter_ListNegara adapter_listNegara = new Adapter_ListNegara(daftarDataGetterSetter);
        RecyclerView_NegaraNegara.setAdapter(adapter_listNegara);
    }

    private void tampilkanRecyclerView_ModeCardView_Negara() {
        RecyclerView_NegaraNegara.setLayoutManager(new LinearLayoutManager(this));
        Adapter_CardViewNegara adapter_cardViewNegara = new Adapter_CardViewNegara(daftarDataGetterSetter);
        RecyclerView_NegaraNegara.setAdapter(adapter_cardViewNegara);
    }

    public void aturJudulActivity(String judulActivity) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(judulActivity);
        }
    }

}