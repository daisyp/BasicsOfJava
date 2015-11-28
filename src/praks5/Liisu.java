package praks5;

public class Liisu {

	public static void main(String[] args) {
		System.out.println("liisu");
		System.out.print("Sisesta inimeste arv: ");
		int inimesteArv = lib.TextIO.getlnInt();
		System.out.println("Liisu on "+valiLiisu(inimesteArv));
	}
	
	public static int valiLiisu(int inimesteArv) {
		int liisu = Metodid.randomRange(1, inimesteArv);
		return liisu;

	}

}
