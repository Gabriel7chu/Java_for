import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        int soma = 0;
        do {
            soma += num % 10;  // Extrai o último dígito
            num /= 10;  // Remove o último dígito
        } while (num > 0);
        
        System.out.println("Soma dos dígitos: " + soma);
    }
}
