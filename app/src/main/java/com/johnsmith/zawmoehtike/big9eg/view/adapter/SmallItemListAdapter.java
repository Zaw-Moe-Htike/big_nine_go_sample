package com.johnsmith.zawmoehtike.big9eg.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.johnsmith.zawmoehtike.big9eg.R;
import com.johnsmith.zawmoehtike.big9eg.model.Item;

import java.util.List;

/*
    Created at 16/03/19 by Zaw Moe Htike
 */
public class SmallItemListAdapter extends RecyclerView.Adapter<SmallItemListAdapter.MyViewHolder> {

    private Context mContext;
    private List<Item> itemList;

    public SmallItemListAdapter(Context mContext, List<Item> itemList) {
        this.mContext = mContext;
        this.itemList = itemList;
    }   //  Constructor

    //  Create View Holder
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.small_item, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(itemView);

        return myViewHolder;
    }

    //  Bind View Holder and Data
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item item = itemList.get(position);

        holder.bindView(item);
    }

    //  Count
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvItemName;
        private ImageView ivItemIcon;
        private Item item;

        public MyViewHolder(View view) {
            super(view);
            tvItemName = (TextView) view.findViewById(R.id.tvItemName);
            ivItemIcon = (ImageView) view.findViewById(R.id.ivItemIcon);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, item.getItemName() + " is selected!", Toast.LENGTH_SHORT).show();
                }
            });

        }

        public void bindView(Item item){

            this.item = item;

            tvItemName.setText(item.getItemName());

            Glide.with(mContext).load(item.getItemIcon()).into(ivItemIcon);
        }
    }   //  MyViewHolder Class

}
