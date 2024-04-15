import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class VideospielTest
{
	private final String KOMMENTAR = "Kommentar";
	private final String TITEL = "Titel";
	private final String BEZEICHNUNG = "Videospiel";
	private final String SYSTEM = "Playstation 4";
	private Videospiel _videospiel1;
	private Videospiel _videospiel2;

	public VideospielTest()
	{
		_videospiel1 = new Videospiel(TITEL, KOMMENTAR, SYSTEM);
		_videospiel2 = new Videospiel(TITEL, KOMMENTAR, SYSTEM);
	}

	@Test
	public void testKonstruktor()
	{
		assertEquals(TITEL, _videospiel1.getTitel());
		assertEquals(KOMMENTAR, _videospiel1.getKommentar());
		assertEquals(SYSTEM, _videospiel1.getSystem());
	}

	@Test
	public void testGetMedienBezeichnung()
	{
		String bezeichnung = BEZEICHNUNG;
		assertEquals(bezeichnung, _videospiel1.getMedienBezeichnung());
	}

	@Test
	public void testEquals()
	{
		assertFalse("Mehrere Exemplare des gleichen Videospiels sind ungleich",
				_videospiel1.equals(_videospiel2));
		assertTrue("Dasselbe Exemplar des gleichen Videospiels ist gleich",
				_videospiel1.equals(_videospiel1));
	}

	@Test
	public void testGetFormatiertenString()
	{
		assertTrue("Formatierter String enthält Medienbezeichnung",
				_videospiel1.getFormatiertenString().contains(BEZEICHNUNG));
		assertTrue("Formatierter String enthält TITEL",
				_videospiel1.getFormatiertenString().contains(TITEL));
		assertTrue("Formatierter String enthält SYSTEM",
				_videospiel1.getFormatiertenString().contains(SYSTEM));
		assertTrue("Formatierter String enthält KOMMENTAR",
				_videospiel1.getFormatiertenString().contains(KOMMENTAR));
	}
}
