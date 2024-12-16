import java.util.ArrayList;
import java.util.Scanner;

public class NFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> fibonacci = new ArrayList<>(){{
            add(1);
            add(1);
        }};
        int soma = 1;

        System.out.println("Digite um numero: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            soma += fibonacci.get(i-1);

            fibonacci.add(soma);
        }

        System.out.println(fibonacci);
    }
}
