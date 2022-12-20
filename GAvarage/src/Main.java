import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, turkish, physics, chemical, music;
        int total= 0;
        int point = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Math Point : ");
        math =scan.nextInt();
        if (math > 0 && math <= 100){
            total = total + math;
            point++;
        }
        System.out.println("Physics Point : ");
        physics =scan.nextInt();
        if (physics > 0 && physics <= 100){
            total = total + physics;
            point++;
        }
        System.out.println("Chemical Point : ");
        chemical =scan.nextInt();
        if (chemical > 0 && chemical <= 100){
            total = total + chemical;
            point++;
        }
        System.out.println("Turkish Point : ");
        turkish =scan.nextInt();
        if (turkish > 0 && turkish <= 100){
            total = total+ turkish;
            point++;
        }
        System.out.println("Music Point : ");
        music =scan.nextInt();
        if (music > 0 && music <= 100){
            total = total +music;
            point++;
        }

        double avarage = total/point;
        if (avarage <= 55){
            System.out.println("Sory failed this class, See you next year ");
        }else {
            System.out.println("Congratulations, You Have Successfully Completed the Class");
        }
        System.out.println("Avarage : " + avarage);

    }
}
