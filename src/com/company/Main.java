package com.company;


import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {


        String[] strings = new String[3];
        strings[0] = "Bolot";
        strings[1] = "Azamat";
        strings[2] = "Sasha";

        System.out.println("______++++++++_____________-----------------_____________+++++++_______ ");
        String names="Bolot";
        switch ("Bolot") {
            case "Bolot":
                System.out.println("Доброго утро " + "Bolot,");


            case "Azamat":
                System.out.println("Доброго дня " + "Azamat,");

            case "Sasha":
                System.out.println("Доброго вечера " + "Sasha,");


        }

        while (names.length() <= 2) {

            names = names + "";
            System.out.println(names);
        }
    }













}






