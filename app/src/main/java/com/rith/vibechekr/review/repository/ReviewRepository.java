package com.rith.vibechekr.review.repository;

import static java.util.Objects.nonNull;

import android.util.Log;

import com.rith.vibechekr.common.controllers.ReviewApi;
import com.rith.vibechekr.common.model.ReviewDto;
import com.rith.vibechekr.common.utils.Resource;
import com.rith.vibechekr.review.common.RetrofitConfig;
import java.util.List;
import java.util.UUID;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReviewRepository {
    private ReviewApi reviewApi = RetrofitConfig.getInstance().create(ReviewApi.class);

    public Observable<Resource<List<ReviewDto>>> getAllReviews(UUID tenantId){
        return Observable.create(emitter -> {
            Call<List<ReviewDto>> api = reviewApi.getAllReviews(tenantId);
            api.enqueue(new Callback<List<ReviewDto>>() {
                @Override
                public void onResponse(Call<List<ReviewDto>> call, Response<List<ReviewDto>> response) {
                    if(nonNull(response.body()) && response.isSuccessful()){

                        emitter.onNext(Resource.success(response.body()));
                    }else{
                        emitter.onNext(Resource.error("ERROR"));
                    }
                }

                @Override
                public void onFailure(Call<List<ReviewDto>> call, Throwable throwable) {
                    emitter.onError(throwable);
                }
            });
        });
    }
}
