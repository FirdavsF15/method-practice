package com.pluralsight;

public class Format {

    public static void main(String[] args) {

        System.out.println(formatName("Firdavs", "Fayzullaev"));
    }

    public static String formatName(String first, String last){
        String formatted = last + ", " + first;
        return formatted;
    }
}
