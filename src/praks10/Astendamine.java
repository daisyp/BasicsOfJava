package praks10;

public class Astendamine {
	 public static void main(String[] args){

	        System.out.println(astenda(5,3));
	    }

	    public static int astenda(int arv, int aste){
	        if (aste != 0){
	            return arv * astenda(arv, aste - 1);
	        }else{
	            return arv;
	        }
	    }
}
