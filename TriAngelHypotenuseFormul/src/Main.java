import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        /*Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
         Ödev
         Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
         Formül
         Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
         𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
        
        int aKisakenar,bUzunkenar;
        double cHipotenus;
        double yukseklik;
        double alan;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. kenarı giriniz: ");
        aKisakenar = scan.nextInt();
        System.out.println("2. kenarı giriniz: ");
        bUzunkenar = scan.nextInt();
        cHipotenus = Math.sqrt(((aKisakenar*aKisakenar) + (bUzunkenar*bUzunkenar)));
        yukseklik = (aKisakenar + bUzunkenar + cHipotenus) / 2;
        alan = (bUzunkenar*yukseklik)/2;

        System.out.println("Hipotenüs :" + cHipotenus);
        System.out.println("Yükseklik :" + yukseklik);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
