package ComecandoDoZero;
/*Otávio tem dois irmãos, um mais velho (Orlando) e um mais novo do que ele (Oscar). As idades dos três irmãos formam uma progressão aritmética: a diferença de idade dos
dois irmãos mais novos (Otávio e Oscar) é igual à diferença de idade dos dois irmãos mais velhos (Orlando e Otávio). Dadas as idades de Otávio e de seu irmão mais novo,
escreva um programa para determinar a idade do irmão mais velho.

Entrada:
A primeira linha da entrada contém um inteiro N, a idade do irmão mais novo de Otávio.
A segunda linha contém um inteiro M, a idade de Otávio.

Saída:
Seu programa deve produzir na saída uma única linha, contendo um único número inteiro, a idade do irmão mais velho de Otávio.

Restrições:
1 ≤ N ≤ 40
N ≤ M ≤ 40*/

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int V = (M - N) + M;

        System.out.println(V);
        sc.close();
    }
}
