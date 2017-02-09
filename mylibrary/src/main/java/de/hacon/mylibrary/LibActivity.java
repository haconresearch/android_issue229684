package de.hacon.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import de.hacon.mylibrary.databinding.ActivityLibBinding;

public class LibActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        View view = getLayoutInflater().inflate(R.layout.activity_lib, null);
        ActivityLibBinding binding = ActivityLibBinding.bind(view);
        binding.setModel(new ViewModel());
        setContentView(view);
    }

}
