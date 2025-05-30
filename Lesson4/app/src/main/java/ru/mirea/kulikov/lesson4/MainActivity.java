package ru.mirea.kulikov.lesson4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import ru.mirea.kulikov.lesson4.databinding.ActivityMainBinding ;
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding; // Переменная для ViewBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Разметка через ViewBinding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Текст
        binding.songTitle.setText("В Аквапарке");
        binding.artistName.setText("Kunteinir");
    }
}