import java.util.Scanner;

class Ativ18 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Remove espaços em branco e converte para minúsculas para facilitar a comparação
        String cleanedInput = input.replaceAll("[\\W_]+", "").toLowerCase();

        // Verifica se a string é um palíndromo
        boolean isPalindrome = true;
        int length = cleanedInput.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Exibe o resultado
        if (isPalindrome) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }

        // Fecha o scanner
        scanner.close();
    }
}