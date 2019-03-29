package com.johnsmith.zawmoehtike.big9eg.view.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.azoft.carousellayoutmanager.CarouselLayoutManager;
import com.johnsmith.zawmoehtike.big9eg.R;
import com.johnsmith.zawmoehtike.big9eg.model.Big9Data;
import com.johnsmith.zawmoehtike.big9eg.model.SubPage;

/*
    This Adapter is the Parent of Medium Item List Adapter,
    Small Item List Adapter and Carousel Item List Adapter.

    Created at 16/03/19 by Zaw Moe Htike
    Modified at 17/03/19 by Zaw Moe Htike
 */
public class ItemParentListAdapter extends RecyclerView.Adapter<ItemParentListAdapter.MyViewHolder> {

    private Big9Data big9Data;
    private Context context;

    public ItemParentListAdapter(Big9Data big9Data, Context context) {
        this.big9Data = big9Data;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.small_item_parent, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SubPage subPage = big9Data.getSubPage().get(position);

        holder.tvSubPageName.setText(subPage.getSubPageName());

        if(subPage.getSubPageType().equals("List")) {

            LinearLayoutManager hs_linearLayout = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

            holder.rvItems.setLayoutManager(hs_linearLayout);
            holder.rvItems.setHasFixedSize(true);
            SmallItemListAdapter smallItemListAdapter = new SmallItemListAdapter(context, subPage.getItems());
            holder.rvItems.setAdapter(smallItemListAdapter);

        } else if(subPage.getSubPageType().equals("SingleItem")) {

            LinearLayoutManager hs_linearLayout = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

            holder.rvItems.setLayoutManager(hs_linearLayout);
            holder.rvItems.setHasFixedSize(true);
            MediumItemListAdapter mediumItemListAdapter = new MediumItemListAdapter(context, subPage.getItems());
            holder.rvItems.setAdapter(mediumItemListAdapter);

        } else if(subPage.getSubPageType().equals("Carousel")) {

            LinearLayoutManager hs_linearLayout = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
            CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL, true);

            holder.rvItems.setLayoutManager(hs_linearLayout);
            holder.rvItems.setHasFixedSize(true);
            CarouselItemListAdapter carouselItemListAdapter = new CarouselItemListAdapter(context, subPage.getItems());
            holder.rvItems.setAdapter(carouselItemListAdapter);

        } else {

            LinearLayoutManager hs_linearLayout = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
            holder.rvItems.setLayoutManager(hs_linearLayout);
            holder.rvItems.setHasFixedSize(true);
            SmallItemListAdapter smallItemListAdapter = new SmallItemListAdapter(context, subPage.getItems());
            holder.rvItems.setAdapter(smallItemListAdapter);

        }
    }

    @Override
    public int getItemCount() {
        return big9Data.getSubPage().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvSubPageName;
        public RecyclerView rvItems;

        public MyViewHolder(View view) {
            super(view);
            tvSubPageName = (TextView) view.findViewById(R.id.tvSubPageName);
            rvItems = (RecyclerView)view.findViewById(R.id.rvItems);
        }
    }
}
