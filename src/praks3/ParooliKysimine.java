package praks3;

import lib.TextIO;

public class ParooliKysimine {

	public static void main(String[] args) {
		
		// string on klass, objektil on olemas meetodid
		// oigeParool.equals()
		int sisestusteArv = 0;
        while (true) {      
            String parool = "saladus";
            System.out.println("Sisesta parool");
            String kasutajaSisestus = TextIO.getlnString();
            
            if (parool.equals(kasutajaSisestus)) {
                System.out.println("Õige parool");
                break;
            } else {
                System.out.println("Vale parool");
                sisestusteArv = sisestusteArv + 1; 
            }
            
            if (sisestusteArv >= 3) {
                System.out.println("Sisestasid kolm korda vale parooli, aitab küll!");
                break;
            }
        }
	}

}
