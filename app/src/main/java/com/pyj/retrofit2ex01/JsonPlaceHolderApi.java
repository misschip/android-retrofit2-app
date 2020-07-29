package com.pyj.retrofit2ex01;


import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface JsonPlaceHolderApi {

    @GET("list_movies.json")
    Call<Yts> getMovies(@QueryMap Map<String,String> queryString);
}