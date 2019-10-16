package org.d3ifcool.khastegal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMakanan;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakanan = findViewById(R.id.recycler_view);
        rvMakanan.setHasFixedSize(true);

        list.addAll(MakananData.getListData());

        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        MakananAdapter makananAdapter= new MakananAdapter(list);
        rvMakanan.setAdapter(makananAdapter);


    }

}
