package br.unipar.vetores;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] gols = new int[8];

        int maior = 0;
        int jogadorMaior = 0;

        for (int i = 0; i < gols.length; i++) {
            System.out.print("Gols do jogador " + (i + 1) + ": ");
            gols[i] = entrada.nextInt();
        }

        for (int i = 0; i < gols.length; i++) {

            if (gols[i] > maior) {
                maior = gols[i];
                jogadorMaior = i + 1;
            }
        }

        System.out.println("Maior quantidade de gols: " + maior);
        System.out.println("Jogador que marcou mais gols: " + jogadorMaior);
    }
}