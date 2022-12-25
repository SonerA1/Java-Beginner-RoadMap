import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age, km, select;
        double nPrice, total, ticket, discPrice, fullPrice, kidDisc = 0.50, teenDisc = 0.10, oldDisc = 0.30, dWay = 0.20;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = scan.nextInt();
        System.out.println("Enter The Distance in KM");
        km = scan.nextInt();
        System.out.println("1-One way 2-Double Way");
        select = scan.nextInt();
        scan.close();
        nPrice = km * 0.10;

        if (select == 1 && age >= 1 && age <= 100 && km >= 1) {
            System.out.println("Your Select : 1-One Way: ");
            if (age < 12) {
                discPrice = nPrice * kidDisc;
                total = nPrice - discPrice;
                System.out.println("Standart Price : " +
                        nPrice + "$" + "," +
                        "Discount Price : " + discPrice + "$" + "," +
                        "Total Price : " + total + "$");
            } else if (age >= 12 && age <= 24) {
                discPrice = nPrice * teenDisc;
                total = nPrice - discPrice;
                System.out.println("Standart Price : " +
                        nPrice + "$" + "," +
                        "Discount Price : " + discPrice + "$" + "," +
                        "Total Price : " + total + "$");
            } else if (age >= 65 && age < 100) {
                discPrice = nPrice * oldDisc;
                total = nPrice - discPrice;
                System.out.println("Standart Price : " +
                        nPrice + "$" + "," +
                        "Discount Price : " + discPrice + "$" + "," +
                        "Total Price : " + total + "$");
            }
        } else if (select == 2 && age >= 1 && age <= 100 && km >= 1) {
            ticket = nPrice;
            discPrice = ticket - (nPrice * kidDisc);
            fullPrice = ((discPrice) - (dWay * discPrice)) * 2;
            ;
            if (age < 12) {
                System.out.println("Standart Price : " + ticket + "$" + "," +
                        "Discount Price : " + discPrice + "$" + "," +
                        "Total Price : " + fullPrice + "$");
            } else if (age >= 12 && age <= 24) {
                ticket = nPrice;
                discPrice = ticket - (nPrice * teenDisc);
                fullPrice = ((discPrice) - (dWay * discPrice)) * 2;
                System.out.println("Standart Price : " + ticket + "$" + "," +
                        "Discount Price : " + discPrice + "$" + "," +
                        "Total Price : " + fullPrice + "$");
            } else if (age >= 65 && age <= 100) {
                ticket = nPrice;
                discPrice = ticket - (nPrice * oldDisc);
                fullPrice = ((discPrice) - (dWay * discPrice)) * 2;
                System.out.println("Standart Price : " + ticket + "$" + "," +
                        "Discount Price : " + discPrice + "$" + "," +
                        "Total Price : " + fullPrice + "$");
            }

        } else {
            System.out.println("Wrong Select or Worng enter.. Try Again");
        }
    }
}


