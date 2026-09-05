import java.util.Scanner;

public class qst_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos quilômetros você irá percorrer ?");
        double distancia = teclado.nextDouble();
        System.out.println("Como você irá percorrer: " + distancia );

        double preco;

        if(distancia <= 200){
            //preco1 é o preço para viagens até 200km
            preco = distancia * 0.5;
        } else {
            //preco2 é o preço para viagens maiores que 200km
            preco = distancia * 0.45;
        }

        System.out.printf("O preço da passagem será de R$ %.2f %n", preco);
        teclado.close();
    }
}