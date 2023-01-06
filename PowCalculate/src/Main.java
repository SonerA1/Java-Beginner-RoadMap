import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, total = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = scan.nextInt();
        System.out.println("Power of number : ");
        k = scan.nextInt();
        int i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }
        System.out.println("Total : " + total);
    }
}