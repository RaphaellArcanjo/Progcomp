package Vetores;

/*https://neps.academy/br/exercise/399 */


import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String vogais = "";
        String consoantes = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if("aeiouAEIOU".indexOf(c) != -1){
                vogais += c;
            } else{
                consoantes += c;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);

        sc.close();
    }
}
