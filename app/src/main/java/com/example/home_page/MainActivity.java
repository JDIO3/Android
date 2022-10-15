package com.example.home_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //ImageSlider
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Home_Page); //splashScreen
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager); //ImageSlider
        //LoginActivity
        ImageButton login = (ImageButton) findViewById(R.id.imageButton2); //LoginActivity

        //LoginActivity Listener
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity();
            }
        });

        List<Integer> imageList= new ArrayList<>();
        imageList.add(R.drawable.weather_forecast_poster);
        imageList.add(R.drawable.farm_bank_yojna);
        imageList.add(R.drawable.farm_bill);

        MyAdapter myAdapter= new MyAdapter(imageList);
        viewPager.setAdapter(myAdapter);
    }

    //LoginActivity Intent
    public void LoginActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}