package estudojava;

import java.util.Scanner;

public class qst_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano para saber se ele é bissexto:");
        int ano = input.nextInt();

        if (ano%4 == 0 && (ano%100 != 0 || ano%400 == 0)){
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }
        input.close();
    }
}
