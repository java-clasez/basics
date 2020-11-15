package com.javaclass;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        // Store a list of phone numbers for utility companies
        // name of the company (String) - phone number (String)

        HashMap<String, String> map = new HashMap<>();
        map.put("PGE", "8001234567");
        map.put("ATT", "8883334445");
        map.put("COMCAST", "8005678775");

        System.out.println(map);

        // Get the phone number for some provider (key)
        String name = "COMCAST";

        if(map.containsKey(name)) {
            String phone = map.get(name);
            System.out.println("Provider " + name + " / phone " + phone);
        } else {
            System.out.println("Map does not contain any number for " + name);
        }

        // TODO Use Iterator to loop over the elements of the map (Do the list/set assignment before this)
        // - You may have to create two separate lists
        // - for the names and phones
        // - Given a name - find his/her phone number
    }
}
