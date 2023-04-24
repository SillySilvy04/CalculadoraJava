
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelOperacoes extends JPanel implements ActionListener
{
	private JTextField txtTexto;
	
	private char operador;
	private double valor1;
	private double valor2;
	
	private JButton btaoMais;
	private JButton btaoMenos;
	private JButton btaoVezes;
	private JButton btaoDivisao;
	private JButton btaoIgual;
	private JButton btaoLimpar;
	
	public PainelOperacoes(JTextField txtTexto)
	{
		this.txtTexto = txtTexto;
		
		setLayout(new GridLayout(3,2));
		
		btaoMais = new JButton("+");
		btaoMais.addActionListener(this);
		add(btaoMais);
		
		btaoMenos = new JButton("-");
		btaoMenos.addActionListener(this);
		add(btaoMenos);
		
		btaoVezes = new JButton("*");
		btaoVezes.addActionListener(this);
		add(btaoVezes);
		
		btaoDivisao = new JButton("/");
		btaoDivisao.addActionListener(this);
		add(btaoDivisao);
		
		btaoIgual = new JButton("=");
		btaoIgual.addActionListener(this);
		add(btaoIgual);
		
		btaoLimpar = new JButton("C");
		btaoLimpar.addActionListener(this);
		add(btaoLimpar);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(txtTexto.getText().isEmpty())
		{
			return;
		}
		
		JButton btao = (JButton) e.getSource();
		
		if(btao == btaoLimpar)
		{
			operador = '\u0000';
			txtTexto.setText("");
		} 
		else if(btao == btaoIgual)
		{
			valor2=Double.parseDouble(txtTexto.getText());
			
			double resultado = 0.0;
			
			if(operador=='+')
			{
				resultado = valor1+valor2;
			}
			else if(operador=='-')
			{
				resultado = valor1-valor2;
			}
			else if(operador=='*')
			{
				resultado = valor1*valor2;
			}
			else if(operador=='/')
			{
				resultado = valor1/valor2;
			}
			
			txtTexto.setText(String.valueOf(resultado));
			operador = '\u0000';
			valor1 = resultado;
			valor2 = 0;
		}
		else
		{
			operador = btao.getText().charAt(0);
			valor1=Double.parseDouble(txtTexto.getText());
			txtTexto.setText("");
		}
	}
}
