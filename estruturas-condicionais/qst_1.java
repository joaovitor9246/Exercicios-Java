package estudojava;
import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Qual é a velocidade do carro ? ");

        double velocidade = teclado.nextDouble();
            if (velocidade > 80){
                System.out.println("Você foi multado!! ");
                double multa = (velocidade -80) * 5;
                System.out.println(" Sua multa será de " + multa);
            } else {
                System.out.println("Você não foi multado !!!");
            }
        teclado.close();
    }
}
