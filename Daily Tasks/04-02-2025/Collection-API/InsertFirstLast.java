package com.CollectionAPI;

import java.util.LinkedList;

public class InsertFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Blue");

        list.addFirst("Red");
        list.addLast("Green");

        System.out.println(list);
    }
}
