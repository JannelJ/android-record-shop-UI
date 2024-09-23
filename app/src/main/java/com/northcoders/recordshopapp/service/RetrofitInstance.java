package com.northcoders.recordshopapp.service;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

public class RetrofitInstance {

    private static RetrofitInstance retrofit = null;

    private static final String BASE_URL = "http://192.168.1.165:8080/api/v1/albums/";

    public static AlbumAPIService getService() {
        if(retrofit == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .build();
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor;
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .build();
        }

    }
}
