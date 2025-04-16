package Vetores;

import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vetor = new int[55];

        for (int i = 1; i <= N; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.println();

        for (int i = 1; i <= N; i++) {
            System.out.print(vetor[i - 1] + vetor[i] + vetor[i + 1] + " ");
        }



        sc.close();
    }
}
