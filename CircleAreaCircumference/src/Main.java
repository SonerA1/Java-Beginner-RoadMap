import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360*/
        
        int r;
        double pi = 3.14;
        double area;
        double circumference;
        double angle;
        double oAngle;

        Scanner scan = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz :");
        r = scan.nextInt();
        System.out.println("Merkez açıyı giriniz: ");
        angle = scan.nextDouble();
        area = pi * r* r;
        circumference = 2*(pi * r);
        oAngle = (pi * (r * r)* angle)/360;
        System.out.println("Dairenin alanı :" + area);
        System.out.println("Dairen Dilim Alanı :" + oAngle);
        System.out.println("Dairenin çevresi :"+ circumference);
    }
}
