import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int t, total = 0, calc = 0;
        double avarage;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        t = scan.nextInt();

        for (int i = 0; i <= t; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                total = total + i;
                calc++;
            }
        }
        System.out.println("Total : " + total);
        avarage = total / calc;
        System.out.println("Avarage : " + calc);
    }
}

