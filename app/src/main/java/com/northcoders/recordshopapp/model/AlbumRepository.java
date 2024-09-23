package com.northcoders.recordshopapp.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.northcoders.recordshopapp.AlbumModel;

import java.util.List;

public class AlbumRepository {

    private MutableLiveData<List<AlbumModel>> mutableLiveData = new MutableLiveData<>();
    private Application application;
}
