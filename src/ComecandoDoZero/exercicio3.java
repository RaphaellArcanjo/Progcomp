package ComecandoDoZero;
/*O Capitão Olho Roxo e seus marinheiros encontraram uma arca com uma grande quantidade de moedas de ouro idênticas. Para a divisão das moedas,
todos concordaram com a seguinte sugestão do Capitão: cada marinheiro exceto o Capitão deveria receber exatamente o mesmo número de moedas; e o
Capitão deveria receber o dobro de moedas que um marinheiro recebe. Pode ser que o fato de o Capitão ser o único com uma pistola a bordo tenha contribuído para
a concordância de todos, mas também contribuiu o fato de que na forma proposta a divisão era perfeita, não sobrando ou faltando moedas. Dados o número de moedas
na arca e o número de marinheiros, escreva um programa para determinar quantas moedas o Capitão Olho Roxo recebeu.
Entrada: A primeira linha da entrada contém um número inteiro A, o número de moedas na arca. A segunda linha contém um inteiro N, o número de
marinheiros (não contando o Capitão).
Saída: Seu programa deve produzir na saída uma única linha, contendo um único inteiro, o número de moedas que o Capitão Olho Roxo deve receber.
Restrições: 3≤A≤10000 e 1≤N≤1000.*/

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int N = sc.nextInt();

        int conta =  A / (N + 2);

        int resultado = conta * 2;

        System.out.println(resultado);

        sc.close();
    }
}
