import java.util.Scanner;

public class Main {
    /*
    Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.
    Hesap makinesinin fonksiyonları :
    1- Toplama İşlemi
    2- Çıkarma İşlemi
    3- Çarpma İşlemi
    4- Bölme işlemi
    5- Üslü Sayı Hesaplama
    6- Faktoriyel Hesaplama
    7- Mod Alma
    8- Dikdörtgen Alan ve Çevre Hesabı
    Github : SonerA1
     */
    static void sum() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". Number : ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter :");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result : " + result);
    }
    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". Number :");
            number = scan.nextInt();

            if (number == 1) break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result : " + result);
    }
    static void divide() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Second number must be greater than 0!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result : " + result);
    }
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number :");
        int base = scan.nextInt();
        System.out.print("Power Number :");
        int exponent = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result : " + result);
    }
    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scan.nextInt();
        System.out.println("Enter the second number : ");
        int b = scan.nextInt();
        int result = a % b;
        System.out.println("Result : " + result);
    }
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result : " + result);
    }

    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Long Edge : ");
        int a = scan.nextInt();
        System.out.println("Enter the Short Edge : ");
        int b = scan.nextInt();
        int perimeter = (2 * (a + b));
        int area = a * b;
        System.out.println("Perimeter : " + perimeter);
        System.out.println("Area : " + area);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-Addition\n" +
                "2-Subtraction\n" +
                "3-Times\n" +
                "4-ToDivide\n" +
                "5-Power\n" +
                "6-Modding\n" +
                "7-Factorial\n" +
                "8-Rectangle Area and Perimeter\n" +
                "0-Quit";
        System.out.println(menu);
        while (true) {

            System.out.print("Select : ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    mod();
                    break;
                case 7:
                    factorial();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Invalid Operation!!");
            }
        }
        System.out.println("ByeBye...!");
    }
}