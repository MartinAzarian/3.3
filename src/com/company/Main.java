package com.company;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("green");
        colors.add("white");

        Iterator<String> iterator = colors.iterator();
        System.out.println("\nThe iterator values"
                + " of list are: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
