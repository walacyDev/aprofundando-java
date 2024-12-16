
import java.util.Random;
import java.util.Scanner;

public class RockPapaScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        String[] escolhas = {"Pedra", "Papel", "Tesoura"};
        String escolha;
        String escolhaMaquina = escolhas[rand.nextInt(escolhas.length)].toLowerCase();

        System.out.println("Escolha: \nPedra \nPapel \nTesoura");

        escolha = scan.nextLine().toLowerCase();

        System.out.println(escolha);
        System.out.println(escolhaMaquina);
        System.out.println();

        if (escolha.equals("pedra") && escolhaMaquina.equals("pedra")){
            System.out.println("Empate");
        } else if (escolha.equals("pedra") && escolhaMaquina.equals("papel")) {
            System.out.println("Papel ganha!");
        } else if (escolha.equals("pedra") && escolhaMaquina.equals("tesoura")) {
            System.out.println("Pedra ganha!");
        } else if (escolha.equals("papel") && escolhaMaquina.equals("papel")) {
            System.out.println("Empate!");
        } else if (escolha.equals("papel") && escolhaMaquina.equals("pedra")) {
            System.out.println("Papel ganha!");
        } else if (escolha.equals("papel") && escolhaMaquina.equals("tesoura")) {
            System.out.println("Tesoura ganha!");
        } else if (escolha.equals("tesoura") && escolhaMaquina.equals("papel")) {
            System.out.println("Tesoura ganha!");
        } else if (escolha.equals("tesoura") && escolhaMaquina.equals("pedra")) {
            System.out.println("Tesoura Perde!");
        } else if (escolha.equals("tesoura") && escolhaMaquina.equals("tesoura")) {
            System.out.println("EMPATE!");
        }

        System.out.println("Jogo Encerrado!");
        scan.close();
    }
}
