package praks9;

public class MaxElement2 {
	public static void main(String[] args){
        int[][] neo = {
                {1, 3, 6, 7},
                {2, 3, 3, 1},
                {17, 4, 5, 0},
                {-20, 13, 16, 17}
        };
        System.out.println(maxValue(neo));
    }

    public static int maxValue(int[][] massiiv){
        int max = 0;
        for (int[] mas : massiiv){
            int value = MaxElement.maxValue(mas);
            if (value > max){
                max = value;
            }
        }
        return max;
    }
}
