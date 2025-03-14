import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número de 1 a 10: ");
        int numero = sc.nextInt();

        System.out.println("Múltiplos de " + numero + ":");
        
        // Loop para exibir os múltiplos de 1 até 10
        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            int resultado = numero * tabuada; 
            System.out.printf("%d ", resultado); // Exibe os múltiplos
        }
        
        sc.close(); // Fecha o Scanner
    }
}
