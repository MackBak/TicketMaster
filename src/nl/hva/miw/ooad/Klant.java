package nl.hva.miw.ooad;

import java.util.ArrayList;
import java.util.List;

/**
 * Klant klasse
 * 
 * Klant heeft een unieke id, een naam en adres.
 * De id's worden automatisch gegenereerd.
 * 
 * Verder heeft de klant een lijst van gekochte tickets.
 * 
 * @author michel
 *
 */
public class Klant extends Persoon {
	
	private static int next_id = 1;		// Gebruikt om opeenvolgende id's te genereren.
	
	private int id;
	protected List<Ticket> tickets = new ArrayList<>(); // Welke tickets zijn gekocht door deze klant?

	public Klant(String naam, String adres) {
		super(naam, adres);
		
		this.id = next_id++;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Klant [id=" + id + "," + super.toString() + ", aantal gekochte tickets " + aantalGekochteTickets() + "]";
	}

	/**
	 * Deze klant heeft een ticket gekocht, bewaar het in de lijst.
	 * 
	 * @param ticket
	 */
	public void ticketGekocht( Ticket t ) {
		tickets.add( t );
	}

	protected int aantalGekochteTickets()  {
		return tickets.size();
	}
	
	/**
	 * Retourneert de totale prijs van gekochte voorstellingen voor deze klant.
	 * 
	 * @return
	 */
	public double verschuldigdBedrag() {
		double sum = 0;

		for ( Ticket t : tickets ) {
			sum += t.getVoorstelling().getPrijs();
		}
		
		return sum;
	}
	
	public double gemiddeldeTicketPrijs() {
		return verschuldigdBedrag() / aantalGekochteTickets();
	}
}
