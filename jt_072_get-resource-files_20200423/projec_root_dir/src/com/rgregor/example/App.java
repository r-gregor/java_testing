package com.rgregor.example;

import java.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Trying to get external resource ...");
        InputStream in = App.class.getResourceAsStream("/external/info.txt");
        if ( in != null ) {
            System.out.println("info.txt -- loaded successfuly.");
        } else {
            System.out.println("Couldn't load info.txt!");
        }

        try {
            String line = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}