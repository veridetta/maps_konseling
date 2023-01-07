package com.example.uas_2011501059_efridoridman_lokasipelayanankonseling.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Rating;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uas_2011501059_efridoridman_lokasipelayanankonseling.MapActivity;
import com.example.uas_2011501059_efridoridman_lokasipelayanankonseling.R;
import com.example.uas_2011501059_efridoridman_lokasipelayanankonseling.model.Mapdata;

import java.util.List;

public class MapAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE = 1;
    private  Context context =null;
    private  List<Object> listRecyclerItem = null;

    public MapAdapter(Context context, List<Object> listRecyclerItem) {
        this.context = context;
        this.listRecyclerItem = listRecyclerItem;
    }



    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView name, address, phone;
        RatingBar ratingBar;
        CardView cardView;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            address = (TextView) itemView.findViewById(R.id.address);
            phone = (TextView) itemView.findViewById(R.id.phone);
            ratingBar = itemView.findViewById(R.id.rating);
            cardView = itemView.findViewById(R.id.cd_map);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE:
            default:
                View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                        R.layout.ly_map, viewGroup, false);
                return new ItemViewHolder((layoutView));
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int viewType = getItemViewType(i);
        switch (viewType) {
            case TYPE:
            default:
                ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
                Mapdata mapdata = (Mapdata) listRecyclerItem.get(i);
                itemViewHolder.name.setText(mapdata.getName());
                itemViewHolder.address.setText(mapdata.getAddress());
                itemViewHolder.phone.setText(mapdata.getPhone());
                itemViewHolder.ratingBar.setRating(Float.parseFloat(mapdata.getRating()));
                itemViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context, MapActivity.class);
                        intent.putExtra("link",mapdata.getLink());
                        context.startActivity(intent);

                    }
                });
        }

    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size();
    }
}