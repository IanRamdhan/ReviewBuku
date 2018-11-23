package com.fryanramzkhar.reviewbuku;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    Context context;
    int[] gambarBuku;
    String[] detailBuku;

    public Adapter(Context context, int[] gambarBuku, String[] detailBuku) {
        this.context = context;
        this.gambarBuku = gambarBuku;
        this.detailBuku = detailBuku;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_buku, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        Glide.with(context).load(gambarBuku[i]).into(viewHolder.imgBuku);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, DetailBuku.class);
                pindah.putExtra("db", detailBuku[i]);
                pindah.putExtra("gb", gambarBuku[i]);
                context.startActivity(pindah);
            }
        });


    }

    @Override
    public int getItemCount() {
        return gambarBuku.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBuku;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBuku = itemView.findViewById(R.id.imgBuku);

        }
    }
}
