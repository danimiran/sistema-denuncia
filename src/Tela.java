import javax.swing.*;
import java.awt.*;


public class Tela extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public Tela() {
		setTitle("Sistema Denúncia");
		setSize(300,300);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Para ele não fechar a outra janela / EXT - FECHA TUDO
	
	}
	
	public Tela(String titulo, Dimension tamanho) {
		setTitle(titulo);
		setSize(tamanho);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Para ele não fechar a outra janela / EXT - FECHA TUDO
	
	}

}
