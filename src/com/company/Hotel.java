package com.company;

import java.util.Scanner;

public class Hotel extends Building{

    public String stars;//кол-во звезд

    @Override
    public void init(Scanner scanner){

        this.type = "Hotel";

        System.out.println("Адрес:");
        this.adress = scanner.nextLine();

        System.out.println("Название:");
        this.name = scanner.nextLine();

        System.out.println("Цена постройки:");
        this.cost = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Материал:");
        this.materials = scanner.nextLine();


        System.out.println("Кол-во звезд:");
        this.stars = scanner.nextLine();
    }

    @Override
    public int getConstructionCost() {
        return cost;
    }

    @Override
    public String toString(){

        return ("Вид здания: " + this.type + " Название: " + this.name + " Цена постройки: " + this.cost + "Материал:" + this.materials + " Кол-во звезд: " + this.stars);
    }
}
