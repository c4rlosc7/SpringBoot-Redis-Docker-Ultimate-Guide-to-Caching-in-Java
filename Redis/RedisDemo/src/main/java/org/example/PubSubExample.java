package org.example;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

// --- Main Class (Publisher + Subscriber Starter) ---
public class PubSubExample {
    public static void main(String[] args) {
        // Connect to the Redis server
        Jedis jedis = new Jedis("localhost", 6379);

        // Perform Redis operations here
        jedis.set("name", "Andres");

        jedis.hset("user:1", "name", "Alice");
        jedis.hset("user:1", "age", "25");

        // Add items to a list
        jedis.lpush("fruits", "apple", "banana", "orange");

        // Add items to a set
        jedis.sadd("tags", "java", "redis", "programming");

        // Get the value by key
        String name = jedis.get("name");
        System.out.println("Name: " + name);

        // Get field values from a hash
        String userName = jedis.hget("user:1", "name");
        String userAge = jedis.hget("user:1", "age");
        System.out.println("User: " + userName + ", Age: " + userAge);

        // Get items from a list
        List<String> fruits = jedis.lrange("fruits", 0, -1);
        System.out.println("Fruits: " + fruits);

        // Get all items in a set
        Set<String> tags = jedis.smembers("tags");
        System.out.println("Tags: " + tags);

        // Close the connection
        jedis.close();
    }
}