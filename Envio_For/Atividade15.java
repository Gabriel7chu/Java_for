public class Atividade15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Verifica se é múltiplo de 3 e 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Verifica se é múltiplo de 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Verifica se é múltiplo de 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Caso contrário, imprime o número
            else {
                System.out.println(i);
            }
        }
    }
}