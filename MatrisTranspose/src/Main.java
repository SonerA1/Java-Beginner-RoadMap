public class Main {
    public static void main(String[] args) {
        /*
        Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
        Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
        Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir).
        Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun.
        Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.
        Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.
        Github : SonerA1
        Matris :
        2    3    4
        5    6    4
        Transpoze :
        2    5
        3    6
        4    4
         */
        int[][] matris = {{2, 3, 4},{5, 6, 4}};

        int[][] transpose = new int[matris[0].length][matris.length];
        System.out.println("Matris : ");

        for (int i = 0; i< matris.length; i++){
            for (int j = 0; j< matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose : ");
        for (int i = 0; i<transpose.length; i++){
            for (int j = 0; j<transpose[i].length; j++){
                transpose[i][j] = matris[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

}