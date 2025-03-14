public class Atividade29 {
    public static void main(String[] args) {
        // Criando um vetor de inteiros
        int[] numeros = {64, 25, 12, 22, 11};

        // Algoritmo de seleção (Selection Sort)
        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMenor = i; // Assume que o primeiro elemento é o menor

            // Encontrar o menor elemento no restante do vetor
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j; // Atualiza o índice do menor elemento
                }
            }

            // Troca o menor elemento com o primeiro elemento não ordenado
            if (indiceMenor != i) {
                int temp = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = temp;
            }
        }

        // Exibe o vetor ordenado
        System.out.print("Vetor ordenado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
