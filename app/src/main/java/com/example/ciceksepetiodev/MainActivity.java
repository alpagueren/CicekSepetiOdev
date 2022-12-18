package com.example.ciceksepetiodev;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.ciceksepetiodev.databinding.ActivityMainBinding;
import com.example.ciceksepetiodev.rw1.rw1;
import com.example.ciceksepetiodev.rw1.rw1Adaptar;
import com.example.ciceksepetiodev.rw2.rw2;
import com.example.ciceksepetiodev.rw2.rw2Adapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //CircleCardları çektiğim yer
        binding.rw1.setLayoutManager(new StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.VERTICAL));
        ArrayList<rw1> rwListesi = new ArrayList<>();
        rw1 rw1 = new rw1(1,"image_bes","image_bir","Günün Fırsatları");
        rw1 rw2 = new rw1(1,"image_alti","image_iki","Yılbaşı Fırsatları");
        rw1 rw3 = new rw1(1,"image_yedi","image_uc","Yılbaşı hediyeleri");
        rw1 rw4 = new rw1(1,"image_sekiz","image_dort","Doğum Günü");
        rw1 rw5 = new rw1(1,"image_dokuz","image_bes","Aynı Gün Çiçek");
        rw1 rw6 = new rw1(1,"image_onbir","image_alti","Kişiye Özel Hediye");
        rwListesi.add(rw1);
        rwListesi.add(rw2);
        rwListesi.add(rw3);
        rwListesi.add(rw4);
        rwListesi.add(rw5);
        rwListesi.add(rw6);

        rw1Adaptar adapter = new rw1Adaptar(this,rwListesi);
        binding.rw1.setAdapter(adapter);

        //CardTasarımları çektiğim yer
        binding.rw2.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        ArrayList<rw2> rw2Listesi = new ArrayList<>();
        rw2 r1 = new rw2(2,"image_iki","image_bir");
        com.example.ciceksepetiodev.rw2.rw2 r2 = new rw2(2,"image_uc","image_iki");
        rw2 r3 = new rw2(2,"image_dort","image_uc");
        rw2 r4 = new rw2(2,"image_bir","image_dort");
        rw2 r5 = new rw2(2,"image_iki","image_bes");
        rw2 r6 = new rw2(2,"image_uc","image_alti");
        rw2 r7 = new rw2(2,"image_dort","image_bir");
        rw2Listesi.add(r1);
        rw2Listesi.add(r2);
        rw2Listesi.add(r3);
        rw2Listesi.add(r4);
        rw2Listesi.add(r5);
        rw2Listesi.add(r6);
        rw2Listesi.add(r7);

        rw2Adapter adapters = new rw2Adapter(this,rw2Listesi);
        binding.rw2.setAdapter(adapters);
    }
}