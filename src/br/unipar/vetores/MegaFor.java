package br.unipar.vetores;

import java.util.Scanner;

public class MegaFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos numeros vc quer jogar");
        int numerosJogos = sc.nextInt();

        // Vetor que vai guardar os números escolhidos pelo usuário
        int[] jogo = new int[numerosJogos];

        // Vetor que contém os números do resultado
        int[] resultado = {10, 20, 30, 40, 50, 60};

        // Repetição para receber os números do usuário
        for (int i = 0; i < numerosJogos; i++) {

            // i representa a posição atual do vetor
            System.out.println("Informe o valor: ");

            // Guarda o número digitado na posição atual do vetor
            jogo[i] = sc.nextInt();
        }

        // Mostra os números escolhidos pelo usuário
        System.out.println("O jogo escolhido é: ");

        for (int i = 0; i < numerosJogos; i++) {

            // Percorre o vetor jogo e mostra cada número
            System.out.print(" " + jogo[i] + " ");
        }

        // Variável responsável por contar a quantidade de acertos
        int acertos = 0;

        // Percorre os números escolhidos pelo usuário
        for (int i = 0; i < 6; i++) {

            // Percorre os números do resultado
            for (int j = 0; j < resultado.length; j++) {

                // Compara o número do jogo com o número do resultado
                if (jogo[i] == resultado[j]) {

                    // Se forem iguais, aumenta a quantidade de acertos
                    acertos++;
                }
            }
        }

        // Mostra a quantidade total de acertos
        System.out.println("Quantidade de acertos: " + acertos);
    }
}
