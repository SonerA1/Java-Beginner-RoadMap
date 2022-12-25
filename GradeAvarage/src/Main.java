import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfı tanımladık
        Scanner scan = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.println("Matematik notunuz: ");
        matematik = scan.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = scan.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = scan.nextInt();
        System.out.println("Turkce notunuz: ");
        turkce = scan.nextInt();
        System.out.println("Tarih notunuz: ");
        tarih = scan.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = scan.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız " + sonuc);
        System.out.println(sonuc > 60 ? "Geçtiniz" : "Kaldınız");

    }
}
