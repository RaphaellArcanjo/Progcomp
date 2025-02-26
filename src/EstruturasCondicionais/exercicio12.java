package EstruturasCondicionais;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt();
        int c1 = sc.nextInt();
        int p2 = sc.nextInt();
        int c2 = sc.nextInt();

        int esquerdo = p1 * c1;
        int direito = p2 * c2;

        if(esquerdo == direito){
            System.out.println("0");
        } else if(esquerdo > direito){
            System.out.println("-1");
        } else{
            System.out.println("1");
        }



        sc.close();
    }
}
