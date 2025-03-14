public class Ativ52 {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;

        do {
            boolean primo = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(num);
                count++;
            }
            num++;
        } while (count < 10);
    }
}