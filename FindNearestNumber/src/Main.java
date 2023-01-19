import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
    Örnek :
    Dizi : {15,12,788,1,-1,-778,2,0}
    Girilen Sayı : 5
    Girilen sayıdan küçük en yakın sayı : 2
    Girilen sayıdan büyük en yakın sayı : 12
    Github : SonerA1
     */
    public static void main(String[] args) {
        int list [] = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list); // Burası önemli:
        int min = list[0];
        int max = list[list.length - 1];

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();

        for (int i = 0; i < list.length; i++){
            if (list[i] < n){
                if (list[i] > min){
                    min = list[i];
                }
            }
        }
        System.out.print("The minimum nearest number : " +min);
        System.out.println("===========");

        for (int j = 0; j < list.length; j++){
            if (list[j] > n){
                if (list[j] < max){
                    max = list[j];
                }
            }
        }
        System.out.println(" The maximum nearest number : " + max);



    }
}