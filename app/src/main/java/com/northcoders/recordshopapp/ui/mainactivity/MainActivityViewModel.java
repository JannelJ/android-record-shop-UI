package com.northcoders.recordshopapp.ui.mainactivity;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.northcoders.recordshopapp.AlbumModel;
import com.northcoders.recordshopapp.model.AlbumRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    AlbumRepository albumRepository;

    public MainActivityViewModel(Application application) {
        super(application);
        albumRepository = new AlbumRepository(application);
    }

    // Method to return the album data
    public LiveData<List<AlbumModel>> getAlbums() {
        return albumRepository.getMutableLiveData();
    }
}
