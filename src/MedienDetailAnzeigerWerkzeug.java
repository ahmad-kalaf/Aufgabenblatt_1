import java.util.List;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2024
 */
class MedienDetailAnzeigerWerkzeug
{
	private MedienDetailAnzeigerUI _ui;

	/**
	 * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
	 */
	public MedienDetailAnzeigerWerkzeug()
	{
		_ui = new MedienDetailAnzeigerUI();
	}

	/**
	 * Setzt die Liste der Medien deren Details angezeigt werden sollen.
	 * 
	 * @param medien Eine Liste von Medien.
	 * 
	 * @require (medien != null)
	 */
//	public void setMedien(List<Medium> medien)
//	{
//		assert medien != null : "Vorbedingung verletzt: (medien != null)";
//		TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//		String text = "";
//		for(Medium m : medien)
//		{
//			if(m instanceof CD)
//			{
//				CD cd = (CD) m;
//				text += cd.getFormatiertenString();
//
//			} else if(m instanceof DVD)
//			{
//				DVD dvd = (DVD) m;
//				text += dvd.getFormatiertenString();
//			} else if(m instanceof Videospiel)
//			{
//				Videospiel spiel = (Videospiel) m;
//				text += spiel.getFormatiertenString();
//			}
//		}
//		selectedMedienTextArea.setText(text);
//	}
	public void setMedien(List<Medium> medien)
	{
		assert medien != null : "Vorbedingung verletzt: (medien != null)";
		TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
		String text = "";
		for(Medium m : medien)
		{
			// Wir benötigen hier kein Typtest mehr, da wir ein dynamisch
			// gebundenes Methodenaufruf verwenden. Zur Laufzeit wird je nach
			// dynamische Typ von m die jeweiligie spezifische Methode einer
			// implemendierenden Klasse von Medium aufgerufen.
			text += m.getFormatiertenString() + "\n" + "---------------\n";
		}
		selectedMedienTextArea.setText(text);
	}

	/**
	 * Gibt das Panel dieses Subwerkzeugs zurück.
	 * 
	 * @ensure result != null
	 */
	public Pane getUIPane()
	{
		return _ui.getUIPane();
	}
}
