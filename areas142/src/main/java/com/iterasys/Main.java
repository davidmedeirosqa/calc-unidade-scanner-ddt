package com.iterasys;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthIcon;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha as opções: ");
            System.out.println("1 - Area do quadrado");
            System.out.println("2 - Area do retangulo");
            System.out.println("3 - Area do circulo");
            System.out.println("4 - Area do triangulo");
            System.out.println("5 - Sair");

            switch (scanner.next()) {
                case "1":
                    System.out.println("Você selecionou a Area do quadrado");
                    areaQuadrado(scanner);
                    return;
                case "2":
                    System.out.println("Você selecionou a Area do retângulo");
                    areaRetangulo(scanner);
                    return;
                case "3":
                    System.out.println("Você selecionou a Area do círculo");
                    areaCirculo(scanner);
                    return;
                case "4":
                    System.out.println("Você selecionou a Area do triângulo");
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
        int resultado = lado * lado;
        System.out.print("A area do quadrado e: " + resultado);
        return resultado;
    }

    public static int areaRetangulo(Scanner scanner) {
        System.out.print("Qual o tamanho da base do retângulo? ");
        int base = scanner.nextInt();
        System.out.print("Qual o tamanho da altura do retângulo? ");
        int altura = scanner.nextInt();
        int resultado = base * altura;
        System.out.print("A area do retângulo e: " + resultado);
        return resultado;
    }

    public static float areaCirculo(Scanner scanner) {
        System.out.print("Qual o tamanho do raio do círculo? ");
        float raio = scanner.nextFloat();
        float pi = 3.14f;
        float resultado = pi * raio * raio;
        System.out.print("A area do círculo e: " + resultado);
        return resultado;
    }

    public static int areaTriangulo(Scanner scanner) {
        System.out.print("Qual o tamanho da base do triângulo? ");
        int base = scanner.nextInt();
        System.out.print("Qual o tamanho da altura do triângulo? ");
        int altura = scanner.nextInt();
        int resultado = (base * altura) / 2;
        System.out.print("A area do triângulo e: " + resultado);
        return resultado;
    }
}