public class Exercicio6 {
    public static void main(String[] args) {
        int idade = 20;
        boolean possuiCNH = true;
        String resultado = (idade >= 18 && possuiCNH) ? "Pode dirigir" : "Não pode dirigir";
        System.out.println(resultado);
    }
}
