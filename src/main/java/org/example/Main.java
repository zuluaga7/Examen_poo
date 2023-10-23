package org.example;

import org.example.modelos.Seguro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Seguro seguro = new Seguro();
        Scanner entradaTeclado=new Scanner(System.in);
        seguro.setEdadAsegurado(25);
        System.out.println(seguro.calcularPrima());



    }

}