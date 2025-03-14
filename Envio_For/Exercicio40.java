import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, count = 0;
        
        do {
            System.out.print("Digite um número (zero para parar): ");
            num = scanner.nextInt();
            count++;
        } while (num != 0);
        
        System.out.println("Quantidade de números digitados: " + (count - 1));  // Subtrai o zero
    }
}
