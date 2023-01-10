import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile
        ekrana ters üçgen çizen programı yazın.
        Örnek
        Basamak Sayısı : 10
        *******************
         *****************
          ***************
           *************
            ***********
             *********
              *******
               *****
                ***
                 *
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * n - 1; k >= (2 * i + 1); k--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}