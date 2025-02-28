package EstruturasCondicionais;

import java.util.Scanner;

/*Os computadores foram inventados para realizar cálculos muito rapidamente, e atendem a esse requisito de maneira extraordinária. Porém, nem toda conta pode ser
feita num computador, pois ele não consegue representar todos os números dentro de sua memória. Em um computador pessoal atual, por exemplo, o maior inteiro que é
possível representar em sua memória é 4.294.967.295. Caso alguma conta executada pelo computador dê um resultado acima desse número, ocorrerá o que chamamos de overflow,
que é quando o computador faz uma conta e o resultado não pode ser representado, por ser maior do que o valor máximo permitido (em inglês overflow significa transbordar).
Por exemplo, se um computador só pode representar números menores do que 1023 e mandamos ele executar a conta 1022 + 5, vai ocorrer overflow.
Dados o maior número que um computador consegue representar e uma expressão de soma ou multiplicação entre dois inteiros, determine se ocorrerá overflow.

Entrada:
A primeira linha da entrada contém um inteiro N representando o maior número que o computador consegue representar. A segunda linha contém um inteiro P,
seguido de um espaço em branco, seguido de um caractere C (que pode ser '+' ou '', representando os operadores de adição e multiplicação, respectivamente), seguido
de um espaço em branco, seguido de um outro inteiro Q. Essa linha representa a expressão P + Q, se o caractere C for '+', ou P * Q, se o caractere C for '*'.

Saída:
O programa deve imprimir uma única linha, contendo a palavra 'OVERFLOW' se o resultado da expressão causar um overflow, ou a palavra 'OK' caso contrário.
 Ambas as palavras devem ser escritas com letras maiúsculas.*/

public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();
        char C = sc.next().charAt(0);
        int Q = sc.nextInt();

        if(C == '+'){
            int soma = P + Q;
            if(soma <= N){
                System.out.println("OK");
            } else{
                System.out.println("OVERFLOW");
            }
        } else{
            int multi = P * Q;
            if(multi <= N){
                System.out.println("OK");
            } else{
                System.out.println("OVERFLOW");
            }
        }


        sc.close();
    }
}
