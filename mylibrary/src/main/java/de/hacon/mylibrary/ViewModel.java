package de.hacon.mylibrary;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class ViewModel extends BaseObservable
{
    private int number = 42;

    @Bindable
    public String getNumber()
    {
        return String.valueOf(number);
    }

    public void onUpdateNumber()
    {
        number = (int) (Math.random() * 100);
        notifyPropertyChanged(BR.number);
    }
}
