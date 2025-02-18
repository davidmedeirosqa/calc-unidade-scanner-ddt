package com.iterasys;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado = scanner.nextInt();
        float base = scanner.nextFloat();
        float altura = scanner.nextFloat();
        float raio = scanner.nextFloat();
        

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
                    areaQuadrado(lado);
                    return;
                case "2":
                    System.out.println("Você selecionou a área do retângulo");
                    areaRetangulo(base, altura);
                    return;
                case "3":
                    System.out.println("Você selecionou a área do círculo");
                    areaCirculo(raio);
                    return;
                case "4":
                    System.out.println("Você selecionou a área do triângulo");
                    areaTriangulo(base, altura);
                    return;
                case "5":
                    System.out.println("Você saiu");
                    scanner.close();
                    return;
                default:
                    System.out.println("ERRO: Digitou o número errado.");
                    break;
            }

        }

    }

    public static int areaQuadrado(int lado) {
        System.out.print("Qual o tamanho de cada lado do quadrado? ");
        int resultado = lado * lado;
        System.out.print("A área do quadrado é: " + resultado + " cm²");
        return resultado;
    }

    public static int areaRetangulo(float base, float altura) {
        System.out.print("Qual o tamanho da base do retângulo? ");
        System.out.print("Qual o tamanho da altura do retângulo? ");
        float resultado = (int) base * altura;
        System.out.print("A área do retângulo é: " + resultado + " cm²");
        return (int) resultado;
    }

    public static float areaCirculo(float raio) {
        System.out.print("Qual o tamanho do raio do círculo? ");
        float pi = 3.1416f;
        System.out.print("A área do círculo é: " + (pi * Math.pow(raio, 2)) + " cm²");
        return (float) (pi * Math.pow(raio, 2));
    }

    public static float areaTriangulo(float base, float altura) {
        System.out.print("Qual o tamanho da base do triângulo? ");
        System.out.print("Qual o tamanho da altura do triângulo? ");
        float resultado = (base * altura) / 2;
        System.out.print("A área do triângulo é: " + resultado + " cm²");
        return resultado;
    }

}