package ru.mirea.kulikov.multiactivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;




public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = getIntent().getStringExtra("key");
        TextView textView = findViewById(R.id.textView);
        textView.setText(text);
    }
}
