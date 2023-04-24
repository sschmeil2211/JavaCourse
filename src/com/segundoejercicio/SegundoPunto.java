package com.segundoejercicio;

public class SegundoPunto {

    public static void main(String[] args){
        System.out.println(getPriceWithIVA(20));
    }

    public static double getPriceWithIVA(double price){
        return price + (price * 0.21);
    }
}
