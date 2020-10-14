package com.company;

import java.util.Scanner;

public abstract class Construction {

    public String type;//вид сооружения
    public String adress;//адрес сооружения
    public int cost;//цена постройки
    public String materials;//материал сооружение




    public abstract void init(Scanner scanner); // считывание параметров с консоли
    public abstract int getConstructionCost(); // возвращает стоимость возведения сооружения
    //public String toString() // возвращается состояние объекта в виде строки
// (определяется только в наследниках, т.к.
// определен в классе Object)ф
}
