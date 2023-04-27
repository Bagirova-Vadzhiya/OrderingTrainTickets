package com.example.orderingtraintickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    //поля
    private EditText nameIn;
    private EditText departurePointIn;
    private EditText arrivalPointIn;
    private EditText departureTimeIn;
    private EditText arrivalTimeIn;
    private TextView ticketPriceIn;
    private Button button;

    private String name;
    private String departurePoint;
    private String arrivalPoint;
    private String departureTime;
    private String arrivalTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка id к полям
        nameIn = findViewById(R.id.nameIn);
        departurePointIn = findViewById(R.id.departurePointIn);
        arrivalPointIn = findViewById(R.id.arrivalPointIn);
        departureTimeIn = findViewById(R.id.departureTimeIn);
        arrivalTimeIn = findViewById(R.id.arrivalTimeIn);
        ticketPriceIn = findViewById(R.id.ticketPriceIn);
        button = findViewById(R.id.button);

        // вывод информации о стоимости билета
        ticketPriceIn.setText("10 монет");

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // переключение на другой экран и передача данных

            // считывание данных с экрана
            name = nameIn.getText().toString();
            departurePoint = departurePointIn.getText().toString();
            arrivalPoint = arrivalPointIn.getText().toString();
            departureTime = departureTimeIn.getText().toString();
            arrivalTime = arrivalTimeIn.getText().toString();

            // создание объекта сущности пассажира
            RailwayTicket railwayTicket = new RailwayTicket( name, departurePoint, arrivalPoint, departureTime, arrivalTime, ticketPriceIn.getText().toString() );

            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra(RailwayTicket.class.getSimpleName(), railwayTicket);
            startActivity(intent);

        }
    };
}