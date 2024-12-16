import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qual tabuada deseja exibir de 1 a 10");
        int n = scan.nextInt();

        System.out.println("A tabuáda de " + n + " é:");
        for (int i = 0; i <= 10; i++){
            System.out.println(n + " x " +  i + " = " + n * i);
        }

    }
}
