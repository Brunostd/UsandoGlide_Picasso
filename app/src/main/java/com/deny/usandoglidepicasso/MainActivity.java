package com.deny.usandoglidepicasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Utilizando GLIDE
        imageView = findViewById(R.id.imageView);
        String url = "https://scontent.ffor1-3.fna.fbcdn.net/v/t1.6435-9/211547052_4220584298058262_8011756184358791426_n.jpg?_nc_cat=103&ccb=1-5&_nc_sid=174925&_nc_ohc=XcECnnpadgIAX_29CFl&_nc_ht=scontent.ffor1-3.fna&oh=010b3b2ad4e63bedac36d18a734e3d2c&oe=6197FC59";
        Glide.with(this).load(url).into(imageView);

        //Utilizando Picasso
        //Picasso.get().load(url).into(imageView);
    }
}