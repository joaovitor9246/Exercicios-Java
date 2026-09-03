package estudojava;
import java.util.Scanner;

public class Questao23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite qual o seu sexo:");
        String sexo = teclado.nextLine();
        System.out.println("Digite o valor da sua compra: ");
        double valorCompra = teclado.nextDouble();

        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("homem")) {
            // valorComDescontoHomem é o valor com o desconto
            double valorComDescontoHomem = (valorCompra * 95)/100;
            System.out.printf("O valor com o desconto para homens é: %.2f%n", valorComDescontoHomem);
        } else if ( sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("mulher")) {
            // valorComDescontoMulher é valor com o desconto
            double valorComDescontoMulher = (valorCompra * 87)/100;
            System.out.printf("O valor com o desconto para mulheres é: %.2f%n", valorComDescontoMulher);
        } else {
            System.out.println("Você não identificou corretamento seu sexo");
        }
        teclado.close();
    }
}
