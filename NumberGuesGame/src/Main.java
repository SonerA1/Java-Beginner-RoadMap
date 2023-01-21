import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100);
        //double number = (int)(Math.random()*100);

        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);


        while (right < 5) {
            System.out.print("Please enter your Gues :");
            selected = scan.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a 0-100s");
                if (!isWrong){
                    isWrong= true;
                    System.out.println("if u enter a others number your Right will fall :X");
                }else{
                    System.out.println("Too much wrong gues. Righ : " + (5-(++right)));
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Congratulations!!!" + number);
                isWin = true;
                break;
            } else {

                System.out.println("Wrong number!");
                if (selected > number) {
                    System.out.println(selected + "your number greater than hidden number :)");
                } else {
                    System.out.println(selected + "your number lower than hidden number :)");
                }
                wrong[right++] = selected;
                System.out.println("Your right : " + (5 - right));
            }

        }
        if (!isWin) {
            System.out.println("You lose!!!!");
        }
        System.out.println("Your Gues : " + Arrays.toString(wrong));

    }
}

