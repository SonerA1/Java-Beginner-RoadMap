import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*Koşullar :
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/
        
        
        int heat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature value : ");
        heat = scan.nextInt();
        if (heat < 5){
            System.out.println("Going go skiing");
        } else if (heat >5 && heat< 15) {
            System.out.println("Going to Cinema");
        } else if (heat >15 && heat<25) {
            System.out.println("Going to picnic");
        } else if (heat > 25) {
            System.out.println("Going to swiming");
        }
        System.out.println("Have fun :)");
    }
}
