package org.example;

import redis.clients.jedis.JedisPubSub;

// --- Subscriber Class ---
public class Subscriber extends JedisPubSub {
    @Override
    public void onMessage(String channel, String message) {
        System.out.println("Received message: " + message); // Received message: Hello, World!
        this.unsubscribe();
    }
}
