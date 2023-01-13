import java.awt.*;
import java.util.Scanner;

public class Main {
    /*
    Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    Yine her ekleme işleminde sayının son değerini ekrana yazdırın.Github:SonerA1
     */
    static int pattern(int n, int m) {
        if (n > 0) {
            System.out.println(n + " ");
            n -= 5;
            return pattern(n, m);
        }
        return pattern2(n, m);
    }

    static int pattern2(int n, int m) {
        if (n <= m) {
            System.out.println(n + " ");
            n += 5;
            return pattern2(n, m);
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m;
        do {
            System.out.print("Enter a number : ");
            m = scan.nextInt();
            int n = m;
            pattern(n, m);
            System.out.println();
        } while (m > 0);
    }
}

