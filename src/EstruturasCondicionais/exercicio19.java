package EstruturasCondicionais;

import java.util.Scanner;

/*Um novo game de realidade aumentada tem, dentro dele, um mini-game que aparece em certas situações para aumentar o ganho de pontos do game principal.
O mini-game é um joguinho de memória com quatro cartas, formando dois pares de cartas iguais. Ou seja, duas cartas têm um número inteiro N marcado em
uma de suas faces e as outras duas cartas têm um outro número inteiro M, com N ≠ M.
O jogador já virou três cartas. Como há apenas dois pares, a carta que falta virar será a que formar par com uma das três já abertas.

Entrada:
A primeira linha contém um inteiro A, representando a primeira carta aberta.
A segunda linha contém um inteiro B, representando a segunda carta aberta.
A terceira linha contém um inteiro C, representando a terceira carta aberta.

Saída:
O programa deve imprimir uma linha contendo um inteiro representando o número da carta que falta virar.*/

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A == B){
            System.out.println(C);
        } else if(A == C){
            System.out.println(B);
        } else if(B == C){
            System.out.println(A);
        }


        sc.close();
    }
}