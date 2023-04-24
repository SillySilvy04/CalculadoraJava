import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelTexto  extends JPanel
{
	private static final int TAMANHO_TEXTO = 15;
	
	private JTextField txtNumero;
	
	
	public PainelTexto()
	{
		setLayout(new FlowLayout());
		
		txtNumero = new JTextField(TAMANHO_TEXTO);
		txtNumero.setHorizontalAlignment(JTextField.RIGHT);
		txtNumero.setEnabled(false);
		add(txtNumero);
	}
	
	public JTextField getTxtNumero() 
	{
		return txtNumero;
	}
}
