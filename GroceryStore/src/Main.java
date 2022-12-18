import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        int aKg, eKg, dKg, mKg, pKg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Armut kaç kilo: ");
        aKg = scan.nextInt();
        System.out.print("Elma kaç kilo: ");
        eKg = scan.nextInt();
        System.out.print("Domates kaç kilo: ");
        dKg = scan.nextInt();
        System.out.print("Muz kaç kilo: ");
        mKg = scan.nextInt();
        System.out.print("Patlıcan kaç kilo: ");
        pKg = scan.nextInt();
        double toplam = ((aKg * armut) + (eKg * elma) + (dKg * domates) + (mKg * muz) + (pKg * patlican));
        System.out.println("Toplam Alışveriş Tutarı : " + toplam);


    }
}