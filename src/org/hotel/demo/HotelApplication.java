package org.hotel.demo;

import org.hotel.demo.client.Client;
import org.hotel.demo.hotel.Hotel;
import org.hotel.demo.hotel.Room;

public class HotelApplication {

    public static void main(String[] args) {

        Room[][] hiltonRooms = new Room[1][1];
        Hotel hiltonHotel = new Hotel("Hilton", hiltonRooms);
        Client client1 = new Client("380999999999", "Tet client1");
        Client client2 = new Client("380777777777", "Tet client2");
    }
}
