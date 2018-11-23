package com.fryanramzkhar.reviewbuku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.myRecycleView)
    RecyclerView myRecycleView;

    String[]  detailBuku;
    int[] gambarBuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        detailBuku = getResources().getStringArray(R.array.detail_buku);
        gambarBuku = new int[]{R.drawable.buku1,R.drawable.buku2,R.drawable.buku3,R.drawable.buku4,R.drawable.buku5,R.drawable.buku6,R.drawable.buku7,R.drawable.buku8};

        Adapter adapter = new Adapter(this, gambarBuku, detailBuku);
        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager (new GridLayoutManager(this, 2));
        myRecycleView.setAdapter(adapter);


    }
}
