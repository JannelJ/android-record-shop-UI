package com.northcoders.recordshopapp.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.northcoders.recordshopapp.AlbumModel;
import com.northcoders.recordshopapp.service.AlbumAPIService;
import com.northcoders.recordshopapp.service.RetrofitInstance;

import java.util.List;

import retrofit2.Call;

public class AlbumRepository {

    private MutableLiveData<List<AlbumModel>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public AlbumRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<AlbumModel>> getMutableLiveData() {
        AlbumAPIService albumApiService = RetrofitInstance.getService();
        Call<List<AlbumModel>> call = albumApiService.getAllAlbums();

    }

