public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
        Harmonik Seri Formülü : 1+1/2+1/3+1/4+1/5...

         */
        int[] list = {1,2,3,4,5};
        double sum = 0.0;

        for (int i = 0; i< list.length; i++){
            sum += list[i];
        }
        double avarage = sum / list.length;
        System.out.println("List Avarage : " + avarage);


        sum = 0;
        for (int i = 0; i < list.length; i++){
            sum += (1.0/ list[i]);
        }
        System.out.println("Harmonic Avarage : " + list.length / sum);

    }
}