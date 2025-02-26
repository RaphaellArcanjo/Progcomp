package EstruturasCondicionais;

import java.util.Scanner;

/*Bino e Cino gostam muito de brincar de par ou ímpar. Bino sempre escolhe par e Cino sempre escolhe ímpar. Faça um programa para automatizar o resultado o jogo de par ou
ímpar. Seu programa deve ler a quantidade de dedos que cada um utilizou e imprimir o nome do ganhador.

Entrada
A entrada consiste de duas linhas. A primeira linha contém a quantidade de dedos que Bino utilizou. A segunda linha contém a quantidade de dedos que Cino utilizou.

Saída:
A saída consiste de uma linha. Caso Bino vença o jogo, imprima "Bino". Caso Cino vença o jogo, imprima "Cino".

Restrições:
Como Bino e Cino só tem 10 dedos (contando as duas mãos), os valores fornecidos serão valores entre 0 e 10.*/

public class exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int bino = sc.nextInt();
        int cino = sc.nextInt();

        int total = bino + cino;

        if(total %  2 == 0){
            System.out.println("Bino");
        } else{
            System.out.println("Cino");
        }

        sc.close();
    }
}
