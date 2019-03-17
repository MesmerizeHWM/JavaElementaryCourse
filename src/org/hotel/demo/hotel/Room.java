package org.hotel.demo.hotel;

import org.hotel.demo.client.Client;

public class Room {

    private double square;
    private int places;
    private Double price;
    private boolean occupied;
    private Client occupiedBy;

    public Room(double square, int places) {
        this.square = square;
        this.places = places;
    }

    public boolean book(Client client) {
        if (occupied) {
            return false;
        }
        occupiedBy = client;
        occupied = true;
        return true;
    }

    public boolean release() {
        if (occupied) {
            occupied = false;
            occupiedBy = null;
            return true;
        }
        return false;
    }
}
