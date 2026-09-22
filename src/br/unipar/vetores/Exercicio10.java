package br.unipar.vetores;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[10];
        double[] notas = new double[10];

        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < nomes.length; i++) {

            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = entrada.next();

            System.out.print("Nota: ");
            notas[i] = entrada.nextDouble();

            soma = soma + notas[i];
        }

        double maior = notas[0];
        double menor = notas[0];

        int posicaoMaior = 0;

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] >= 6) {
                aprovados++;
            } else {
                reprovados++;
            }

            if (notas[i] > maior) {
                maior = notas[i];
                posicaoMaior = i;
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = soma / notas.length;

        System.out.println("LISTA DE ALUNOS");

        for (int i = 0; i < nomes.length; i++) {

            if (notas[i] >= 6) {
                System.out.println(nomes[i] + " - "
                        + notas[i] + " - APROVADO");
            } else {
                System.out.println(nomes[i] + " - "
                        + notas[i] + " - REPROVADO");
            }
        }

        System.out.println("Media da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Aluno com maior nota: " + nomes[posicaoMaior]);
    }
}