package com.example.ahmed.intro_slider;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class LogoutActivity extends AppCompatActivity {
    private static final String TAG = " Logout Activity";

  //  private  static final int ACTIVITY_NUM = 1;


    private Context mContext = LogoutActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

    }

    /**
     * bottom nav setup
     */


      }


