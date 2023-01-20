import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
    Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
    Senaryo:

    Dizinin boyutu n : 5
    Dizinin elemanlarını giriniz :
    1. Elemanı : 99
    2. Elemanı : -2
    3. Elemanı : -2121
    4. Elemanı : 1
    5. Elemanı : 0
    Sıralama : -2121 -2 0 1 99


    Dizinin boyutu n : 6
    Dizinin elemanlarını giriniz :
    1. Elemanı : 1000221
    2. Elemanı : 22
    3. Elemanı : -1
    4. Elemanı : 999
    5. Elemanı : 0
    6. Elemanı : 254
    Sıralama : -1 0 22 254 999 1000221
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = scan.nextInt();

        int[] list = new int[n];

        System.out.println("Enter the elements of the Array : ");
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + " " + "Elements : ");
            list[i] = scan.nextInt();
        }
        int m;
        for (int i = 0; i <list.length; i++){
            for (int j = i; j < list.length; j++){
                if (list[i] > list[j]){
                    m = list[i];
                    list[i] = list[j];
                    list[j] = m;
                }
            }
        }
        System.out.print("Ranking : ");
        System.out.println(Arrays.toString(list));
    }
}