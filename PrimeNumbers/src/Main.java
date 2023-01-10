public class Main {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 : ");
        for (int i = 1; i <= 100; i++) {
            int calc = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    calc++;
                }
            }
            if (calc == 2) {
                System.out.println(i);
            }
        }
    }
}