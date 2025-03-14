import java.util.Scanner;

class Ativ22 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Exibe os divisores do número
        System.out.println("Os divisores de " + numero + " são:");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) { // Verifica se o número é divisível por 'i'
                System.out.println(i);
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
