import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catraca catraca = new Catraca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o número do crachá (ou 0 para sair): ");
            int numeroCracha = scanner.nextInt();

            if (numeroCracha == 0) {
                break;
            }

            Cracha cracha = new Cracha(numeroCracha);
            catraca.verificarCracha(cracha);
        }
    }
}

