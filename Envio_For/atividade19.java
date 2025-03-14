import java.util.Scanner;

public class atividade19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário que informe um número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();
        
        // Variável para armazenar o resultado do fatorial
        long fatorial = 1;
        
        // Verifica se o número é negativo, já que o fatorial de números negativos não existe
        if (numero < 0) {
            System.out.println("Fatorial não existe para números negativos.");
        } else {
            // Calcula o fatorial usando um loop
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            // Exibe o resultado
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        
        sc.close(); // Fecha o Scanner
    }
}
