import java.util.Scanner;

public class PossoVotar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int anoAtual = 2024;

        System.out.println("Qual a data do seu nascimento? ");
        int anoNascimento = scan.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade < 18) {
            System.out.println("Você não pode votar");
        }else {
            System.out.println("Você pode votar!");
        }
    }
}
