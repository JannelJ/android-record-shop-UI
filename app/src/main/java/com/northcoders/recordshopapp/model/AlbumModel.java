package com.northcoders.recordshopapp.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class AlbumModel extends BaseObservable {

    @SerializedName("id")
    private Long id;

    @SerializedName("artist")
    private String artist;

    @SerializedName("albumName")
    private String albumName;

    @SerializedName("releaseDate")
    private LocalDate releaseDate;

    @SerializedName("price")
    private double price;

    @SerializedName("stockCount")
    private int stockCount;

    @SerializedName("isInStock")
    private boolean isInStock;

    @SerializedName("genre")
    private String genre;


    // no args
    public AlbumModel(){}


    // all args
    public AlbumModel(Long id, String artist, String albumName, LocalDate releaseDate, double price, int stockCount, boolean isInStock, String genre) {
        this.id = id;
        this.artist = artist;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.price = price;
        this.stockCount = stockCount;
        this.isInStock = isInStock;
        this.genre = genre;
    }
    @Bindable
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Bindable
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Bindable
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Bindable
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Bindable
    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    @Bindable
    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
