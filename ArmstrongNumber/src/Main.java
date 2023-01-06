import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Armstrong Sayı Nedir ?
        N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle
        sayılara Armstrong sayı denir.
        Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
        Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
        1342 sayısına da bakalım.
        (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
        1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
        54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
         */

        //How to find number of digits
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0
        //-------------
        // How to find last digit :
        /* exmp = 2451 & 10 =1
        int b = 2451;
        int c =b & 10;
        int sub = 2, sup = 3;
        int result = 1;
        for(int i = 1; i<= sup i++){
            result *= sup)
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        int numberDigit = 0;
        int tempNumber = number;
        int numberValue;
        int result = 0;
        int numberPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            numberDigit++;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            numberValue = tempNumber % 10;
            numberPow = 1;
            for (int i = 1; i <= numberDigit; i++) {
                numberPow *= numberValue;
            }
            result += numberPow;
            tempNumber /= 10;
        }
        System.out.println(result);
    }
}
