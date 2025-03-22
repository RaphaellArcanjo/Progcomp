package Loops;

import java.util.Scanner;

/*https://neps.academy/br/exercise/602*/

public class exercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cont = 0;

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int L = sc.nextInt();
            cont += L - 1;

        }

        System.out.println(cont);

        sc.close();
    }
}