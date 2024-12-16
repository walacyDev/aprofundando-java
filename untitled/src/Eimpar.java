import java.util.Scanner;

public class Eimpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int par;

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();

        par = num % 2;

        if (par != 0) {
            System.out.println("Ele é um numero impar");
        } else {
            System.out.println("É numero par");
        }
    }
}
