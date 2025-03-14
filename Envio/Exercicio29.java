public class Exercicio29 {
    public static void main(String[] args) {
        int idade = 45;
        String resultado = (idade >= 18 && idade <= 60) ? "Adulto" : (idade > 60) ? "Idoso" : "Jovem";
        System.out.println(resultado);
    }
}
