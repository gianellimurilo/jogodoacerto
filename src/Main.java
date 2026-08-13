import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        int numeroCerto;
        int palpite;

        Jogo jogo = new Jogo();
        numeroCerto = jogo.getValor();

        while(continuar) {
            System.out.println("Jogo da advinhação (1 a 100)");
            System.out.println("");

            System.out.println("Escolha o número do seu palpite: ");
            palpite = scanner.nextInt();

            int diferenca = Math.abs(palpite - numeroCerto);

            if (diferenca > 50) {
                System.out.println("Totalmente longe");
            } else if (diferenca > 40) {
                System.out.println("Muito longe");
            } else if (diferenca > 30) {
                System.out.println("Bem longe");
            } else if (diferenca > 20) {
                System.out.println("Longe");
            } else if (diferenca > 15) {
                System.out.println("Mais ou menos");
            } else if (diferenca > 10) {
                System.out.println("Aproximando");
            } else if (diferenca > 8) {
                System.out.println("Aproximando Mais");
            } else if (diferenca > 6) {
                System.out.println("Bem perto");
            } else if (diferenca > 4) {
                System.out.println("Muito perto");
            } else if (diferenca > 2) {
                System.out.println("Completamente perto");
            } else if (diferenca > 1) {
                System.out.println("Pertissimo");
            }else if (diferenca == 1) {
                System.out.println("Na trave");
            } else if (diferenca == 0) {
                System.out.println("ACERTOU!!!");
                continuar = false;
            }
        }
    }
}
