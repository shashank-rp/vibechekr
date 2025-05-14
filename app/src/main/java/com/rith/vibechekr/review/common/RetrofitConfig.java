package com.rith.vibechekr.review.common;

import static java.util.Objects.isNull;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {
    private static Retrofit retrofit = null;
    public static Retrofit getInstance(){
        if(isNull(retrofit)){
            OkHttpClient client = new OkHttpClient
                    .Builder().build();

            retrofit =  new Retrofit.Builder()
                    .baseUrl(ConfigPaths.BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
