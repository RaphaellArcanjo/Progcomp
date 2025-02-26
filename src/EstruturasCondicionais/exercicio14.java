package EstruturasCondicionais;

import java.util.Scanner;

/*Bino obteve média N1 na primeira etapa do semestre e média N2 na segunda etapa do semestre. Bino não sabe sua situação e quer sua ajuda para saber se ele
está aprovado, reprovado ou de prova final. A nota final de Bino é calculada utilizando uma média ponderada onde o peso da N1 é 2 e o peso da N2 é 3.
Caso a média final seja maior ou igual a 7, Bino está aprovado. Caso a média seja menor que 3, Bino está reprovado. Caso Bino não esteja reprovado ou aprovado,
Bino terá que fazer a prova final. Faça um programa para ler as duas notas de Bino e imprima qual sua situação.

Entrada:
A entrada consiste de duas linhas. A primeira linha contém um real representando a nota N1. A segunda linha contém um real representando a nota N2.

Saída:
A saída consiste de uma linha. Caso Bino esteja aprovado, imprima "Aprovado". Caso Bino esteja reprovado, imprima "Reprovado". Caso Bino não esteja
reprovado ou aprovado, imprima "Final".*/

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        double media = ((n1 * 2) + (n2 * 3)) / 5;

        if(media < 3){
            System.out.println("Reprovado");
        } else if(media < 7){
            System.out.println("Final");
        } else{
            System.out.println("Aprovado");
        }

        sc.close();
    }
}
