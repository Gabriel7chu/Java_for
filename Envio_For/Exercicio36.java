public class Exercicio36 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;
        
        do {
            soma += i;
            i++;
        } while (i <= 50);
        
        System.out.println("Soma dos números de 1 a 50: " + soma);
    }
}
