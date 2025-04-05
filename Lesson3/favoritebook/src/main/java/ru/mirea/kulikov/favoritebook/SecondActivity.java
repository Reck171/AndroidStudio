package ru.mirea.kulikov.favoritebook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView developerBookTextView = findViewById(R.id.developerBookTextView);
        TextView developerQuoteTextView = findViewById(R.id.developerQuoteTextView);
        EditText userBookEditText = findViewById(R.id.userBookEditText);
        EditText userQuoteEditText = findViewById(R.id.userQuoteEditText);
        Button submitButton = findViewById(R.id.submitButton);

        // Данные о любимой книге разработчика
        developerBookTextView.setText("Любимая книга разработчика: \"1984\"");
        developerQuoteTextView.setText("Цитата из книги: \"Свобода - это возможность сказать, что дважды два - четыре.\"");

        submitButton.setOnClickListener(view -> {
            String book = userBookEditText.getText().toString();
            String quote = userQuoteEditText.getText().toString();

            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            intent.putExtra("book", book);
            intent.putExtra("quote", quote);
            startActivity(intent);
        });
    }
}
