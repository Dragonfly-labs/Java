package com.company;

import java.util.Scanner;

public class House extends Construction{

    public String floor;//кол-во этажей

    @Override
    public void init(Scanner scanner){

    }

    @Override
    public int getConstructionCost() {
        return cost;
    }
}
