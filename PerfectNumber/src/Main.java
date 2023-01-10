import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
        değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
        Mükemmel Sayı Nedir ?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan
        sayıya mükemmel sayı denir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scan.nextInt();
        int total = 0;

        for (int i = 1; i < n; i++){
            if (n % i == 0){
                total += i;
            }
        }
        if ( n == total){
            System.out.println(n + " " + "Perfect Number!");
        }else {
            System.out.println(n + " " + "is not a Perfect Number");
        }



    }
}