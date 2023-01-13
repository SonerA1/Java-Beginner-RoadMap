import java.util.Scanner;

public class Main {
    /*
    recursive Metotlar ile Üslü Sayı Hesaplama
    Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot
    kullanarak yapan programı yazınız.
    Senaryo:.... GitHub : SonerA1
    Taban değeri giriniz :2
    Üs değerini giriniz : 0
    Sonuç : 1
    Taban değeri giriniz : 2
    Üs değerini giriniz : 3
    Sonuç : 8
    Taban değeri giriniz : 5
    Üs değerini giriniz : 3
    Sonuç : 125
     */
    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Number :");
        int base = scan.nextInt();
        System.out.print("Power Number :");
        int exponent = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result : " + result);
    }

    public static void main(String[] args) {
        power();
    }
}