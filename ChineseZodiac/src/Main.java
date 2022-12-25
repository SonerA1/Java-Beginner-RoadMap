import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
