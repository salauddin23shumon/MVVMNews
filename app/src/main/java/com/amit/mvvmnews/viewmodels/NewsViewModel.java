package com.amit.mvvmnews.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.amit.mvvmnews.model.NewsResponse;
import com.amit.mvvmnews.networking.NewsRepository;


public class NewsViewModel extends ViewModel {

    private MutableLiveData<NewsResponse> mutableLiveData;
    private NewsRepository newsRepository;

    public void init(){
        if (mutableLiveData != null){
            return;
        }
        newsRepository = NewsRepository.getInstance();
        mutableLiveData = newsRepository.getNews("google-news", "a61312b54f2e4c9a9dd96e2cccacc33f");

    }

    public LiveData<NewsResponse> getNewsRepository() {
        return mutableLiveData;
    }

}
