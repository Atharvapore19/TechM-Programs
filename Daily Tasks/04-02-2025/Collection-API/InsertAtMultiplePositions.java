package com.CollectionAPI;
import java.util.LinkedList;
import java.util.List;

public class InsertAtMultiplePositions {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");

        List<String> extra = List.of("Green", "Yellow");
        list.addAll(1, extra);
        
        System.out.println(list);
    }
}
