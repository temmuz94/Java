package class29.class28;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("raki");
        drinks.add("ayran");
        drinks.add("helva");
        drinks.replaceAll(str -> str.contains("a") ? "Water" : str);
        drinks.replaceAll(str -> str.contains("e") ? "Water" : str);
        System.out.println(drinks);


    }}