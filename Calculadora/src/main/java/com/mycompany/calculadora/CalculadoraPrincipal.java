package com.mycompany.calculadora;

import java.util.Scanner;


public class CalculadoraPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] - SOMA [2] - SUBTRAÇÃO [3]- MULTIPLICAÇÃO [4] - DIVISÃO [5] - SAIR");
        int opcao = sc.nextInt();
        
        Calculadora calc = new Calculadora();
        double n1,n2;
        
        while(opcao != 5){
            switch (opcao) {
                case 1:
                    System.out.println("Informe o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.println("Informe o segundo número: ");
                    n2 = sc.nextDouble();
                    calc.setNumeros(n1,n2);
                    System.out.println("Soma = "+calc.soma());
                    break;
                case 2:
                    System.out.println("Informe o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.println("Informe o segundo número: ");
                    n2 = sc.nextDouble();
                    calc.setNumeros(n1,n2);
                    System.out.println("Subtração = "+calc.subtracao());
                    break;
                case 3:
                    System.out.println("Informe o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.println("Informe o segundo número: ");
                    n2 = sc.nextDouble();
                    calc.setNumeros(n1,n2);
                    System.out.println("Multiplicação = "+calc.multiplicacao());
                    break;
                case 4:
                    System.out.println("Informe o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.println("Informe o segundo número: ");
                    n2 = sc.nextDouble();
                    calc.setNumeros(n1,n2);
                    System.out.println("Divisão = "+calc.divisao());
                    break;
                default:
                    break;
            }
        System.out.println("[1] - SOMA [2] - SUBTRAÇÃO [3]- MULTIPLICAÇÃO [4] - DIVISÃO [5] - SAIR");
        opcao = sc.nextInt();
        }
        System.out.println("Obrigado!");
    }
}

