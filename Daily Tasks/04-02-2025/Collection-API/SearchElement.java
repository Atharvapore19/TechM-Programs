package com.CollectionAPI;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println(colors.contains("Blue"));
    }
}
