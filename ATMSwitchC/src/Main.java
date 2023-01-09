import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 2000;
        while (right > 0) {
            System.out.print("Username : ");
            userName = scan.nextLine();
            System.out.print("Password : ");
            password = scan.nextLine();

            if (userName.equals("SonerA1") && password.equals("Java123")) {
                System.out.println("Success Login : Welcome!");
                do {
                    System.out.println("1-Deposit : \n" +
                            "2-Withdraw : \n" +
                            "3-Balance : \n" +
                            "4-Quit : ");
                    System.out.print("Please select action : ");
                    select = scan.nextInt();
                    int price;
                    switch (select) {
                        case 1:
                            System.out.print("Money Credit : ");
                            price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Money Credit : ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient Balance");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Your Balance : " + balance);
                    }
                } while (select != 4);
                {
                    System.out.println("See you again..");
                    break;
                }
            } else {
                right--;
                System.out.println("Username or Password is wrong.Please Try Again.");
                if (right == 0) {
                    System.out.println("Your Account is Blocked. Please Contact the Bank");
                } else {
                    System.out.println("Your remain right : " + right);
                }
            }
        }
    }
}