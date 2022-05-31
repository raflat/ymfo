package dirchooser;

import java.awt.Color;

import javax.swing.JLabel;

final class Label extends JLabel implements Configurable {

	private static final long serialVersionUID = 1L;

	static Label withText(String text) {
		return new Label(text);
	}

	@Override
	public void configure(CIni iniFile) {
		setForeground(Color.decode(iniFile.readFrom("Label", "TextColor")));		
	}
	
	private Label(String text) {
		super(text);
	}

}
