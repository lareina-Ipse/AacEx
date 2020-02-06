package kr.co.chience.accex;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    public MutableLiveData<Integer> count = new MutableLiveData<>();

    public CounterViewModel() {
        count.setValue(0);
    }

    public void increase() {
        count.setValue(count.getValue() + 1);
    }

    public void decrease() {
        count.setValue(count.getValue() - 1);
    }

}

