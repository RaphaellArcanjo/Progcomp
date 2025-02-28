package EstruturasCondicionais;

import java.util.Scanner;

/*Faça um programa para ler dois inteiros X e Y representando um ponto em um plano cartesiano. Imprima qual quadrante esse ponto se encontra.
Caso o ponto esteja em algum eixo, imprima apenas a mensagem "eixos".

figura --> https://neps.academy/br/exercise/146

Entrada: A entrada consiste de duas linhas. A primeira linha contém o inteiro X. A segunda linha contém o inteiro Y.

Saída: A saída consiste de uma linha contendo a mensagem indicando qual o quadrante que o ponto está.*/

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if(X > 0 && Y > 0){
            System.out.println("Q1");
        } else if(X < 0 && Y >= 1){
            System.out.println("Q2");
        } else if(X < 0 && Y < 0){
            System.out.println("Q3");
        } else if(X > 0 && Y < 0){
            System.out.println("Q4");
        } else{
            System.out.println("eixos");
        }

        sc.close();
    }
}
