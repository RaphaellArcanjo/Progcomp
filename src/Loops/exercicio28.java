package Loops;

import java.util.Scanner;

/*Bino desafiou Cino a descobrir o número que ele estava pensando. Bino está pensando no número 2018. Cino vai informar números até que acerte o número que Bino está pensando.

Faça um programa para receber os números que Cino chutou. Seu programa só deve parar de solicitar um valor quando Cino acertar o 2018.

Entrada:
A entrada consiste de múltiplas linhas. Cada linha contém um inteiro representando um chute de Cino. É garantido que Cino irá fornecer o valor 2018.

Saída:
A saída consiste de uma única linha informando quantas vezes Cino errou o número que Bino estava pesando.

Restrições:
Cino sempre chuta um número com valor absoluto menor ou igual a 100000.
*/

public class exercicio28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = 0;
        int cont = 0;

        while(N != 2018){
            N = sc.nextInt();
            cont++;
        }

        System.out.println(cont - 1);

        sc.close();
    }
}
