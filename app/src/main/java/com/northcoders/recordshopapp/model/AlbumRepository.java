package com.northcoders.recordshopapp.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.northcoders.recordshopapp.AlbumModel;
import com.northcoders.recordshopapp.service.AlbumAPIService;
import com.northcoders.recordshopapp.service.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumRepository {

    private MutableLiveData<List<AlbumModel>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public AlbumRepository(Application application) {
        this.application = application;
    }

    public AlbumRepository() {
        
    }

    public MutableLiveData<List<AlbumModel>> getMutableLiveData() {
        AlbumAPIService albumApiService = RetrofitInstance.getService();
        Call<List<AlbumModel>> call = albumApiService.getAllAlbums();

        call.enqueue(new Callback<List<AlbumModel>>() {
            @Override
            public void onResponse(Call<List<AlbumModel>> call, Response<List<AlbumModel>> response) {
                if (response.isSuccessful()) {
                    List<AlbumModel> albumList = response.body();
                    mutableLiveData.setValue(albumList);

                }
            }

            @Override
            public void onFailure(Call<List<AlbumModel>> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }
}

