package com.example.longway;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelWithLiveData extends ViewModel {
    private MutableLiveData<Integer> likedNumber;
    
    public MutableLiveData<Integer> getlikedNumber() {
        if (likedNumber == null) {
            likedNumber = new MutableLiveData<>();
            likedNumber.setValue(0);
        }
        return likedNumber;
    }
    
    public void addlikedNumber(int n) {
        likedNumber.setValue(likedNumber.getValue() + n);
    }
    
}
