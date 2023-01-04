import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        n = scan.nextInt();

        System.out.println("Multiple of 4 : ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("----------------");
        System.out.println("Multiple of 5 : ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}