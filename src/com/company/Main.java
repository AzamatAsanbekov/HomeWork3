package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Тима", "Темирлан", "Темир",};

        for (int i = 0; i < names.length; i++) {
            switch (i) {

                case 0:
                    System.out.println(names[i] + " Доброго утра");
                    break;

                case 1:
                    System.out.println(names[i] + " Доброго дня");
                    break;

                case 2:
                    System.out.println(names[i] + " Доброго вечера");
                    break;


            }

        }


    }
}
