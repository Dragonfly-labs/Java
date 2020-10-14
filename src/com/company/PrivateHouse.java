package com.company;

import java.util.Scanner;

public class PrivateHouse extends House{

    public String square;

    @Override
    public void init(Scanner scanner){

        this.type = "Hotel";

        System.out.println("Адрес:");
        this.adress = scanner.nextLine();

        System.out.println("Кол-во этажей:");
        this.floor = scanner.nextLine();

        System.out.println("Цена постройки:");
        this.cost = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Материал:");
        this.materials = scanner.nextLine();


        System.out.println("Площадь:");
        this.square = scanner.nextLine();
    }

    @Override
    public int getConstructionCost() {
        return cost;
    }

    @Override
    public String toString(){

        return ("Вид здания: " + this.type + " Кол-во этажей " + this.floor + " Цена постройки: " + this.cost + "Материал:" + this.materials + " Площадь: " + this.square);
    }
}

