package EstruturasCondicionais;

import java.util.Scanner;

/*A organização da OIBR, Olimpíada Internacional de Basquete de Robô, está começando a ter problemas com dois times: os Bit Warriors e os Byte Bulls. É que os
robôs desses times acertam quase todos os lançamentos, de qualquer posição na quadra! Pensando bem, o jogo de basquete ficaria mesmo sem graça se jogadores
conseguissem acertar qualquer lançamento, não é mesmo?
Uma das medidas que a OIBR está implantando é uma nova pontuação para os lançamentos, de acordo com a distância do robô para o início da quadra. A quadra tem
2000 centímetros de comprimento.

Regra de pontuação:

Se D ≤ 800, a cesta vale 1 ponto.
Se 800 < D ≤ 1400, a cesta vale 2 pontos.
Se 1400 < D ≤ 2000, a cesta vale 3 pontos.

Entrada:
A primeira e única linha da entrada contém um inteiro D indicando a distância do robô para o início da quadra, em centímetros, no momento do lançamento.

Saída:
Seu programa deve produzir uma única linha, contendo um inteiro, 1, 2 ou 3, indicando a pontuação do lançamento.

Restrições:
0 ≤ D ≤ 2000.*/

public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();

        if(D <= 800){
            System.out.println("1");
        } else if(D <= 1400){
            System.out.println("2");
        } else if(D <= 2000){
            System.out.println("3");
        }

        sc.close();
    }
}
