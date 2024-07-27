package nl.hva.miw.ooad;

/**
 * 
 * Voorstelling klasse.
 * 
 * Elke voorstelling heeft een unieke id, een Artiest, prijs, adres en datum.
 * De id's worden automatisch gegenereerd.
 * 
 * 
 * @author michel
 *
 */
public class Voorstelling {
	
	private static int next_id = 1000;		// Gebruikt om opeenvolgende id's te genereren.
	
	private int id;
	private Artiest artiest;
	private String adres;
	private String datum;
	private double prijs;

	public Voorstelling(Artiest artiest, String adres, String datum, double prijs) {
		super();
		this.artiest = artiest;
		this.adres = adres;
		this.datum = datum;
		this.prijs = prijs;
		
		this.id = next_id++;
	}

	public int getId() {
		return id;
	}

	public Artiest getArtiest() {
		return artiest;
	}

	public double getPrijs() {
		return prijs;
	}

	public String getAdres() {
		return adres;
	}

	public String getDatum() {
		return datum;
	}
	
	@Override
	public String toString() {
		return "Voorstelling [id=" + id + ", artiest=" + artiest + ", prijs=" + prijs + ", adres=" + adres + ", datum="
				+ datum + "]";
	}
}
