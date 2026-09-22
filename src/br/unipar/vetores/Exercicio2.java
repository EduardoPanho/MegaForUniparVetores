package br.unipar.vetores;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] temperaturas = new double[7];

        double soma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = entrada.nextDouble();

            soma = soma + temperaturas[i];
        }

        System.out.println("Temperaturas: ");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " ");
        }

        double media = soma / temperaturas.length;

        System.out.println("Media da semana: " + media + " C");
    }
}