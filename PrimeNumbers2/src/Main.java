import java.awt.*;
import java.util.Scanner;

public class Main {
    /*
    Java dilinde "Recursive" metot kullanarak,
    kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
     */
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        boolean result = isPrime(n);
        if (result == true){
            System.out.println(n + " " + "is a Prime number");
        }else {
            System.out.println(n + " " + "is not a Prime number");
        }
    }
}