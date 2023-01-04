import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
        kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        Java ile kombinasyon hesaplayan program yazınız.
        formul = C(n,r) = x! / (y! * (x-y)!) */


        int x, y, z, t=1,k=1, p=1, comb;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the combination values C(x,y): ");

        System.out.println("Enter x : ");
        x= scan.nextInt();
        System.out.println("Enter y : ");
        y = scan.nextInt();

        z = x-y;

        for (int i = 1; i<=x; i++){
            t = t*i;
            System.out.println("x! = " +t);
        }
        for (int j = 1; j<=y; j++){
            k = k*j;
            System.out.println("y! = "+k);
        }
        for (int l =1; l<=z; l++){
            p = p*l;
        }
        System.out.println("Formule : C(n,r) = n! / (r! * (n-r)!) ");
        comb = t/(k*p);
        System.out.println("Combination Calculate : " + comb);

    }
}