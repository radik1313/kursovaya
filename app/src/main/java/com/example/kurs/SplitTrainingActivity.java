package com.example.kurs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SplitTrainingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split_training);

        // Находим кнопки
        Button chestButton = findViewById(R.id.chest_split_button);
        Button backButton = findViewById(R.id.back_split_button);
        Button legButton = findViewById(R.id.leg_split_button);

        // Устанавливаем обработчики нажатий для кнопок
        chestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переходим на активити с тренировкой груди
                Intent intent = new Intent(SplitTrainingActivity.this, ChestSplitActivity.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переходим на активити с тренировкой спины
                Intent intent = new Intent(SplitTrainingActivity.this, BackSplitActivity.class);
                startActivity(intent);
            }
        });

        legButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переходим на активити с тренировкой ног
                Intent intent = new Intent(SplitTrainingActivity.this, LegSplitActivity.class);
                startActivity(intent);
            }
        });
    }
}