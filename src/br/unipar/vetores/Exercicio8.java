package br.unipar.vetores;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] pontos = new int[5];

        for (int i = 0; i < nomes.length; i++) {

            System.out.print("Nome do jogador " + (i + 1) + ": ");
            nomes[i] = entrada.next();

            System.out.print("Pontuacao: ");
            pontos[i] = entrada.nextInt();
        }

        int maior = pontos[0];
        int posicaoMaior = 0;

        for (int i = 1; i < pontos.length; i++) {

            if (pontos[i] > maior) {
                maior = pontos[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Placar: ");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " - " + pontos[i] + " pontos");
        }

        System.out.println("Campeao: " + nomes[posicaoMaior]
                + " - " + maior + " pontos");
    }
}