package com.CollectionAPI;

import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
