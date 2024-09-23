package com.northcoders.recordshopapp.service;

import com.northcoders.recordshopapp.AlbumModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AlbumAPIService {

    @GET("albums")
    Call<List<AlbumModel>> getAllAlbums();
}
