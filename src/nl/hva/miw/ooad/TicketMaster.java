package nl.hva.miw.ooad;

import java.util.HashMap;
import java.util.Map;

public class TicketMaster {
	
	Map<Integer, Artiest> artiesten = new HashMap<>(); 			// geregistreerde artiesten (zoekbaar op id)
	Map<Integer, Klant> klanten = new HashMap<>(); 				// geregistreerde klanten (zoekbaar op id)
	Map<Integer, Voorstelling> voorstellingen = new HashMap<>(); // geregistreerde voorstellingen (zoekbaar op id)

	public TicketMaster() {
	}

	
	/**
	 * Registreer een artiest, retourneert een id
	 * @return
	 */
	public int registreerArtiest( String naam, String adres ) {
		Artiest a = new Artiest(naam, adres);
		int a_id = a.getId();
		
		artiesten.put( a_id, a );
		
		return a_id;
	}

	/**
	 * Registreer een klant, retourneert een id
	 * @return
	 */
	public int registreerKlant( String naam, String adres ) {
		Klant k = new Klant(naam, adres);
		int k_id = k.getId();
		
		klanten.put( k_id, k );
		
		return k_id;
	}
	
	
	/**
	 * Meld een voorstelling aan, retourneert een id van de voorsteling.
	 * 
	 * Retourneert -1 als de artiest niet geregistreerd is.
	 * 
	 * @param a_id - artiest die voorstelling geeft
	 * @param adres
	 * @param datum
	 * @param prijs
	 * @return
	 */
	public int meldVoorstellingAan( int a_id, String adres, String datum, double prijs ) {
		// Opgave 2: Implementeer deze methode

		return 0;
	}
	

	/**
	 * Klant koopt een ticket voor een voorstelling. Voegt ticket toe aan de ticketlijst van verkochte 
	 * voorstellingen.
	 * 
	 * Controleert of voorstelling en klant wel geregistreerd staan.
	 * 
	 * Retourneert de ticket_id, of -1 als voorstelling of klant niet geregistreerd zijn.
	 * 
	 * @param k_id - klant_id
	 * @param v_id - voorstelling_id
	 */
	public int koopTicket( int k_id, int v_id ) {
		// Opgave 3: Implementeer deze methode

		return 0;
	}
	
	/**
	 * Retourneert of klant geregistreerd is.
	 * 
	 * @param k_id
	 * @return
	 */
	private boolean isGeregistreerdKlant( int k_id ) {
		return klanten.containsKey( k_id );
	}

	/**
	 * Retourneert of artiest geregistreerd is.
	 * 
	 * @param a_id
	 * @return
	 */
	private boolean isGeregistreerdArtiest( int a_id ) {
		return artiesten.containsKey( a_id );
	}

	/**
	 * Retourneert of voorstelling geregistreerd is.
	 * 
	 * @param v_id
	 * @return
	 */
	private boolean isGeregistreerdVoorstelling( int v_id ) {
		return voorstellingen.containsKey( v_id );
	}
	
	
	/**
	 * Retourneert totale kosten van een klant. 
	 * 
	 * Retourneert -1 als de klant niet geregistreerd is.
	 * 
	 * @param k_id
	 * @return
	 */
	public double totaleKosten( int k_id ) {
		boolean klantBestaat = isGeregistreerdKlant(k_id);
		
		if ( klantBestaat ) {
			return klanten.get( k_id ).verschuldigdBedrag();
		} else {
			return -1;
		}
	}
}