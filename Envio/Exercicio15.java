public class Exercicio15 {
    public static void main(String[] args) {
        int numero = 15;
        String resultado = (numero % 3 == 0 && numero % 5 == 0) ? "FizzBuzz" : Integer.toString(numero);
        System.out.println(resultado);
    }
}
