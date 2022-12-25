import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
        
        String userName, password, pick;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = scan.nextLine();
        System.out.print("Şifreniz : ");
        password = scan.nextLine();

        if (userName.equals("SonerA1") && password.equals("Java123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış. Lütfen tekrar deniyin...");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ?");
        }
        pick = scan.nextLine();

        if (pick.equals("Yes")) {
            System.out.println("Yeni şifrenizi giriniz.");
            password = scan.nextLine();
            System.out.println("Yeni şifrenizi tekrar giriniz.");
            password = scan.nextLine();
            if (password.equals("Java123")) {
                System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz! Tekrar Deneyin");
            } else {
                System.out.println("Şifreniz Başarıyla Oluşturuldu.Tekrar Giriş Yapınız.");
            }

        }
    }
}

