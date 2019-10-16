package org.d3ifcool.khastegal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {

    private ArrayList<Makanan> listMakanan;
    public MakananAdapter(ArrayList<Makanan> listMakanan) {this.listMakanan = listMakanan;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Makanan makanan= listMakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makanan.getPhoto())
                .apply(new RequestOptions().override(200, 200))
                .into(holder.imgPhoto);
        holder.tvName.setText(makanan.getName());

    }

    @Override
    public int getItemCount() { return listMakanan.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
        }
    }
}
