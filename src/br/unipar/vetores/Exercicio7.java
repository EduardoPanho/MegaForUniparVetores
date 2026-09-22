package br.unipar.vetores;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] velocidades = new int[10];

        int acima = 0;
        int maior = 0;

        for (int i = 0; i < velocidades.length; i++) {
            System.out.print("Velocidade do veiculo " + (i + 1) + ": ");
            velocidades[i] = entrada.nextInt();
        }

        System.out.println("Velocidades: ");

        for (int i = 0; i < velocidades.length; i++) {

            if (velocidades[i] > 80) {
                System.out.println("Veiculo " + (i + 1) + ": "
                        + velocidades[i] + " km/h - ACIMA DO LIMITE");

                acima++;
            } else {
                System.out.println("Veiculo " + (i + 1) + ": "
                        + velocidades[i] + " km/h");
            }

            if (velocidades[i] > maior) {
                maior = velocidades[i];
            }
        }

        System.out.println("Total acima do limite: " + acima);
        System.out.println("Maior velocidade registrada: " + maior + " km/h");
    }
}