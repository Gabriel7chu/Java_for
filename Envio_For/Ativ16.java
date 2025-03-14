import java.util.Scanner;

public class Ativ16 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Exibe os caracteres da string um por um
        System.out.println("Os caracteres da string são:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        // Fecha o scanner
        scanner.close();
    }
}