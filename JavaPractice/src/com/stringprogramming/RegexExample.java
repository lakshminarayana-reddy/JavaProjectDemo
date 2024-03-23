package com.stringprogramming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // Define a regex pattern for matching a simple email address
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        String ipv4Regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(emailRegex);
        
        // Create a Matcher object with an input email address
        String email = "example@email.com";
        Matcher matcher = pattern.matcher(email);
        
        // Check if the email address matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid email address!");
        } else {
            System.out.println("Invalid email address!");
        }
    }
}
