import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Pergunta3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta3 frame = new Pergunta3();
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
	public Pergunta3() {
		setResizable(false);
		setTitle("Pergunta 3 - Elite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rsp1Errada = new JRadioButton("Nano");
		rsp1Errada.setBackground(new Color(255, 255, 255));
		rsp1Errada.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonGroup.add(rsp1Errada);
		rsp1Errada.setBounds(17, 110, 222, 59);
		contentPane.add(rsp1Errada);
		
		JRadioButton rsp2Errada = new JRadioButton("Guzman");
		rsp2Errada.setBackground(new Color(255, 255, 255));
		rsp2Errada.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonGroup.add(rsp2Errada);
		rsp2Errada.setBounds(17, 162, 230, 59);
		contentPane.add(rsp2Errada);
		
		JRadioButton rsp3Errada = new JRadioButton("Carla");
		rsp3Errada.setBackground(new Color(255, 255, 255));
		rsp3Errada.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonGroup.add(rsp3Errada);
		rsp3Errada.setBounds(17, 215, 230, 59);
		contentPane.add(rsp3Errada);
		
		JRadioButton rspCerta = new JRadioButton("Polo");
		rspCerta.setBackground(new Color(255, 255, 255));
		rspCerta.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonGroup.add(rspCerta);
		rspCerta.setBounds(17, 266, 230, 59);
		contentPane.add(rspCerta);
		
		JLabel lblNewLabel = new JLabel("Quem matou Marina?");
		lblNewLabel.setBackground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(114, 11, 365, 59);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pergunta2 tela = new Pergunta2();
				Pergunta3.this.dispose();
				tela.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 215, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(114, 351, 160, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Pr\u00F3ximo");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pontos p = new Pontos();
				
				if(!rspCerta.isSelected() && !rsp1Errada.isSelected() && !rsp2Errada.isSelected() && !rsp3Errada.isSelected()) {
					JOptionPane.showMessageDialog(null, "Oooops, nenhuma opção foi selecionada.");	
				}
				else {
					if(rspCerta.isSelected())
					{
						p.Acerto++;
					}else {
						p.Erro++;
					}
				}
				
				Pergunta4 tela = new Pergunta4();
				Pergunta3.this.dispose();
				tela.setVisible(true);
			}
		});
		btnNewButton_1_1.setBackground(new Color(255, 215, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(327, 351, 160, 42);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pergunta3.class.getResource("/img/elite.jpg")));
		lblNewLabel_1.setBounds(409, 11, 263, 362);
		contentPane.add(lblNewLabel_1);
	}
}


