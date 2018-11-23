package com.fryanramzkhar.reviewbuku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailBuku extends AppCompatActivity {


    @BindView(R.id.imgBuku)
    ImageView imgBuku;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);
        ButterKnife.bind(this);

        txtDetail.setText(getIntent().getStringExtra("db"));
        Glide.with(this).load(getIntent().getIntExtra("gb",0)).into(imgBuku);


    }
}
