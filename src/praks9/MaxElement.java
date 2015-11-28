package praks9;

public class MaxElement {
	public static void main(String[] args){
        int[] massiiv = {1, 3, 6, 7, 8, 3, 5, 7, 21, 3};
        System.out.println("Maksimaalne väärtus on " + maxValue(massiiv));
    }

    public static int maxValue(int[] massiiv){
        int max = Integer.MIN_VALUE;
        for(int el : massiiv){
            if(el > max){
                max = el;
            }
        }
        return max;
    }
}
