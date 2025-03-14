class Ativ28 {
    public static void main(String[] args) {
        // Exemplo de vetor de inteiros
        int[] numeros = {10, 20, 30, 40, 50};

        // Chama o método para calcular e exibir a média
        double media = calcularMedia(numeros);
        System.out.println("A média dos números do vetor é: " + media);
    }

    // Método para calcular a média
    public static double calcularMedia(int[] vetor) {
        int soma = 0;

        // Calcula a soma dos elementos do vetor
        for (int num : vetor) {
            soma += num;
        }

        // Calcula a média
        return (double) soma / vetor.length;
    }
}
