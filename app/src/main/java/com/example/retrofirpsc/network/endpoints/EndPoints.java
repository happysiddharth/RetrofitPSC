package com.example.retrofirpsc.network.endpoints;

import com.example.retrofirpsc.model.ResponseDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EndPoints {
    @GET("Dcosta2205/cd3bf4cfdf6911fb26ae95672adb468e/raw/62d68fac146598cdba379317011ac9aa1aca8621/movies_db")
    Call<ResponseDTO> getMovies();


}
