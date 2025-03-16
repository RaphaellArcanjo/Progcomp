package Loops;

import java.util.Scanner;

/*Faça um programa para ler um inteiro N e imprima o valor de N!. N! significa fatorial de N.

Entrada:
A entrada consiste de uma linha contendo o valor de N.

Saída:
A saída consiste de uma linha contendo o valor de N!.*/

public class exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int fatorial = 1;
        for (int i=1; i<=N; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
