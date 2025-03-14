public class Exercicio17 {
    public static void main(String[] args) {
        int idade = 70;
        boolean estudante = false;
        String resultado = (idade > 60 || estudante) ? "Qualificado para desconto" : "Não qualificado para desconto";
        System.out.println(resultado);
    }
}
