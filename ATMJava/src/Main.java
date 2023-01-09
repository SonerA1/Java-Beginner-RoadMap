import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner scan = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Username : ");
            userName = scan.nextLine();
            System.out.print("Password : ");
            password = scan.nextLine();
            if (userName.equals("SonerA1") && password.equals("JavaBasic123")) {
                System.out.println("Success Login : Welcome!");
                do {
                    System.out.println(
                            "1-Deposit\n" +
                                    "2-Withdraw\n" +
                                    "3-Balance Inguiry\n" +
                                    "4-Quit");
                    System.out.print("Please Select The action : ");
                    select = scan.nextInt();
                    if (select == 1) {
                        System.out.print("Money credit : ");
                        int price = scan.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Money credit : ");
                        int price = scan.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient Balance");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Your Balance : " + balance);
                    }
                } while (select != 4);
                {
                    System.out.println("See you again.");
                }
                break;
            } else {
                right--;
                System.out.println("Usurname or password is wrong. Please try again..");
                if (right == 0) {
                    System.out.println("Your account is blocked. Please contatct the bank. ");
                } else {
                    System.out.println("You remain right : " + right);
                }
            }
        }
    }
}