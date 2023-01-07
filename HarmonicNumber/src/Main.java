import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter N number : ");
        int n = scan.nextInt();
        double total = 0;
        for (double i = 1; i<=n; i++){
            total += (1.0/i);
        }
        System.out.println(total);
    }
}