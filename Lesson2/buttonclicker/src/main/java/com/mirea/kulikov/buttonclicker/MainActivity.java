package com.mirea.kulikov.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button btnWhoAmI;
    private Button btnItsNotMe;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItsNotMe = findViewById(R.id.btnItsNotMe);
        checkBox = findViewById(R.id.checkBox); // Инициализация CheckBox

        btnWhoAmI.setOnClickListener(v -> {
            tvOut.setText("Мой номер по списку № 15");
            checkBox.setChecked(!checkBox.isChecked()); // Инвертируем состояние CheckBox
        });

        btnItsNotMe.setOnClickListener(v -> {
            tvOut.setText("Это не я сделал");
            checkBox.setChecked(!checkBox.isChecked()); // Инвертируем состояние CheckBox
        });
    }

    public void onMyButtonClick(View view) {
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
}
