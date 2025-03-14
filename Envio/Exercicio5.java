public class Exercicio5 {
    public static void main(String[] args) {
        int ano = 2024;
        String resultado = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? "Ano bissexto" : "Não é ano bissexto";
        System.out.println(resultado);
    }
}
