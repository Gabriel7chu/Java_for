class Ativ24 {
    public static void main(String[] args) {
        // Exibe os primeiros 10 números triangulares
        System.out.println("Sequência dos números triangulares até o décimo termo:");

        for (int n = 1; n <= 10; n++) {
            // Calcula o número triangular
            int numeroTriangular = (n * (n + 1)) / 2;
            System.out.println("T(" + n + ") = " + numeroTriangular);
        }
    }
}
