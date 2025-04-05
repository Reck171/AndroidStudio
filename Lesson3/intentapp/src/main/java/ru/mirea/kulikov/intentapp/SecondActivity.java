package ru.mirea.kulikov.intentapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView receivedTimeTextView = findViewById(R.id.receivedTimeTextView);
        String receivedTime = getIntent().getStringExtra("time");

        String message = "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ " +
                "СОСТАВЛЯЕТ ЧИСЛО 289, а текущее время " + receivedTime;

        receivedTimeTextView.setText(message);
    }
}