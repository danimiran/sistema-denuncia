import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastraDenuncia extends Tela {
	
	JLabel lblDesc, lblTipo, lblRua, lblBairro, lblCidade, lblEstado,  imgLogo, lblTitulo;
	JTextField txtDesc, txtTipo, txtRua, txtBairro, txtCidade, txtEstado;
	JButton btEnviar;

	public static void main(String[] args) {
		
        Login TelaLogin = new Login();
		
		TelaLogin.show();

	}
	
	public CadastraDenuncia() {
		super("Sistema de Denúncia", new Dimension(1000, 800));
		
		lblTitulo = new JLabel();
		lblTitulo.setLocation(100, 60);
		lblTitulo.setText("Cadastrar Denúncia");
		lblTitulo.setSize(600, 50);
		lblTitulo.setForeground(Color.gray);
		lblTitulo.setFont(new Font("Arial", 1, 25));
		getContentPane().add(lblTitulo);
		
		lblTipo = new JLabel();
		lblTipo.setText("Tipo de Denúncia: ");
		lblTipo.setSize(200, 30);
		lblTipo.setLocation(100,150);
		lblTipo.setFont(new Font("Arial", 1, 12));
		getContentPane().add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setText("");
		txtTipo.setSize(350, 30);
		txtTipo.setLocation(100,200);
		getContentPane().add(txtTipo);
		
		lblRua = new JLabel();
		lblRua.setText("Tipo de denúncia: ");
		lblRua.setSize(200, 30);
		lblRua.setLocation(300,150);
		lblRua.setFont(new Font("Arial", 1, 12));
		getContentPane().add(lblRua);
		
		txtRua = new JTextField();
		txtRua.setText("");
		txtRua.setSize(600, 30);
		txtRua.setLocation(300,200);
		getContentPane().add(txtRua);
		
		lblBairro = new JLabel();
		lblBairro.setText("Senha: ");
		lblBairro.setSize(200, 30);
		lblBairro.setLocation(350,360);
		lblBairro.setFont(new Font("Arial", 1, 12));
		getContentPane().add(lblBairro);
		
		txtCidade = new JTextField();
		txtCidade.setText("");
		txtCidade.setSize(350, 30);
		txtCidade.setLocation(350,390);
		getContentPane().add(txtCidade);
		
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
