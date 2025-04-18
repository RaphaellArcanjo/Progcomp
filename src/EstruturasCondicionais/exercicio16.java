package EstruturasCondicionais;

import java.util.Scanner;

/*A natação foi um dos esportes mais emocionantes das Olimpíadas do Rio. Houve até uma prova na qual três atletas chegaram empatados, cada um recebendo uma medalha de prata!
Normalmente, porém, os três primeiros colocados terminam a prova em tempos distintos e, portanto, temos a distribuição mais comum de medalhas: o nadador que terminou no menor
tempo recebe medalha de ouro; o nadador que terminou com o segundo menor tempo recebe medalha de prata; e o que terminou com o terceiro menor tempo recebe medalha de bronze.
Neste problema, dados os três tempos distintos de finalização da prova, dos três nadadores que ganharam medalhas, seu programa deve dizer quem ganhou medalha de ouro, quem
ganhou prata e quem ganhou bronze.

Entrada: A primeira linha da entrada contém um inteiro T1, indicando o tempo em que o nadador 1 terminou a prova. A segunda linha da entrada contém um inteiro T2, indicando
 o tempo de finalização do nadador 2. Por fim, a terceira linha da entrada contém um inteiro T3, indicando o tempo em que o nadador 3 terminou a prova.

Saída: Seu programa deve imprimir três linhas na saída. A primeira linha deve conter o número do nadador que ganhou medalha de ouro; a segunda linha, o número do nadador
que ganhou prata; e a terceira linha, o número do nadador que levou bronze.*/

public class exercicio16 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();

        if(t1 < t2 && t1 < t3){
            System.out.println("1");
            if(t2 < t3){
                System.out.println("2");
                System.out.println("3");
            } else{
                System.out.println("3");
                System.out.println("2");
            }
        } else if(t2 < t1 && t2 < t3){
            System.out.println("2");
            if(t1 < t3){
                System.out.println("1");
                System.out.println("3");
            } else{
                System.out.println("3");
                System.out.println("1");
            }
        } else{
            System.out.println("3");
            if(t1 < t2){
                System.out.println("1");
                System.out.println("2");
            } else {
                System.out.println("2");
                System.out.println("1");
            }
        }


        sc.close();
    }
}
