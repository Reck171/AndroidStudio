package ru.mirea.kulikov.systemintentsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import ru.mirea.kulikov.systemintentsapp.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openWebButton = findViewById(R.id.openWebButton);
        Button openMapButton = findViewById(R.id.openMapButton);
        Button openDialerButton = findViewById(R.id.openDialerButton);

        // Открытие веб-сайта
        openWebButton.setOnClickListener(v -> {
            Uri webpage = Uri.parse("https://mirea.ru");
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);
        });

        // Открытие координат на карте
        openMapButton.setOnClickListener(v -> {
            Uri geoLocation = Uri.parse("geo:55.794229,37.700772");
            Intent intent = new Intent(Intent.ACTION_VIEW, geoLocation);
            startActivity(intent);
        });

        // Открытие окна набора номера
        openDialerButton.setOnClickListener(v -> {
            Uri number = Uri.parse("tel:+74951234567");
            Intent intent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(intent);
        });
    }
}
