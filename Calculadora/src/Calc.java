import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Calc extends JFrame
{
	private static final int LARGURA_JANELA = 350;
	private static final int ALTURA_JANELA = 352;
	
	private static final int HORIZONTE_INICIAL = 400;
	private static final int VERTICAL_INICIAL = 200;
	
	private PainelTexto painelTexto;
	private JPanel painelDigitos;
	

	public Calc() throws Exception
	{
		super("Calculadora");
		
		setLayout(new BorderLayout());
		
		criarPainelTexto();
		
		criarPainelDigitos();
		
		setSize(LARGURA_JANELA,ALTURA_JANELA);
		setLocation(HORIZONTE_INICIAL,VERTICAL_INICIAL);
	}
	
	private void  criarPainelTexto()
	{
		painelTexto = new PainelTexto();
		add(BorderLayout.NORTH, painelTexto);
	}
	
	private void criarPainelDigitos()
	{
		painelDigitos = new JPanel();
		painelDigitos.setLayout(new BorderLayout());
		//cria o painel de numeros
		painelDigitos.add(BorderLayout.CENTER, new PainelNumeros(painelTexto.getTxtNumero()));
		//cria o painel de operações
		painelDigitos.add(BorderLayout.EAST, new PainelOperacoes(painelTexto.getTxtNumero()));
		
		add(BorderLayout.CENTER, painelDigitos);
	}
	
	public static void main(String[] args) throws Exception 
	{
		Calc calculadora = new Calc();
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		calculadora.setVisible(true);
	}
	
}
