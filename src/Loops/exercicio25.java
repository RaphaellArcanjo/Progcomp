package Loops;

import java.util.Scanner;

/*Gabriel inventou um código para representar números naturais, usando uma sequência de zeros e uns. Funciona assim, o número natural é representado pela quantidade de
vezes que o padrão "100" aparece na sequência. Por exemplo, na sequência 11101001010011110, o padrão aparece duas vezes e na sequência 11101010111110111010101 ele não
aparece nenhuma vez. Você deve ajudar Gabriel implementar um programa que, dada a sequência de zeros e uns, calcule quantas vezes o padrão "100" aparece nela.

Entrada:
A primeira linha da entrada contém um inteiro N, o tamanho da sequência. A segunda linha contém a sequência de N zeros e uns, separados por espaço em branco.

Saída:
Seu programa deve imprimir um inteiro, quantas vezes o padrão "100" aparece na sequência.*/

public class exercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Lê o tamanho da sequência
        int N = sc.nextInt();

        // Lê a sequência em um array
        int[] sequencia = new int[N];
        for (int i = 0; i < N; i++) {
            sequencia[i] = sc.nextInt();
        }

        // Converte o array para string
        StringBuilder seqStr = new StringBuilder();
        for (int num : sequencia) {
            seqStr.append(num);
        }

        // Conta ocorrências de "100"
        String str = seqStr.toString();
        int cont = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("100")) {
                cont++;
            }
        }

        // Imprime o resultado
        System.out.println(cont);

        sc.close();
    }
}
