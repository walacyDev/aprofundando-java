import java.util.Scanner;

public class SomaDeNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números pares até "+num +" é: "+ soma);
    }
}
