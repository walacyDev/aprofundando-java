import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int MAX_VELO = 80;

        System.out.println("A que velocidade está seu carro? ");
        int veloCarro = scan.nextInt();

        int multa = (veloCarro - MAX_VELO) * 5;

        if (veloCarro > MAX_VELO) {
            System.out.println("Você foi multado por andar acima da velocidade do radar");
            System.out.println("A sua multa foi no valor de: "+ multa + "R$");
        } else {
            System.out.println("Programa finalizado!");
        }
    }
}
