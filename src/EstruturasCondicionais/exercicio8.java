package EstruturasCondicionais;

import java.util.Scanner;

/*Faça um programa para ler um inteiro X . Imprima a mensagem "positivo" se o valor for positivo. Imprima a mensagem "negativo" caso o valor seja negativo.
Imprima a mensagem "nulo" se o valor for zero.

Entrada:
A entrada consiste de uma linha contendo um inteiro.

Saída:
A saída consiste de uma linha contendo uma mensagem.

Restrições:
o valor fornecido não terá valor absoluto maior que 1000.*/

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x > 0){
            System.out.println("positivo");
        } else if(x < 0){
            System.out.println("negativo");
        } else {
            System.out.println("nulo");
        }

        sc.close();
    }
}
