package br.unipar.vetores;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] produtos = new double[6];

        double total = 0;

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Preco do produto " + (i + 1) + ": R$ ");
            produtos[i] = entrada.nextDouble();

            total = total + produtos[i];
        }

        System.out.printf("Total da compra: R$ %.2f%n", total);

        System.out.print("Quanto dinheiro voce possui? R$ ");
        double dinheiro = entrada.nextDouble();

        if (dinheiro >= total) {
            System.out.println("Dinheiro suficiente para realizar a compra.");
        } else {
            System.out.println("Dinheiro insuficiente para realizar a compra.");
        }
    }
}