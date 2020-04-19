package com.mlabs.mock.hackerank;

import java.util.HashMap;
import java.util.Map;

public class DayEight {

    public static void main(String[] args) {
        // Create a Map of String Keys to String Values, implemented by the HashMap class
        Map<String, String> myMap = new HashMap<String, String>();
        // Adds ("Hi","Bye") mapping to myMap
        myMap.put("Hi","Bye");
        // Print the Value mapped to from "Hi"
        System.out.println(myMap.get("Hi"));
        // Replaces "Bye" mapping from "Hi" with "Bye!"
        myMap.put("Hi","Bye!");
        // Print the Value mapped to from "Hi"
        System.out.println(myMap.get("Hi"));
    }
}
