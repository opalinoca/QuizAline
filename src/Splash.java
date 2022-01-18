import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Splash extends JFrame {
	

	private JPanel contentPane;
	JProgressBar barra;
	JLabel texto;
	JLabel percent;		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Splash() {
		setTitle("Carregando");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 barra = new JProgressBar();
		 barra.setForeground(new Color(255, 215, 0));
		barra.setBounds(72, 154, 537, 66);
		contentPane.add(barra);
		
		 texto = new JLabel("New label");
		 texto.setForeground(new Color(0, 0, 0));
		 texto.setBackground(new Color(255, 255, 255));
		 texto.setFont(new Font("Tahoma", Font.BOLD, 18));
		texto.setBounds(213, 272, 353, 54);
		contentPane.add(texto);
		
		 percent = new JLabel("New label");
		 percent.setFont(new Font("Tahoma", Font.BOLD, 15));
		percent.setBounds(301, 231, 77, 45);
		contentPane.add(percent);
		
		
		new Thread(new carregar()).start();
		
	}
	
				//implementar a Thread //
				//criar o metodo para percorrer de 0 á 100//
				public class carregar implements Runnable{
				//metodo para percorrer a barra de progresso//
				public void run (){
					
					//laço de repetição para percorrer progresso//
					for ( int i =0 ; i < 101 ; i ++ ) {
						
						try {
							/* Método Sleep em milisegundos– Tempo de Vida da Thread */
							Thread.sleep(100) ;
							
							/* Chamar a progressive Bar e adicionar o contador para
							* ir de 1 até 100. ( variavel do contador) */

							 barra.setValue(i);
							 
							 if (barra.getValue() <= 50 ) {
							 
							 /* Setar Mensagem do JLABEL de acordo com progressive Bar */
							 texto.setText("Carregando informações...");
							 percent.setText(i + "%");
							 }
							 else if (barra.getValue() <= 70 )
							 {
							 /* Setar Mensagem do JLABEL de acordo com progressive Bar */
							 texto.setText("Carregando as telas...");
							 percent.setText(i + "%");
							 }
							 else if (barra.getValue() <= 99 ) {
							 
							 /* Setar Mensagem do JLABEL de acordo com progressive Bar */
							 texto.setText("Carregando o quiz...");
							 percent.setText(i + "%") 	;
							 }
							 else{
								 
							 /* Setar Mensagem do JLABEL de acordo com progressive Bar */
							 texto.setText("Inicializando o quiz...");
							 percent.setText(i + "%");
						}
							 
					}
							 //cath -- Tratamento de erro//
							 catch (Exception erro) {

							  JOptionPane.showMessageDialog(null,erro);
							 } 
							 
						}

						 //chamar proxima tela apos as 2 chaves do catch//
						Pergunta1 tela= new Pergunta1();//constroi a tela//
						Splash.this.dispose();//fecha a tela atual//
						tela.setVisible(true);//deixa visivel*/
						}
					}
				}
