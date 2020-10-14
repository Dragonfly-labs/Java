package com.company;

import java.util.Scanner;

public class Building extends Construction{


    public String name;//название

    @Override
    public void init(Scanner scanner){

    }

    @Override
    public int getConstructionCost() {
        return cost;
    }


}
