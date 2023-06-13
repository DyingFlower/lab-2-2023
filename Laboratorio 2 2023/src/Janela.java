
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	public Label label;
	public Painel painel1;
	public PainelC painel2= new PainelC();
	public BotãoC botao;
	public BotãoL botao2;
	public BotãoA botao3;
	public BotãoD botao4;
	public Janela() {
		painel1 = new Painel();
		setLayout(new BorderLayout(2,1));
		setSize(1000,600);
		add(painel1,BorderLayout.NORTH);
		add(painel2,BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public class BotãoC extends JButton implements ActionListener{
		public String cor; 
		public String texto;
		public Painel painel;
		public BotãoC(String texto) {
			this.texto=texto;
			setBackground(Color.white);
			setSize(200,300);
			setVisible(true);
			setText(texto);
			
		}
		public void actionPerformed(ActionEvent e) {
			painel2.setVisible(true);
		}
	}
	public class BotãoA extends JButton implements ActionListener{
		public String cor; 
		public String texto;
		public BotãoA(String texto) {
			this.texto=texto;
			setBackground(Color.white);
			setSize(200,300);
			setVisible(true);
			setText(texto);
			
		}
		public void actionPerformed(ActionEvent e) {
			painel2.setVisible(true);
		}
	}
	public class BotãoD  extends JButton implements ActionListener{
		public String cor; 
		public String texto;
		public BotãoD(String texto) {
			this.texto=texto;
			setBackground(Color.white);
			setSize(200,300);
			setVisible(true);
			setText(texto);
			
		}
		public void actionPerformed(ActionEvent e) {
			painel2.setVisible(true);
		}
	}
		public class BotãoL extends JButton implements ActionListener{
			public String cor; 
			public String texto;
			public Painel painel;
			public PainelC painelL;
			public BotãoL(String texto) {
				this.texto=texto;
				setBackground(Color.white);
				setSize(200,300);
				setVisible(true);
				setText(texto);
				
			}
			public void actionPerformed(ActionEvent e) {
				painelL.setVisible(true);
			}
		}

	public class Painel extends JPanel{
		public BotãoC botao1= new BotãoC("Cadastrar");
		public BotãoL botao2= new BotãoL("Listar");
		public BotãoA botao3=new BotãoA("Atualizar");
		public BotãoD botao4= new BotãoD("Deletar");
		public Painel() {
			add(botao1);
			add(botao2);
			add(botao3);
			add(botao4);
			setBackground(Color.GRAY);
			setVisible(true);
		}
	}
	public class Cadastrar extends JButton implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
		}

	}
	public class PainelC extends JPanel{
		public Label label;
		public Label label1;
		public Label label2;
		public Label label3;
		public Label label4; 
		public PainelC() {
				Cliente cliente =new Cliente();
				setLayout(new GridLayout(4,3));
				label1 = new Label("Nome");
				add(label1);
				JTextField caixa1= new JTextField(6);
				add(caixa1);
				cliente.nome=caixa1.getText();
				label2 = new Label("Cpf");
				add(label2);
				JTextField caixa2= new JTextField(6);
				add(caixa2);
				cliente.cpf=caixa2.getText();
				label3 = new Label("Matricula");
				add(label3);
				JTextField caixa3= new JTextField(6);
				add(caixa3);
				cliente.matricula=caixa3.getText();
				label4 = new Label("Vertente");
				add(label4);
				JTextField caixa4= new JTextField(6);
				add(caixa4);
				cliente.vertente=caixa4.getText();
				Cadastrar cadastrar= new Cadastrar();
				cadastrar.setText("Cadastrar");
				setBackground(Color.LIGHT_GRAY);
				setVisible(false);
		}
	}
	public class PainelL {
		Label label;
	}

}

