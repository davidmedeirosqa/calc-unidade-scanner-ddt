package com.iterasys;

import java.util.Scanner;

public class Main {
    static int lado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        lado = scanner.nextInt();

        System.out.println("Area do quadrado: " + areaQuadrado());

        scanner.close();
    }

    public static int areaQuadrado() {
        return lado * lado;
    }

    // public static int areaRetangulo() {
    //     return base * altura;
    // }

    // public static int areaCirculo(){
    //     return pi * raio * raio;
    // }

    // public static int areaTriangulo(){
    //     return (lado * lado) / 2;
    // }
}