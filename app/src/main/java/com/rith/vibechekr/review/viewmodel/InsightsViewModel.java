package com.rith.vibechekr.review.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.rith.vibechekr.common.model.ReviewDto;
import com.rith.vibechekr.common.utils.Resource;
import com.rith.vibechekr.review.repository.ReviewRepository;
import java.util.List;
import java.util.UUID;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class InsightsViewModel extends AndroidViewModel {
    private ReviewRepository repository;
    private CompositeDisposable compositeDisposable;
    private MutableLiveData<Resource<List<ReviewDto>>> reviewsMutableLiveData = new MutableLiveData<>();
    public InsightsViewModel(@NonNull Application application) {
        super(application);
        compositeDisposable = new CompositeDisposable();
        repository = new ReviewRepository();
    }

    public LiveData<Resource<List<ReviewDto>>> getAllReviewsByTenant(){
        return reviewsMutableLiveData;
    }
    public void fetchAllReviewsByTenant(UUID tenantId){
        Disposable disposable = repository.getAllReviews(tenantId)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(
                        success ->{
                            reviewsMutableLiveData.postValue(Resource.success(success.data));
                        },err->{
                            reviewsMutableLiveData.postValue(Resource.error("Something went wrong"));
                        },()->{}
                );
        compositeDisposable.add(disposable);
    }
}
