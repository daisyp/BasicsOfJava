package kt1;

public class NullideArv {

	public static void main(String[] args) {
		System.out.println(nullideArv(new int[]{1,3,0,5,0,6,0}));

	}
	public static int nullideArv(int[] m){
		int nullideHulk = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == 0) {
				nullideHulk++;
			}
		}
		return nullideHulk;
	}
}
