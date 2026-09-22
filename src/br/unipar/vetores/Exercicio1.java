package br.unipar.vetores;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] pontuacoes = new int[5];

        for (int i = 0; i < pontuacoes.length; i++) {
            System.out.print("Pontuacao do jogador " + (i + 1) + ": ");
            pontuacoes[i] = entrada.nextInt();
        }

        System.out.println("Pontuacoes cadastradas: ");

        for (int i = 0; i < pontuacoes.length; i++) {
            System.out.println("Jogador " + (i + 1) + ": " + pontuacoes[i] + " pontos");
        }
    }
}