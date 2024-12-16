import java.util.Random;
import java.util.Scanner;

public class DescubraOnumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int num_usu;
        int num_mach = random.nextInt(101);

        System.out.println("Escolha um número entre 0 e 100: ");
        num_usu = scan.nextInt();

        while (num_usu != num_mach){
            if (num_usu < num_mach) {
                System.out.println("O numero esperado é maior");
                System.out.println("Dê outro palpite");
                num_usu = scan.nextInt();
            } else if (num_usu > num_mach) {
                System.out.println("O numero esperado é menor");
                System.out.println("Dê outro palpite");
                num_usu = scan.nextInt();
            }
        }

        if (num_usu == num_mach) {
            System.out.println("Você acertou");
        }

            System.out.println(num_mach);
    }
}
