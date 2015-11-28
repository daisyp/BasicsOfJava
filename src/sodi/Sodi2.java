package sodi;

public class Sodi2 {

	public static void main(String[] args) {
						// indexid massiivis:   0,1,2,3,4,5,6 
		System.out.println(nullideArv(new int[]{1,3,0,5,0,6,0}));

	}
	
	public static int nullideArv(int[] m){
		int nullideHulk = 0; // hoiab endas arvu kui palju on massiivis nulle
		
		for(int i = 0; i < m.length; i++){ // kui on null siis lisab nullile ühe juurde 
			if(m[i] == 0){ // kas massiivi m i elemnt on null
				nullideHulk++;
			}
		}
		// tagastan main meetodisse nullide hulga
		return nullideHulk;
	}
	// public static int nullideArv2(int[] m){
	//  int nullideHulk = 0;
		
		// for(int element : m){ [ tsükli sees kasutatav muutuja + koolon + massiivi nimi ]
			// if(element == 0){
				// nullideHulk++;
}
