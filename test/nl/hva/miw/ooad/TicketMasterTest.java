package nl.hva.miw.ooad;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketMasterTest {

	@Test
	public void testKoopTicket() {
		
		TicketMaster tm = new TicketMaster();
		int a_id = tm.registreerArtiest("Artiest", "ArtiestenLaan 100");
		int k_id = tm.registreerKlant("Klant", "Klantenboulevard 22");
		
		int v_id = tm.meldVoorstellingAan(a_id, "Voorsteling1", "1 april 2019", 85);
		int v2_id = tm.meldVoorstellingAan(a_id, "Voorstelling2", "16 juni 2019", 100);
		
		tm.koopTicket(k_id, v_id);
		tm.koopTicket(k_id, v2_id);
		
		assertEquals( 185, tm.totaleKosten(k_id), 0.1 );
	}

}
