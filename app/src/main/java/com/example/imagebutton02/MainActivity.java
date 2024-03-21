package com.example.imagebutton02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    Random rnd = new Random();
    ImageButton imageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView);
        imageBtn= findViewById(R.id.imageBtn);

    }

    public void go(View view) {
        int[] imageResources = {R.drawable.image01, R.drawable.img, R.drawable.img_1};
        int randomIndex = rnd.nextInt(imageResources.length);
        imageView1.setImageResource(imageResources[randomIndex]);
    }
}
