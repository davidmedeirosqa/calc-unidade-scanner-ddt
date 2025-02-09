package com.iterasys;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha as opções: ");
            System.out.println("1 - Área do quadrado");
            System.out.println("2 - Área do retângulo");
            System.out.println("3 - Área do círculo");
            System.out.println("4 - Área do triângulo");
            System.out.println("5 - Sair");

            switch (scanner.next()) {
                case "1":
                    System.out.println("Você selecionou a área do quadrado");
                    areaQuadrado(scanner);
                    return;
                case "2":
                    System.out.println("Você selecionou a área do retângulo");
                    areaRetangulo(scanner);
                    return;
                case "3":
                    System.out.println("Você selecionou a área do círculo");
                    areaCirculo(scanner);
                    return;
                case "4":
                    System.out.println("Você selecionou a área do triângulo");
                    areaTriangulo(scanner);
                    return;
                case "5":
                    System.out.println("Você saiu");
                    return;
                default:
                    System.out.println("ERRO: Digitou o número errado.");
                    break;
            }

        }

    }

    public static int areaQuadrado(Scanner scanner) {
        System.out.print("Qual o tamanho de cada lado do quadrado? ");
        int lado = scanner.nextInt();
        System.out.print("A área do quadrado é: " + lado * lado + " cm²");
        return lado * lado;
    }

    public static int areaRetangulo(Scanner scanner) {
        System.out.print("Qual o tamanho da base do retângulo? ");
        int base = scanner.nextInt();
        System.out.print("Qual o tamanho da altura do retângulo? ");
        int altura = scanner.nextInt();
        System.out.print("A área do retângulo é: " + base * altura + " cm²");
        return base * altura;
    }

    public static float areaCirculo(Scanner scanner) {
        System.out.print("Qual o tamanho do raio do círculo? ");
        float raio = scanner.nextFloat();
        float pi = 3.1416f;
        System.out.print("A área do círculo é: " + (float) (pi * Math.pow(raio, 2)) + " cm²");
        return (float) (pi * Math.pow(raio, 2));
    }

    public static float areaTriangulo(Scanner scanner) {
        System.out.print("Qual o tamanho da base do triângulo? ");
        float base = scanner.nextInt();
        System.out.print("Qual o tamanho da altura do triângulo? ");
        float altura = scanner.nextInt();
        System.out.print("A área do triângulo é: " + (base * altura) / 2 + " cm²");
        return (base * altura) / 2;
    }

}