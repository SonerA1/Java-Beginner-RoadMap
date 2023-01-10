import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Fibonacci Serisi Nedir ?
        Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
        Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
        yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
        Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
            0 + 1 = 1
            1 + 1 = 2
            1 + 2 = 3
            2 + 3 = 5
            3 + 5 = 8
            5 + 8 = 13
            13 + 8 = 21
            21 + 8 = 34
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonnacci Seris is Begin : Enter a Number : ");
        int n = scan.nextInt();
        int calc = 0, i = 0, total = 0, l = 1;
        System.out.println("Numbers of Fibonacci Series : " + n);
        while (calc <= n) {
            total = i + l;
            System.out.print(i + " ");
            i = l;
            l = total;
            calc++;
        }
    }
}