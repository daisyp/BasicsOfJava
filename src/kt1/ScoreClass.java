package kt1;

//Sportlase punktisumma arvutatakse üksikkatsetest saadud punktide summana, millest on maha võetud kahe
//halvima katse tulemused (üksikkatseid on rohkem kui kaks). Kirjutada Java meetod, mis arvutab punktisumma
//üksikkatsete tulemuste massiivi põhjal. Parameetriks olevat massiivi muuta ei tohi.
//
//   public static int score (int[] points)

public class ScoreClass {
    public static void main(String[] args){
        int[] scoreMarix = new int[]{3,6,2,8,4};
        int score = score(scoreMarix);
        System.out.println(score);

    }

    public static int score (int[] points){
        int score = 0;
        int min1 = Integer.MAX_VALUE;
        int min1Index = 0;
        int min2 = Integer.MAX_VALUE;
        //kui on vähem kui 3 katset ja kahe halvima tulemused eemaldatakse, on tulemus null
        if(points.length < 3){
            return 0;
        }
        else{
            //leian miinimumtulemuse1
            for(int i = 0; i < points.length; i++){
                if(points[i] < min1){
                    min1 = points[i];
                    min1Index = i;
                }
            }
            for (int i = 0; i < points.length; i++){
                if (points[i] < min2 && i != min1Index){
                    min2 = points[i];
                }
            }
            //arvutan punktide tulemuse, vältides kahte miinimumpunkti
            for(int element : points){
                if (element != min1 && element != min2){
                    score += element;
                }
            }
            System.out.println(min1 + " " + min2);
            return score;
        }
    }
}
