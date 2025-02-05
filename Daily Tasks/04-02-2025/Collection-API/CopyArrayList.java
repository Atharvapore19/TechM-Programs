package com.CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Blue");
        list1.add("Green");

        ArrayList<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);
    }
}
