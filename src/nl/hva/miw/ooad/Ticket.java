package nl.hva.miw.ooad;

/**
 * Ticket klasse.
 * 
 * Ticket bestaat uit een unieke id, een klant en een voorstelling.
 * De id's worden automatisch gegenereerd.
 * 
 * @author michel
 *
 */
public class Ticket {
	private static int next_id = 1;		// Gebruikt om opeenvolgende id's te genereren.

	private int id;
	private Klant klant;
	private Voorstelling voorstelling;

	public Ticket(Klant klant, Voorstelling voorstelling) {
		super();
		this.klant = klant;
		this.voorstelling = voorstelling;
		this.id = next_id++;

	}

	public int getId() {
		return id;
	}

	public Klant getKlant() {
		return klant;
	}

	public Voorstelling getVoorstelling() {
		return voorstelling;
	}

	@Override
	public String toString() {
		return "Ticket [klant=" + klant + ", voorstelling=" + voorstelling + "]";
	}
}
