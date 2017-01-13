package com.im.server;

import com.im.services.HotelServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {
    protected Server() throws Exception {
        System.out.println("Starting Server");
        HotelServiceImpl implementor = new HotelServiceImpl();
        String address = "http://localhost:9000/hotel";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws Exception {
        new Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
