package com.northcoders.recordshopapp.model;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class AlbumModel {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
