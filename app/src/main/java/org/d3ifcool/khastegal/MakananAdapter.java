package org.d3ifcool.khastegal;

import android.content.Intent;
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

    String namaMakanan, detailMakanan, gambarMakanan;
    private ArrayList<Makanan> listMakanan;
    public MakananAdapter(ArrayList<Makanan> listMakanan) {this.listMakanan = listMakanan;}
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Makanan data);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Makanan makanan= listMakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makanan.getPhoto())
                .apply(new RequestOptions().override(200, 200))
                .into(holder.imgPhoto);
        holder.tvName.setText(makanan.getName());
        holder.tvDetail.setText(makanan.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("nama", listMakanan.get(position).getName());
                intent.putExtra("detail", listMakanan.get(position).getDetail());
                intent.putExtra("gambar", listMakanan.get(position).getPhoto());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return listMakanan.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
