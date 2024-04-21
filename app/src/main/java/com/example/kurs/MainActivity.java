package com.example.kurs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим кнопки на макете
        Button splitTrainingButton = findViewById(R.id.split_training_button);
        Button fullBodyTrainingButton = findViewById(R.id.full_body_training_button);

        // Устанавливаем обработчики нажатий для кнопок
        splitTrainingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переходим на активити с тренировкой сплит
                Intent intent = new Intent(MainActivity.this, SplitTrainingActivity.class);
                startActivity(intent);
            }
        });

        fullBodyTrainingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переходим на активити с тренировкой фуллбоди
                Intent intent = new Intent(MainActivity.this, FullBodyTrainingActivity.class);
                startActivity(intent);
            }
        });
    }
}