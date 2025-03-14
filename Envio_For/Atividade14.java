public class Atividade14 {

    public static void main(String[] args) {
        System.out.println("Números primos de 1 a 50:");
        
        for (int num = 2; num <= 50; num++) {
            if (ehPrimo(num)) {
                System.out.println(num);
            }
        }
    }
    
    // Método para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}