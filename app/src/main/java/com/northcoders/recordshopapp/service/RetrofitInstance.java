package com.northcoders.recordshopapp.service;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofit = null;

    private static final String BASE_URL = "http://192.168.1.165:8080/api/v1/";

    public static AlbumAPIService getService() {
        if(retrofit == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client) // Add the OkHttpClient with logging
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(AlbumAPIService.class);
    }
}
