package com.rith.vibechekr.common.controllers;

import com.rith.vibechekr.common.model.ReviewDto;
import java.util.List;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ReviewApi {


    @GET("/v1/rvw/{tenantId}/review/")
    Call<List<ReviewDto>> getAllReviews(@Path("tenantId") UUID tenantId);

}
