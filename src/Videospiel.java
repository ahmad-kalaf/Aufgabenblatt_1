/**
 * Ein {@link Videospiel} ist ein Medium. Zusätzlich zu den Eigenschaften eines
 * {@link Medium}s erfasst es das System auf dem das Videospiel lauffähig ist.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2024
 */
public class Videospiel implements Medium
{
	/**
	 * Der Titel des Videospiels
	 */
	private String _titel;
	/**
	 * Ein Kommentar zum Videospiel
	 */
	private String _kommentar;
	/**
	 * Das System auf dem das Videospiel gespielt werden kann
	 */
	private String _system;

	/**
	 * Initialisiert ein neues Videospiel mit den gegebenen Daten.
	 * 
	 * @param titel
	 * @param kommentar
	 * 
	 * @require titel != null
	 * @require kommentar != null
	 * @require system != null
	 * 
	 * @ensure getTitel() == titel
	 * @ensure getKommentar() == kommentar
	 * @ensure getSystem() == system
	 */
	public Videospiel(String titel, String kommentar, String system)
	{
		assert titel != null : "Vorbedingung verletzt: titel != null";
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		assert system != null : "Vorbedingung verletzt: system != null";
		_titel = titel;
		_kommentar = kommentar;
		_system = system;
	}

	@Override
	public String getKommentar()
	{
		return _kommentar;
	}

	@Override
	public String getMedienBezeichnung()
	{
		return "Videospiel";
	}

	@Override
	public String getTitel()
	{
		return _titel;
	}

	/**
	 * Gibt das System, auf dem das Videospiel lauffähig ist.
	 * 
	 * @return result System, auf dem das Videospiel lauffähig ist
	 * 
	 * @ensure result != null
	 */
	public String getSystem()
	{
		return _system;
	}

	@Override
	public String getFormatiertenString()
	{
		String text = getMedienBezeichnung() + ": " + getTitel() + "\n"
				+ "Lauffähig auf: " + getSystem() + "\n" + "Kommentar: "
				+ getKommentar();
		return text;
	}
}
