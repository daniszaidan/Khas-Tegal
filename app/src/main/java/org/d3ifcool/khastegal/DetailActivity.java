package org.d3ifcool.khastegal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    TextView tvName, tvDetail;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String nama = getIntent().getStringExtra("nama");
        String detail = getIntent().getStringExtra("detail");
        int gambar = getIntent().getIntExtra("gambar", 0);

        getSupportActionBar().setTitle(nama + " | Khas Tegal");

        tvName = findViewById(R.id.tv_name);
        tvDetail = findViewById(R.id.tv_detail);
        imgPhoto = findViewById(R.id.imageView);

        tvName.setText(nama);
        tvDetail.setText(detail);
        imgPhoto.setImageResource(gambar);

    }
}
