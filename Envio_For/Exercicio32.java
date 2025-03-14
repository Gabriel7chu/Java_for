import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, soma = 0;
        
        do {
            System.out.print("Digite um número (zero para parar): ");
            num = scanner.nextInt();
            soma += num;
        } while (num != 0);
        
        System.out.println("Soma dos números: " + soma);
    }
}
