import java.awt.Color;

import javax.swing.JLabel;

public class Label extends JLabel{
	public String texto;
	public Label(String texto) {
		this.texto=texto;
		setText(texto);
		setBackground(Color.cyan);
		setVisible(true);
	}
}
