public class Exercicio18 {
    public static void main(String[] args) {
        int lado1 = 5, lado2 = 5, lado3 = 5;
        String resultado = (lado1 == lado2 && lado2 == lado3) ? "Equilátero" :
                           (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) ? "Isósceles" : "Escaleno";
        System.out.println(resultado);
    }
}
