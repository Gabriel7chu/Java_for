import java.util.Scanner;

class Ativ47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int i = 2;
        boolean primo = true;

        do {
            if (numero % i == 0 && i != numero) {
                primo = false;
                break;
            }
            i++;
        } while (i <= numero / 2);

        if (primo && numero > 1) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        scanner.close();
    }
}