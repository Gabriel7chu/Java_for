public class Exercicio24 {
    public static void main(String[] args) {
        int numero = 28;
        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) somaDivisores += i;
        }
        String resultado = (somaDivisores == numero) ? "Perfeito" : "Não perfeito";
        System.out.println(resultado);
    }
}
