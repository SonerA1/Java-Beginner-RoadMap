import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

        Senaryo
        Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
        Tekrar Sayıları
        10 sayısı 3 kere tekrar edildi.
        20 sayısı 4 kere tekrar edildi.
        5 sayısı 1 kere tekrar edildi.
         */
        int list[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int calc;
        System.out.println("Arrays : " + Arrays.toString(list));
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            calc = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    calc++;
                }
            }
            if (i == 0 && list[i] == list[i + 1]) {
                System.out.println(list[i] + " " + calc + " " + "times" + "repeted");
            }
            if (i == 0 && list[i] != list[i + 1]) {
                System.out.println(list[i] + " " + calc + "times" + "repeted");
            }
            if (i != 0 && list[i] != list[i - 1]) {
                System.out.println(list[i] + " " + calc + "times" + " repeted");
            }
        }
    }
}