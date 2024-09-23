package com.northcoders.recordshopapp.ui.mainactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.northcoders.recordshopapp.R;
import com.northcoders.recordshopapp.databinding.LayoutBinding;
import com.northcoders.recordshopapp.model.AlbumModel;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {

    private List<AlbumModel> albumModelList;
    private Context context;

    public AlbumAdapter(List<AlbumModel> albumModelList, Context context) {
        this.context = context;
        this.albumModelList = albumModelList;
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        private LayoutBinding layoutBinding;

        public AlbumViewHolder(LayoutBinding layoutBinding) {
            super(layoutBinding.getRoot());
            this.layoutBinding = layoutBinding;
        }
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout, parent, false);
        return new AlbumViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        AlbumModel album = albumModelList.get(position);
        holder.layoutBinding.setAlbumModel(album);
    }

    // Method to return the total number of items in the data list
    @Override
    public int getItemCount() {
        return albumModelList.size();

        }

    }

