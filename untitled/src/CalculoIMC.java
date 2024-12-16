import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua massa (Kg)");
        double Kg = scanner.nextDouble();
        System.out.println("Digite a sua altura em metros");
        double A = scanner.nextDouble();

        double IMC = Kg / (A * A);

        if ((IMC>= 18.5) && (IMC < 25)) {
            System.out.println("Parabéns, você está no seu peso ideal");
            System.out.println(IMC);
        }else {
            System.out.println("Você não está na faixa de peso ideal");
            System.out.println(IMC);
        }
        scanner.close();
    }
}
