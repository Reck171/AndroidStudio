package ru.mirea.kulikov.favoritebook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView bookInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookInfoTextView = findViewById(R.id.bookInfoTextView);
        Button openInputScreenButton = findViewById(R.id.openInputScreenButton);

        // Проверяем, есть ли данные из SecondActivity
        if (getIntent().hasExtra("book") && getIntent().hasExtra("quote")) {
            String book = getIntent().getStringExtra("book");
            String quote = getIntent().getStringExtra("quote");
            bookInfoTextView.setText("Название Вашей любимой книги: " + book +
                    ".\nЦитата: " + quote);
        } else {
            bookInfoTextView.setText("Тут появится название вашей любимой книги и любимая цитата из нее!");
        }

        openInputScreenButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}
