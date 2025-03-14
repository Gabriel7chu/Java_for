import java.util.Scanner;

public class atividade21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário que informe um número
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
        int soma = 0;
        
        // Enquanto o número for maior que 0, extrai os dígitos e soma
        while (numero > 0) {
            soma += numero % 10; // Extrai o último dígito e adiciona à soma
            numero /= 10; // Remove o último dígito do número
        }
        
        // Exibe a soma dos dígitos
        System.out.println("A soma dos dígitos é: " + soma);
        
        sc.close(); // Fecha o Scanner
    }
}
