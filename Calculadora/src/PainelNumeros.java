
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelNumeros extends JPanel implements ActionListener
{
	private JTextField txtTexto;
	
	public PainelNumeros(JTextField txtTexto)
	{
		this.txtTexto = txtTexto;
		
		setLayout(new GridLayout(4,3));
		
		JButton btao1 = new JButton("1");
		btao1.addActionListener(this);
		add(btao1);
		
		JButton btao2 = new JButton("2");
		btao2.addActionListener(this);
		add(btao2);
		
		JButton btao3 = new JButton("3");
		btao3.addActionListener(this);
		add(btao3);

		JButton btao4 = new JButton("4");
		btao4.addActionListener(this);
		add(btao4);
		
		JButton btao5 = new JButton("5");
		btao5.addActionListener(this);
		add(btao5);
		
		JButton btao6 = new JButton("6");
		btao6.addActionListener(this);
		add(btao6);
		
		JButton btao7 = new JButton("7");
		btao7.addActionListener(this);
		add(btao7);
		
		JButton btao8 = new JButton("8");
		btao8.addActionListener(this);
		add(btao8);
		
		JButton btao9 = new JButton("9");
		btao9.addActionListener(this);
		add(btao9);
		
		JButton btaoVazio1 = new JButton();
		btaoVazio1.setEnabled(false);
		add(btaoVazio1);
		
		JButton btao0 = new JButton("0");
		btao0.addActionListener(this);
		add(btao0);
		
		JButton btaoVazio2 = new JButton();
		btaoVazio2.setEnabled(false);
		add(btaoVazio2);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(txtTexto.getText().length() >= 10)
		{
			return;
		}
		
		JButton btao = (JButton) e.getSource();
		String numero = btao.getText();
		txtTexto.setText(txtTexto.getText()+numero);
	}
}
