public class atividade27 {
    public static void main(String[] args) {
        // Criando um vetor de inteiros
        int[] numeros = {1, 2, 3, 4, 5};

        // Variável para armazenar a soma
        int soma = 0;

        // Loop para somar os elementos do vetor
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];  // Adiciona o valor do elemento ao total da soma
        }

        // Exibe a soma dos números do vetor
        System.out.println("A soma dos números do vetor é: " + soma);
    }
}
