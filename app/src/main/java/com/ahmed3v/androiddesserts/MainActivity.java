package com.ahmed3v.androiddesserts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private ImageView donutImage, froyoImage, iceCreamImage;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donutImage = findViewById(R.id.donut_img);
        froyoImage = findViewById(R.id.froyo_img);
        iceCreamImage = findViewById(R.id.ice_cream_img);

        fab = findViewById(R.id.fab_btn);

        donutImage.setOnClickListener(v -> {

            Toast.makeText(this ,  R.string.donut_order_toast, Toast.LENGTH_SHORT).show();
        });


        froyoImage.setOnClickListener(v -> {

            Toast.makeText(this ,  R.string.froyo_order_toast, Toast.LENGTH_SHORT).show();
        });


        iceCreamImage.setOnClickListener(v -> {

            Toast.makeText(this ,  R.string.ice_cream_order_toast, Toast.LENGTH_SHORT).show();
        });

        fab.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, OrderActivity.class);
            startActivity(intent);
        });
    }
}