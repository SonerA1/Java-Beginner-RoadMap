import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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