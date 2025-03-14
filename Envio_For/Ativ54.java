import java.util.Scanner;

public class Ativ54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Digite um número (negativo para sair): ");
            numero = scanner.nextDouble();

            if (numero >= 0) {
                System.out.println("A raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
            }
        } while (numero >= 0);

        scanner.close();
    }
}