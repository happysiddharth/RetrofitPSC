package com.example.retrofirpsc.network.service;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    public static Retrofit mujheRetroFitDo(){
        return new Retrofit
                .Builder()
                .baseUrl("https://gist.githubusercontent.com/")
                .addConverterFactory(
                        GsonConverterFactory.create()
                )
                .client(
                        new OkHttpClient()
                        .newBuilder()
                        .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                        .build()
                ).build();

    }
}
