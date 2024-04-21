package com.example.kurs;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FullBodyTrainingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body_training);

        // Находим кнопки на макете
        Button chestButton = findViewById(R.id.day1);
        Button backButton = findViewById(R.id.day2);
        Button legButton = findViewById(R.id.day3);

        // Устанавливаем обработчики нажатий для кнопок
        chestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переходим на активити с тренировкой груди
                Intent intent = new Intent(FullBodyTrainingActivity.this, day1Activity.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переходим на активити с тренировкой спины
                Intent intent = new Intent(FullBodyTrainingActivity.this, day2Activity.class);
                startActivity(intent);
            }
        });

        legButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переходим на активити с тренировкой ног
                Intent intent = new Intent(FullBodyTrainingActivity.this, day3Activity.class);
                startActivity(intent);
            }
        });
    }
}