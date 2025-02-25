package EstruturasCondicionais;

import java.util.Scanner;
/*Flíper é um tipo de jogo onde uma bolinha de metal cai por um labirinto de caminhos até chegar na parte de baixo do labirinto. A quantidade de pontos que o
 jogador ganha depende do caminho que a bolinha seguir. O jogador pode controlar o percurso da bolinha mudando a posição de algumas portinhas do labirinto.
 Cada portinha pode estar na posição 0, que significa virada para a esquerda, ou na posição 1 que quer dizer virada para a direita.

 Considere o flíper da figura --> https://neps.academy/br/exercise/87

 que tem duas portinhas. A portinha P está na posição 1 e a portinha R, na posição 0. Desse jeito, a bolinha vai cair pelo caminho B.

Entrada: A entrada é composta por apenas uma linha contendo dois números P e R, indicando as posições das duas portinhas do flíper da figura.

Saída: A saída do seu programa deve ser também apenas uma linha, contendo uma letra maiúscula que indica o caminho por onde a bolinha vai cair: A, B ou C.*/

public class exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int R = sc.nextInt();

        if(P == 1 && R == 0){
            System.out.println("B");
        } else if(P == 1 && R == 1){
            System.out.println("A");
        } else{
            System.out.println("C");
        }


        sc.close();
    }
}
