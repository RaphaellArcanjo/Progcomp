package Loops;

import java.util.Scanner;

/*Num sorteio que distribui prêmios, um participante inicialmente sorteia um inteiro N e depois N valores. O número de pontos do participante é o tamanho da maior
sequência de valores consecutivos iguais. Por exemplo, suponhamos que um participante sorteia N=11 e, nesta ordem, os valores 30,30,30,30,40,40,40,40,40,30,30.
Então, o participante ganha 5 pontos, correspondentes aos 5 valores 40 consecutivos. Note que o participante sorteou 6 valores iguais a 30, mas nem todos são
consecutivos. Sua tarefa é ajudar a organização do evento, escrevendo um programa que determina o número de pontos de um participante.

Entrada:
A primeira linha da entrada contém um inteiro N, o número de valores sorteados. A segunda linha contém N valores, V1,V2,…,VN, na ordem de sorteio, separados por
um espaço em branco.

Saída:
Seu programa deve imprimir apenas uma linha, contendo apenas um inteiro, indicando o número de pontos do participante.*/

public class exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N == 0){
            System.out.println(0);
        }

        int anterior = sc.nextInt();
        int contAtual = 1;    // Contador da sequência atual
        int maiorCont = 1;    // Contador da maior sequência

        // Processa os N-1 valores restantes
        for (int i = 1; i < N; i++) {
            int atual = sc.nextInt();

            // Se o valor atual é igual ao anterior, aumenta a sequência atual
            if (atual == anterior) {
                contAtual++;
            } else {
                // Se mudou de valor, atualiza o maior se necessário e reinicia
                if (contAtual > maiorCont) {
                    maiorCont = contAtual;
                }
                contAtual = 1;  // Reinicia para o novo valor
            }

            // Atualiza o anterior para a próxima iteração
            anterior = atual;
        }

        // Verifica a última sequência
        if (contAtual > maiorCont) {
            maiorCont = contAtual;
        }

        // Imprime o número de pontos
        System.out.println(maiorCont);

        sc.close();
    }
}
