public class Atividade7 {
    public static void main(String[] args) {
        int soma = 0;
        
        // Percorrer os números de 1 a 100
        for (int i = 1; i <= 100; i++) {
            // Verificar se o número é ímpar
            if (i % 2 != 0) {
                soma += i;
            }
        }
        
        System.out.println("A soma dos números ímpares de 1 a 100 é: " + soma);
    }
}