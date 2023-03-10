package com.souleymane.coursJava;

import java.util.Scanner;

public class Primality {
    boolean isPrime(int ent){
        if (ent < 2){
            return false;
        }
        else if (ent == 2){
            return  true;
        }
        for (int i=2; i<ent; i++){
            if ((ent)% i == 0){
                return false;
            }
        }
        return true;
    }
}

class TestPrimality{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Primality isPrim = new Primality();
        System.out.println("Veuillez entrer un nombre: ");
        int res = sc.nextInt();

        if (isPrim.isPrime(res)){
            System.out.println(res +" est un nombre premier");
        } else {
            System.out.println(res + " n'est pas un nombre premier");
        }
    }
}
