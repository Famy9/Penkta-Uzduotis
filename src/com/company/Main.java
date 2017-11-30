package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite 5 skaicius: ");
        Scanner skaneris = new Scanner(System.in);
        int pirmas = skaneris.nextInt();
        int antras = skaneris.nextInt();
        int trecias = skaneris.nextInt();
        int ketvirtas = skaneris.nextInt();
        int pentkas = skaneris.nextInt();
        int suma = pirmas+antras+trecias+ketvirtas+pentkas;
        System.out.println("Jusu skaiciai: " + pirmas +" "+ antras +" "+ trecias +" "+ ketvirtas +" "+ pentkas +" ");
        System.out.println("skaiciu suma: " + suma);

	// write your code here
    }
}
