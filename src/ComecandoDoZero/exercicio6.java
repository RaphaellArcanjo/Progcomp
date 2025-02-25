package ComecandoDoZero;

import java.util.Scanner;

/*A média de três números inteiros A, B e C é (A+B+C)/3. A mediana de três números inteiros é o número que ficaria no meio se os três números fossem ordenados em
ordem não-decrescente. Sua tarefa é escrever um programa que, dados dois números inteiros distintos A e B, calcule o menor inteiro possível C tal que a média e
a mediana de A, B e C sejam iguais.
Entrada: A entrada é composta de uma única linha contendo dois números inteiros A e B.
Saída: Seu programa deve produzir uma única linha, contendo um único número, o menor inteiro possível C tal que a média e a mediana de A, B e C são iguais.*/

public class exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = 3 * A - (A + B);

        System.out.println(C);


        sc.close();
    }
}
