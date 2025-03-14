import java.util.Scanner;

public class atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário que informe uma string
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();
        
        // StringBuilder é usado para criar a string invertida
        StringBuilder textoInvertido = new StringBuilder(texto);
        
        // Inverte a string
        textoInvertido.reverse();
        
        // Exibe a string invertida
        System.out.println("String invertida: " + textoInvertido.toString());
        
        sc.close(); // Fecha o Scanner
    }
}
