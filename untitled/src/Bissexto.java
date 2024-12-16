import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um ano para saber se ele é bissexto");
        int ano = scan.nextInt();

        if ((ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0)){
            System.out.println("Esse ano: " + ano + " é bissexto");
        }
    }
}
