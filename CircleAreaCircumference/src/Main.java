import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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