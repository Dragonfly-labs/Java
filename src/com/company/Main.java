package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите кол-во строений:");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        System.out.println("Кол-во строений " + n);
        scanner.nextLine();

        Construction[] constArr; // объявление массива
        constArr = new Construction[n];

        for (int i=0; i<n; i++)
        {

            System.out.println("Тип строения:");
            String str = scanner.nextLine();
            switch (str){

                case ("Hotel"):
                    constArr[i] = new Hotel();
                    constArr[i].init(scanner);
                    break;
                case ("Restaurant"):
                    constArr[i] = new Restaurant();
                    constArr[i].init(scanner);
                    break;
                case ("ApartmentBuilding"):
                    constArr[i] = new ApartmentBuilding();
                    constArr[i].init(scanner);
                    break;
                case ("PrivateHouse"):
                    constArr[i] = new PrivateHouse();
                    constArr[i].init(scanner);
                    break;
            }

        }/*
        int min = 999999;
        int minIndex = 0;
        for (int i=0; i<n; i++){
            if( prodList[i].getCost() < min ){
                min = prodList[i].getCost();
                minIndex = i;
            }
        }

        System.out.println(prodList[minIndex].toString());*/

        //Сортировка
        Construction t = new Construction();//бстракция не работает
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (constArr[j].getConstructionCost() < constArr[i].getConstructionCost()) {
                    t = constArr[i];
                    constArr[i] = constArr[j];
                    constArr[j] = t;
                }

        for (int i=0; i<n; i++){
            System.out.println(constArr[i].toString());
        }

    }
}
