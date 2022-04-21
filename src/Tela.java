import javax.swing.*;
import java.awt.*;
import java.net.URL;


public class Tela extends JFrame {
	
	URL url = this.getClass().getResource("Icone.png");
	Image logo = Toolkit.getDefaultToolkit().getImage(url);

	public static void main(String[] args) {	

	}
	
	
	public Tela() {
		setTitle("Sistema de Denúncia");
		setSize(300,300);
		getContentPane().setLayout(null);
		
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	}
	
	public Tela(String titulo, Dimension tamanho) {
		setTitle(titulo);
		setSize(tamanho);
		setIconImage(logo);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	}

}
