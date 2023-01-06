import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n;
        int k = 0;
        int total = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = scan.nextInt();
        while (n != 0){
            total += (n % 10);
            n /= 10;
            k++;
        }
        System.out.println("Sum digits : " + total);

    }
}