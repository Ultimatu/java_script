package com.souleymane.coursJava;
import  java.util.*;
public class Var {
    public static void main(String[] args) {
        int i = 12;
        String j = new String();
        j = j.valueOf(i);
        Scanner sc =  new Scanner(System.in);
        System.out.println("Veuillez entrer en nombre :");
        int m = sc.nextInt();
        double res  = m*m;
        int max = (m < i) ? m*2 : i * 2;
        System.out.println("son carré est: " + res);
        System.out.println("\nLe max est: "+ max);
        System.out.println("\nLe max est: "+ max);





    }
}
