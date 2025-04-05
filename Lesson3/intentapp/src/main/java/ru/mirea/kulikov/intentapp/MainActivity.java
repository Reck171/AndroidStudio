package ru.mirea.kulikov.intentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView timeTextView = findViewById(R.id.timeTextView);
        Button nextButton = findViewById(R.id.nextButton);

        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
        String dateString = sdf.format(new Date(dateInMillis));

        timeTextView.setText(dateString);

        nextButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("time", dateString);
            startActivity(intent);
        });
    }
}