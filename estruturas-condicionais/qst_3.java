package estudojava;

import java.util.Scanner;

public class qst_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o seu ano de nascimento ?");
        int anoNasc = teclado.nextInt();
        int idade = 2026 - anoNasc;
        System.out.println("Sua idade é: " + idade);

        if ( idade < 18) {
            // x é igual a quantidade de anos que falta para se alistar
            int x = 18 - idade;
            System.out.println("Faltam " + x + " anos para você se alistar");
        } else if (idade > 18) {
            // y é igual a quantidade de anos que já se passaram do alistamento
            int y = idade - 18;
            System.out.println("Já se passaram " + y +" anos do alistamento");
        } else {
            System.out.println("Você está no ano do alistamento");
         }
        teclado.close();
    }
}
