package com.example.orderingtraintickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    // поля
    private TextView ticketInfo;
    private Button button;

    private RailwayTicket railwayTicket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ticketInfo = findViewById(R.id.ticketInfo);
        button = findViewById(R.id.button);

        // считывание данных из главной активити
        Bundle bundleIntent = getIntent().getExtras();

        railwayTicket = (RailwayTicket) bundleIntent.getSerializable(RailwayTicket.class.getSimpleName());
        ticketInfo.setText(railwayTicket.toString());

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }
    // создания слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // переключение на другой экран
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(intent);
        }
    };
}