public class Ativ26 {
    public static void main(String[] args) {
        int base = 5;

        // Parte superior do losango
        for (int i = 1; i <= base; i++) {
            // Imprime os espaços antes dos números
            for (int j = i; j < base; j++) {
                System.out.print(" ");
            }

            // Imprime os números
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i);
            }

            System.out.println();
        }

        // Parte inferior do losango
        for (int i = base - 1; i >= 1; i--) {
            // Imprime os espaços antes dos números
            for (int j = base; j > i; j--) {
                System.out.print(" ");
            }

            // Imprime os números
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

