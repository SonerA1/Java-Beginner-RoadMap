import java.util.Scanner;

public class Main {
    //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
    
    
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        n = scan.nextInt();

        for (int i = 1; i<= 100; i*=2){
            System.out.println(i);
        }
    }
}
