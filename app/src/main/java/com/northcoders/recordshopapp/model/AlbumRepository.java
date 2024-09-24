package com.northcoders.recordshopapp.model;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

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
      //          if (response.isSuccessful()) {
                    List<AlbumModel> albumList = response.body();
                    mutableLiveData.setValue(albumList);
                Log.i("On Response", response.body().toString());

      //          }
            }

            @Override
            public void onFailure(Call<List<AlbumModel>> call, Throwable t) {
            Log.i("Get request failed", t.getMessage());
            }
        });

        return mutableLiveData;
    }
}

