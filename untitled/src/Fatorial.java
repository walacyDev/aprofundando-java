import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero que deseja encontrar o Fatorial");
        int num = scan.nextInt();

        int fat = 1;

        for (int i = 1; i <= num; i++) {
            fat *= i;
        }

        System.out.println("O fatoria de "+ num + " é: "+fat);
    }
}
