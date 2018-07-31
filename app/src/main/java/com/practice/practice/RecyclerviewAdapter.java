package com.practice.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {
    private List<Song> mSongList;

    public RecyclerviewAdapter(List<Song> mSongList) {
        this.mSongList = mSongList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.single_card_layout_for_recyclerview,parent,false);
        return new ViewHolder(view);
    }




    @Override

    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTitleView.setText(mSongList.get(position).getTitle());
        holder.mDescriptionView.setText(mSongList.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
       return mSongList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTitleView,mDescriptionView;
        public ViewHolder(View view) {
            super(view);
            mTitleView = view.findViewById(R.id.id_title);
            mDescriptionView=view.findViewById(R.id.id_description);
        }
    }


}
