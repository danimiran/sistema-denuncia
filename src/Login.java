import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Tela {
	
	ImageIcon Logo = new ImageIcon(getClass().getResource("Logo.png"));
	
	JLabel lblEmail, lblSenha, imgLogo, lblTitulo;
	JTextField txtEmail, txtSenha;
	JButton btEnviar;

	public static void main(String[] args) {
		
        Login TelaLogin = new Login();
		
		TelaLogin.show();

	}
	
	public Login() {
		super("Sistema de Denúncia", new Dimension(1000, 800));
		
		imgLogo = new JLabel(Logo);
		imgLogo.setSize(400,125);
		imgLogo.setLocation(340,100);
		getContentPane().add(imgLogo);
		
		lblTitulo = new JLabel();
		lblTitulo.setText("Faça o Login para continuar");
		lblTitulo.setSize(600, 50);
		lblTitulo.setLocation(450,220);
		lblTitulo.setFont(new Font("Arial", 1, 14));
		lblTitulo.setForeground(Color.gray);
		getContentPane().add(lblTitulo);
		
		lblEmail = new JLabel();
		lblEmail.setText("Email: ");
		lblEmail.setSize(200, 30);
		lblEmail.setLocation(350,290);
		lblEmail.setFont(new Font("Arial", 1, 12));
		getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setText("");
		txtEmail.setSize(350, 30);
		txtEmail.setLocation(350,320);
		getContentPane().add(txtEmail);
		
		lblSenha = new JLabel();
		lblSenha.setText("Senha: ");
		lblSenha.setSize(200, 30);
		lblSenha.setLocation(350,360);
		lblSenha.setFont(new Font("Arial", 1, 12));
		getContentPane().add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setText("");
		txtSenha.setSize(350, 30);
		txtSenha.setLocation(350,390);
		getContentPane().add(txtSenha);
		
		btEnviar = new JButton();
		btEnviar.setText("Entrar");
		btEnviar.setSize(350, 30);
		btEnviar.setLocation(350,440);
		btEnviar.setBackground(new Color(74, 201, 218));
		btEnviar.setForeground(Color.white);
		btEnviar.setFont(new Font("Arial", 1, 14));
		getContentPane().add(btEnviar);
		
		
	}

}
