package game.container;

import javax.swing.JButton;
import javax.swing.JFrame;

import game.modelos.Fase;

public class Jogo_Game extends JFrame {

	public Jogo_Game() {
		add(new Fase());
		setTitle("Sun Adventure");
		setSize(1024, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Jogo_Game();

	}

}
