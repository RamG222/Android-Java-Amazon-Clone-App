package com.example.amazonclone;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends AppCompatActivity {
    RecyclerView rv_homepage_products;
    ImageView imageView;
    List<Integer> listofImages = new ArrayList<>();

    private rv_homepage_products_adapter rv_home_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rv_homepage_products = findViewById(R.id.rv_homepage_products);
        rv_homepage_products.setHasFixedSize(true);

        rv_homepage_products.setLayoutManager(new GridLayoutManager(this,1));

        //fetch this data from API
        listofImages.add(R.drawable.decore);

        rv_home_adapter = new rv_homepage_products_adapter(listofImages,this);
        rv_homepage_products.setAdapter(rv_home_adapter);
    }
}