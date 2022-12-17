import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weigth;
        double bodysize;
        double bmIndex;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütefen boyunuzu(metre cinsinde) giriniz : ");
        bodysize = scan.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weigth = scan.nextInt();

        bmIndex = (weigth / (bodysize * bodysize));
        System.out.print("Vücut Kitle İndeksiniz : " + bmIndex);
    }
}