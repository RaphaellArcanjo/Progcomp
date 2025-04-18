package Loops;

import java.util.Scanner;

/*Alice e Bia criaram uma página na Internet com informações sobre o Macaco-prego-de-peito-amarelo, uma espécie em extinção. A página mostra como todos podem ajudar a
manter o habitat natural para evitar que a espécie seja extinta. Uma empresa gostou tanto da iniciativa de Alice e Bia que prometeu doar um prêmio para que as duas
amigas possam realizar outras iniciativas semelhantes. A empresa decidiu que o prêmio seria dado quando a soma do número de acessos à página chegasse a 1 milhão.
Dada a lista de acessos diários que ocorreram à página de Alice e Bia, escreva um programa para determinar quantos dias foram necessários para a soma dos acessos chegar
a 1 milhão e as amigas ganharem o prêmio.

Entrada:
A primeira linha da entrada contém um número inteiro N, que indica o número de dias que a lista contém. Cada umgia das linhas seguintes contém um único inteiro A, o número
de acessos em um dia. O primeiro número dado indica o número de acessos no primeiro dia, o segundo número dado indica o número de acessos no segundo dia, e assim por diante.

Saída:
Seu programa deve escrever na saída uma única linha, contendo um único número inteiro, o número de dias que foram necessários para a soma dos acessos à pagina de Alice e
Bia chegar a 1000000. Restrições 1≤N≤10³, ou seja, a lista tem no máximo 1000 números. 0≤A≤10⁶, ou seja, cada inteiro A da lista é positivo e menor do que ou igual a 1 milhão.
A soma de todos os valores A da lista é maior do que ou igual a 1 milhão (ou seja, Alice e Bia certamente ganham o prêmio).*/

public class exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int dias = 0;
        int resultado = 0;

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            soma += sc.nextInt();
            dias++;

            if (soma >= 1000000 && resultado == 0) {
                resultado = dias;
            }
        }

        System.out.println(resultado);

        sc.close();
    }
}
