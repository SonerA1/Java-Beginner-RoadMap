import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve 
        ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak, 
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.*/
        
        int n1, n2, select;

        Scanner scan = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz : ");
        n1 = scan.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = scan.nextInt();


        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiniz : ");
        select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez");
                }
                break;
                default:
                System.out.println("Yanlış Bir Seçim Yaptınız... Tekrar Giriniz");
        }
    }
}
