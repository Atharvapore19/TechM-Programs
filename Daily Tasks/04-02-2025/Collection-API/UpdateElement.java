package com.CollectionAPI;

import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.set(1, "Yellow");
        System.out.println(colors);
    }
}
