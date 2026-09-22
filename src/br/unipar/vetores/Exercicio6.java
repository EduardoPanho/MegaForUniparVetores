package br.unipar.vetores;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Qual numero deseja procurar? ");
        int procurado = entrada.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == procurado) {
                System.out.println("Numero encontrado na posicao " + i);
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("Numero nao encontrado.");
        }
    }
}