package ComecandoDoZero;
/*Faça um programa para ler dois valores inteiros A e B e imprima a média inteira dos valores A e B.
Entrada: A entrada consiste de duas linhas. A primeira linha contém o inteiro A e a segunda linha contém o inteiro B.
Saída: A saída consiste de uma linha contendo a média inteira dos valores A e B.
Restrições: Os inteiros fornecidos não têm valor absoluto maior que 1000.*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int media = (A + B) / 2;

        System.out.println(media);
        sc.close();
    }
}
