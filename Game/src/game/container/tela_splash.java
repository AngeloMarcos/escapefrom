package game.container;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class tela_splash {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_splash window = new tela_splash();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela_splash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 450, 300);
		frame.setSize(1024, 768);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//background
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\\u00C1rea de Trabalho\\Projeto\\834435-lindo-espaco-fundo-vetor.jpg"));
		lblNewLabel.setBounds(0, 0, 1020, 740);
		frame.setSize(1024, 768);
		frame.getContentPane().add(lblNewLabel);
	}
}
