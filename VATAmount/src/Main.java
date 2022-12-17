import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double tutar, kdvOran = 0.18, kdvTutar, kdvToplam;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ücter Tutarını Giriniz: ");
        tutar = scan.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvToplam = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar:" + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("Toplam tutar" + kdvToplam);
    }
}