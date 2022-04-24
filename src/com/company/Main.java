package com.company;

public class Main {

    public static void main(String[] args) {
        Drinks [] drinks=new Drinks[4];
        drinks [0]= new Juice();
        drinks [1]= new Tea();
        drinks [2]= new Coffe();
        drinks [3]= new Water();
        for (Drinks l  : drinks){
            l.getWeight();
        }


    }
}

