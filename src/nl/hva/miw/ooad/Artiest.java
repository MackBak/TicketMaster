package nl.hva.miw.ooad;

/**
 * Artiest klasse
 * 
 * Artiest heeft een unieke id, een naam en adres.
 * De id's worden automatisch gegenereerd.
 * 
 * @author michel
 *
 */
public class Artiest extends Persoon {
	
	private static int next_id = 1;		// Gebruikt om opeenvolgende id's te genereren.
	
	private int id;

	public Artiest(String naam, String adres) {
		super(naam, adres);
		
		this.id = next_id++;
	}
	
	public int getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "Artiest [id=" + id + "," + super.toString() + "]";
	}
}
