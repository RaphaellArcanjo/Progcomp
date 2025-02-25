package ComecandoDoZero;
/*A universidade está inaugurando um grande acelerador de partículas, com um emissor e três sensores, numerados 1, 2 e 3. Uma partícula, após sair do emissor, entra
no acelerador onde pode dar várias voltas sendo acelerada a velocidades muito altas. Num determinado momento, a partícula sai do acelerador por uma das três saídas,
atingindo um dos sensores. A figura mostra o caminho por onde as partículas trafegam, com uma graduação de 1 quilômetro. Por exemplo, do emissor até o acelerador são
3 quilômetros e a circunferência do acelerador tem 8 quilômetros.

Figura 1 (https://neps.academy/br/exercise/822)

Neste problema, será dada a distância total, em quilômetros, percorrida por uma certa partícula trafegando do emissor até algum sensor e seu programa deve determinar
qual sensor foi atingido pela partícula. Por exemplo, veja que se a distância total for 23 quilômetros, então a partícula tem que ter atingido o sensor 2.

Entrada
A entrada consiste de apenas uma linha contendo um inteiro D, representando a distância total percorrida pela partícula.

Saída
Seu programa deve imprimir uma linha contendo um inteiro, representando o número do sensor que  a partícula atingiu.*/

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();

        int resultado = (D - 3) % 8;

        if (resultado == 3) {
            System.out.println("1");
        } else if (resultado == 4) {
            System.out.println("2");
        } else{
            System.out.println("3");
        }

        sc.close();
    }
}
