package com.northcoders.recordshopapp;

import java.time.LocalDate;

public class AlbumModel {

    private Long id;
    private String artist;
    private String albumName;
    private LocalDate releaseDate;
    private double price;
    private int stockCount;
    private boolean isInStock;
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
