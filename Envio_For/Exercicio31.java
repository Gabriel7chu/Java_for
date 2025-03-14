import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("Digite um número (negativo para parar): ");
            num = scanner.nextInt();
        } while (num >= 0);
    }
}
