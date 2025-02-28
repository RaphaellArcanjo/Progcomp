package Loops;

import java.util.Scanner;

/*Você está de volta em seu hotel na Tailândia depois de um dia de mergulhos. O seu quarto tem duas lâmpadas. Vamos chamá-las de A e B. No hotel há dois interruptores,
que chamaremos de I₁ e I₂. Ao apertar I₁, a lâmpada A acende se estiver apagada, e apaga se estiver acesa. Se apertar I₂, cada uma das lâmpadas A e B troca de estado:
se estiver apagada, fica acesa e se estiver acesa apaga. As lâmpadas inicialmente estão ambas apagadas. Seu amigo resolveu bolar um desafio para você. Ele irá apertar os
interruptores em uma certa sequência, e gostaria que você respondesse o estado final das lâmpadas A e B.

Entrada:
A primeira linha contém um número N que representa quantas vezes seu amigo irá apertar algum interruptor. Na linha seguinte seguirão N números, que pode ser 1, se o
interruptor I₁ foi apertado, ou 2, se o interruptor I₂ foi apertado.

Saída:
Seu programa deve imprimir dois valores, em linhas separadas. Na primeira linha, imprima 1 se a lâmpada A estiver acesa no final das operações e 0 caso contrário.
Na segunda linha, imprima 1 se a lâmpada B estiver acesa no final das operações e 0 caso contrário.*/

public class exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 0, B = 0;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();

            if(L == 1){
               A = 1 - A;
            } else if(L == 2){
                A = 1 - A;
                B = 1 - B;
            }
        }

        System.out.println(A);
        System.out.println(B);


        sc.close();
    }
}
