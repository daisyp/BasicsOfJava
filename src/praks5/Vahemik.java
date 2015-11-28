package praks5;

public class Vahemik {

	public static void main(String[] args) {
		int min = 5;
		int max = 8;
		String kysimus = "Sisesta arv vahemikus "+min+" kuni "+max+": ";
		System.out.printf("kasutaja sisestas %d", Metodid.kasutajaSisestus(kysimus, 5, 8));

	}

}
