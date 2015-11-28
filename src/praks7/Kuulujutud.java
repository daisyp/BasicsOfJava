package praks7;

public class Kuulujutud {

	public static void main(String[] args) {
		String [] naistenimed = {"Mari", "Margot", "Helen", "Lolita"};
		String [] meestenimed = {"Joonas", "Mart", "Kustav", "Kait"};
		String [] tegus6nad = {"käisid", "jooksid", "laulsid", "imetlesid"};

		String naisenimi = naistenimed[praks5.Metodid.randomRange(0, naistenimed.length-1)];
		String mehenimi = meestenimed[praks5.Metodid.randomRange(0, meestenimed.length-1)];
		String tegus6na = tegus6nad[praks5.Metodid.randomRange(0, tegus6nad.length-1)];
		
		System.out.printf("%s ja %s %s.", naisenimi, mehenimi, tegus6na);
	}

}
