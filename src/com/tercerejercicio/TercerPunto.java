package com.tercerejercicio;

public class TercerPunto {
    public static void main(String[] args){
        concatStrings(new String[]{"Hola", "capo"});
    }

    public static void concatStrings(String[] names){
        StringBuilder text = new StringBuilder();
        for(String name : names)
            text.append(name);
        System.out.println(text);
    }
}
