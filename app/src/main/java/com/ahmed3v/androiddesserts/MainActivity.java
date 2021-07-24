package com.ahmed3v.androiddesserts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";
    private ImageView donutImage, froyoImage, iceCreamImage;
    private FloatingActionButton fab;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){

            case R.id.action_contact:
                Toast.makeText(this , R.string.action_contact_toast, Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_orders:
                Toast.makeText(this , R.string.action_order_toast, Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_status:
                Toast.makeText(this , R.string.action_status_toast, Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_favorites:
                Toast.makeText(this , R.string.action_favorites_toast, Toast.LENGTH_SHORT).show();
                return true;

        }

        return true;
    }
}