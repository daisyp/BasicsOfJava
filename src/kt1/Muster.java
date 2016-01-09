package kt1;

//Koostage Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse n korda n täisarvumaatriksi,
//mille iga elemendi väärtuseks on selle elemendi reaindeksi ja veeruindeksi summa ruut (indeksid algavad nullist).
//
//   public static int[][] muster (int n)

public class Muster {
    public static void main(String[] args){

        int[][] maatriks = muster(6);

        //printimine
        for(int[] row : maatriks){
            for(int col : row){
                System.out.printf("%3d ", col);
            }
            System.out.println();
        }

    }

    public static int[][] muster (int n){
        int[][] maatriks = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                maatriks[i][j] = (int) Math.pow(i + j, 2);
            }
        }

        return  maatriks;
    }
}
