public class Atividade25 {
    public static void main(String[] args) {
        int altura = 5;
        
        // Loop para cada linha do triângulo
        for (int i = 1; i <= altura; i++) {
            // Loop para imprimir os asteriscos em cada linha
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  // Imprime o asterisco
            }
            // Muda para a próxima linha após imprimir os asteriscos
            System.out.println();
        }
    }
}
