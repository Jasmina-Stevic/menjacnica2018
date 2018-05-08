package menjacnica.sistemskeOperacije;

import java.util.LinkedList;

import menjacnica.Valuta;

public class SOobrisiValutu {

	public static void izvrsi(Valuta valuta, LinkedList<Valuta> kursnaLista) {
		if (valuta==null)
			throw new RuntimeException("Valuta ne sme biti null");
		
		if (!kursnaLista.contains(valuta))
			throw new RuntimeException("Valuta se ne nalazi u kursnoj listi");
		
		kursnaLista.remove(valuta);		
	}	
	
}
