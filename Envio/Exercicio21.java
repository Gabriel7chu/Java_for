public class Exercicio21 {
    public static void main(String[] args) {
        int numero = -7;
        String resultado = (numero % 2 == 0 && numero > 0) ? "Par e Positivo" :
                           (numero % 2 == 0 && numero < 0) ? "Par e Negativo" :
                           (numero % 2 != 0 && numero > 0) ? "Ímpar e Positivo" : "Ímpar e Negativo";
        System.out.println(resultado);
    }
}
