class Ativ30 {
    public static void main(String[] args) {
        // Exemplo de vetor de inteiros
        int[] numeros = {10, 15, 23, 42, 55, 60, 71, 80};

        // Chama o método para contar pares e ímpares
        contarParesImpares(numeros);
    }

    // Método para contar números pares e ímpares
    public static void contarParesImpares(int[] vetor) {
        int pares = 0;
        int impares = 0;

        // Percorre o vetor e conta os números pares e ímpares
        for (int num : vetor) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibe o resultado
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
