package com.example.orderingtraintickets;

import java.io.Serializable;

public class RailwayTicket implements Serializable{
    // поля
    private String name;
    private String departurePoint;
    private String arrivalPoint;
    private String departureTime;
    private String arrivalTime;
    private String ticketPrice;

    // пустой конструктор
    public RailwayTicket() {
    }

    // необходимый конструктор
    public RailwayTicket(String name, String departurePoint, String arrivalPoint, String departureTime, String arrivalTime, String ticketPrice) {
        this.name = name;
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketPrice = ticketPrice;
    }
    @Override
    public String toString() {
        return "Данные железнодорожного билета:\n" +
                "Идентификатор пассажира " + name + "\n" +
                "Место отправления поезда: " + departurePoint + "\n" +
                "Место прибытия поезда: " + arrivalPoint + "\n" +
                "Время отправления поезда: " + departureTime + "\n" +
                "Время при бытия поезда: " + arrivalTime + "\n" +
                "Цена билетат " + ticketPrice;
    }
}
