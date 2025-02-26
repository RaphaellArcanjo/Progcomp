package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

/*No Colégio Neps Academy (CNA) um aluno é aprovado por média se ele obtiver uma média final maior ou igual a 7, caso o aluno tenha uma média menor que 7 mas
maior ou igual a 4 ele está de recuperação, caso ele tenha uma média menor que 4 o aluno está reprovado. A média é calculada com a nota das duas provas aplicadas
no semestre e corresponde simplesmente a média aritmética das duas notas. Baseado nas duas notas do aluno, indique o resultado final do aluno: "Aprovado", "Reprovado"
ou "Recuperacao".
Entrada:
A entrada consiste de apenas uma linha com as notas A e B, que correspondem às duas notas que o aluno conquistou esse semestre.

Saída:
A saída do seu programa deve ser apenas uma linha. Caso o aluno tenha sido aprovado informe "Aprovado", caso o aluno tenha sido reprovado informe
"Reprovado" e caso ele esteja de recuperação informe "Recuperacao".*/

public class exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double media = (A + B) / 2;

        if(media < 4){
            System.out.println("Reprovado");
        } else if(media < 7){
            System.out.println("Recuperacao");
        } else{
            System.out.println("Aprovado");
        }

        sc.close();
    }
}
