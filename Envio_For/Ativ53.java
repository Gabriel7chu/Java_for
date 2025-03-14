public class Ativ53 {
    public static void main(String[] args) {
        int n = 1;
        int count = 0;

        do {
            int numeroTriangular = (n * (n + 1)) / 2;
            System.out.println("T(" + n + ") = " + numeroTriangular);
            n++;
            count++;
        } while (count < 10);
    }
}
