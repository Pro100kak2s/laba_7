package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestArrayList {
   public static void addRundomNum(ArrayList<Integer> num){
       num.add((int)(Math.random()*100));
    }
    public static void main(String[] args){

        ArrayList<String> city = new ArrayList<String>(10);
        ArrayList<Integer> num = new ArrayList<Integer>(15);
        city.add("Novgorod");
        city.add("Moscow");
        city.add("Krasnodar");
        city.add("Moscow");
        for(int i=0;i<15;i++){
            addRundomNum(num);
        }
        for(String c:city){
            System.out.print(c+" ");
        }
        System.out.println("\nПервый элемент ArrayList: "+city.get(0));
        System.out.println("--------------------------------");
        for(Integer i:num){
            System.out.print(i+" ");
        }
        System.out.println("\nПервый элемент num: "+num.get(0));
        System.out.println("--------------------------------");
        System.out.println("Индекс первого вхождения объекта String коллекции ArrayLIst: "+city.indexOf("Moscow"));
        System.out.println("Индекс последнего вхождения объекта String коллекции ArryList: "+city.lastIndexOf("Moscow"));
        System.out.println("-------------------------------");
        System.out.println("Удаление объекта из коллекции Arraylist: "+city.remove(2));
        city.set(1,"Object");
        Collections.sort(num,Comparators.comp);
        for(String c:city){
            System.out.print(c+" ");
        }
        System.out.println("\n-------------------------------");
        System.out.println("After sort:");
        for(Integer i:num){
            System.out.print(i+" ");
        }
        System.out.println("\nЭлементы num с 0 по 4 индекс: "+num.subList(0,4));
    }
}
