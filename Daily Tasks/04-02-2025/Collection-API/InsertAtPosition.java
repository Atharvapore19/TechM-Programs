package com.CollectionAPI;
import java.util.LinkedList;

public class InsertAtPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        list.add(1, "Yellow");
        System.out.println(list);
    }
}
