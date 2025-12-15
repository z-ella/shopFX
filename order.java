package model;

import java.time.LocalDate;

public class Order {
    private int id;
    private int clientId;
    private LocalDate date;
    private String status;

    public Order(int id, int clientId, LocalDate date, String status) {
        this.id = id;
        this.clientId = clientId;
        this.date = date;
        this.status = status;
    }

    public int getId() { return id; }
    public int getClientId() { return clientId; }
    public LocalDate getDate() { return date; }
    public String getStatus() { return status; }
}
