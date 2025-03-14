public class Atividade13{
    public static void main(String[] args) {
        int n = 10; // Número de termos
        long a = 0, b = 1; // Primeiros dois termos da sequência

        System.out.println("Primeiros 10 termos da sequência de Fibonacci:");

        // Imprime os primeiros 10 termos
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long temp = a;
            a = b;
            b = temp + b;
        }
    }
}