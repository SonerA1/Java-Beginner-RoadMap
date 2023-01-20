public class Main {
    public static void main(String[] args) {
        /*String [][] letter = new String[6][4];

        for(int i = 0; i < letter.length; i++){
            for (int j = 0; j < letter[i].length; j++){
                if (i == 0 || i == 2){
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                }else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }*/


        String[][] ss = new String[7][4];
        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss[0].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    ss[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    ss[i][j] = " * ";
                } else {
                    ss[i][j] = "   ";
                }
            }
        }
        for (String[] row : ss) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();

        }
    }
}
