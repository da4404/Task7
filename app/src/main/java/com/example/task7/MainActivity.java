package com.example.task7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Random random;
    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageButton = findViewById(R.id.imageButton);
        random = new Random ();

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                int randomNumber = random.nextInt(3) + 1;
                imageView.setImageResource(R.drawable.albert);
                switch (randomNumber) {
                    case 1:
                        imageView.setImageResource(R.drawable.albert);
                        imageButton.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.haha);
                        imageButton.setImageResource(R.drawable.two);
                        break;
                   
                }
            }
        });
    }
}

    }
}