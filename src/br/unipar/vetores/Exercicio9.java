package br.unipar.vetores;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] sorteados = {5, 12, 23, 31, 44, 58};

        int[] apostados = new int[6];

        for (int i = 0; i < apostados.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + " da aposta: ");
            apostados[i] = entrada.nextInt();
        }

        int acertos = 0;

        System.out.println("Numeros acertados: ");

        for (int i = 0; i < apostados.length; i++) {

            for (int j = 0; j < sorteados.length; j++) {

                if (apostados[i] == sorteados[j]) {
                    System.out.print(apostados[i] + " ");
                    acertos++;
                }
            }
        }

        System.out.println("Voce acertou " + acertos + " numeros.");
    }
}