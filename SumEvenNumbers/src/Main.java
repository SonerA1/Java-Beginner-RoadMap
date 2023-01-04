import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter a Numbers : ");
            n = scan.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total += n;
            }
        } while (n % 2 != 1);
        System.out.println("Total : " + total);
    }

}