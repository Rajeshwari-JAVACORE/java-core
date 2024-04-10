package com.p8;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook1 {
	 public static void main(String[] args) {
	        // Create a HashMap to store phone book details
	        Map<String, String> phoneBook = new HashMap<>();
	        
	        // Predefined phone book details
	        phoneBook.put("Ani", "998787823");
	        phoneBook.put("Manju", "937843978");
	        phoneBook.put("Jay", "7882221113");
	        phoneBook.put("Suresh", "8293893311");
	        phoneBook.put("Karthi", "7234560011");
	        
	        // List all phone book details
	        System.out.println("Phone Book Details:");
	        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	    }
}