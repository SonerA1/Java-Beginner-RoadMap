import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının 
        "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Formül
        Kilo (kg) / Boy(m) * Boy(m)*/
        
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
