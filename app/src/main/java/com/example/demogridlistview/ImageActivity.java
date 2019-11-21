package com.example.demogridlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageActivity extends AppCompatActivity {

    AppCompatImageView imageView;
    AppCompatTextView textImage;
    Gallary gallary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent intent = getIntent();
        gallary = (Gallary)intent.getSerializableExtra("obj");
        ImageView imageView = findViewById(R.id.image_view);
        imageView.setImageResource(gallary.getImage());

        TextView textImage = findViewById(R.id.txt_image_name);
        textImage.setText(gallary.getImagename());

    }

}
