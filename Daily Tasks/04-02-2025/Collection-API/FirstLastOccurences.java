package com.CollectionAPI;
import java.util.LinkedList;

public class FirstLastOccurences {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Red");

        System.out.println(list.indexOf("Red"));
        System.out.println(list.lastIndexOf("Red"));
    }
}

