import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra para verificar se é um palíndromo:");
        String word = scan.nextLine().toLowerCase();

        String textoLimpo = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String textoInvertido = new StringBuilder(textoLimpo).reverse().toString();

        if (textoLimpo.equals(textoInvertido)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndormo.");
        }

        scan.close();
    }
}
