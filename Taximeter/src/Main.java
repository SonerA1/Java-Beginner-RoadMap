import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/
        
        int km;
        double perKm = 2.20;
        double startPrice = 10.0;
        double total;
        double standartprice = 20.0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Gidilecek kilometreyi giriniz: ");
        km = scan.nextInt();
        total = startPrice + (km * perKm); // total = total + (km + perKm);
        total = (total < 20 ? 20 : total);
        System.out.println("Toplam ücret" + total);
    }
}
