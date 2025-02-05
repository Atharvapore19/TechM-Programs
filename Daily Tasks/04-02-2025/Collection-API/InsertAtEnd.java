package com.CollectionAPI;
import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.addLast("Green");
        System.out.println(list);
    }
}
