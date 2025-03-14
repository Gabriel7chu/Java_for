import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado = 0
       
        for (int i = 0; i < 10; i++){
            resultado = i * 5
            System.out.printf("Multiplos: " + resultado);
        }
    }
}