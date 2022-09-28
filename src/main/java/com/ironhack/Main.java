package com.ironhack;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        User user = new User(12345, "Jaume", Status.ONLINE);
        User user2 = new User(123456, "Jaume", Status.CANCELED);
        User user3 = new User(123457, "Jaume", Status.ONLINE);
        User user4 = new User(123458, "Antonio", Status.ONLINE);
        User user5 = new User(123458, "Pepe", Status.OFFLINE);

        Map<Long, User> users = new HashMap<>();

        users.put(user.getId(), user);
        users.put(user2.getId(), user2);
        users.put(user3.getId(), user3);
        users.put(user4.getId(), user4);
        users.put(user4.getId(), user5);

        System.out.println(users.size());

        for (User u : users.values()) {
            System.out.println(u.getName());
        }

        for (Long i : users.keySet()) {
            System.out.println(i);
        }


        Map<String, String> countries = new HashMap<>();

        countries.put("Spain", "Pedro Sánchez");
        countries.put("USA", "Joe Biden");
        countries.put("France", "Emmanuel Macron");

        String spain = countries.get("Spain");
        System.out.println(spain);




    }
}