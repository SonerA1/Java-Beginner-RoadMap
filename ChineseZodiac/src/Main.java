import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Çin Zodyağı nedir?
        4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. 
        Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
        Çin Zodyağı nasıl hesaplanır?
        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        Doğum Tarihi %12 = 0 ➜ Maymun
        Doğum Tarihi %12 = 1 ➜ Horoz
        Doğum Tarihi %12 = 2 ➜ Köpek
        Doğum Tarihi %12 = 3 ➜ Domuz
        Doğum Tarihi %12 = 4 ➜ Fare
        Doğum Tarihi %12 = 5 ➜ Öküz
        Doğum Tarihi %12 = 6 ➜ Kaplan
        Doğum Tarihi %12 = 7 ➜ Tavşan
        Doğum Tarihi %12 = 8 ➜ Ejderha
        Doğum Tarihi %12 = 9 ➜ Yılan
        Doğum Tarihi %12 = 10 ➜ At
        Doğum Tarihi %12 = 11 ➜ Koyun*/
        
        
        int year, calc;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Birth Year : ");
        year = scan.nextInt();
        calc = year%12;
        String zodiac = "";
        switch (calc){
            case 0:
                System.out.println(zodiac = "Monkey");
                break;
            case 1:
                System.out.println(zodiac = "Cockerel");
                break;
            case 2:
                System.out.println(zodiac = "Dog");
                break;
            case 3:
                System.out.println(zodiac = "Pig");
                break;
            case 4:
                System.out.println(zodiac = "Rat");
                break;
            case 5:
                System.out.println(zodiac = "Ox");
                break;
            case 6:
                System.out.println(zodiac = "Tiger");
                break;
            case 7:
                System.out.println(zodiac = "Rabit");
                break;
            case 8:
                System.out.println(zodiac = "Dragon");
                break;
            case 9:
                System.out.println(zodiac = "Snake");
                break;
            case 10:
                System.out.println(zodiac = "Horse");
                break;
            case 11:
                System.out.println(zodiac = "Sheep");
                break;
            default:
                System.out.println("Wrong Year");
        }
    }
}
