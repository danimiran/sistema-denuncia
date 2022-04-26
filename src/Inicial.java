import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicial extends Tela implements ActionListener {
	
	JPanel lblCard;
	JButton btDash, btCadDenuncia, btDenuncia, btUsuarios;
	JLabel lblTitulo;
	
	
	
	public static void main(String[] args) {
		
		Inicial TelaInicial = new Inicial();
		TelaInicial.show();

	}
	
	public Inicial() {
		super("Sistema de Denúncia", new Dimension(1000, 800));
		
		lblTitulo = new JLabel();
		lblTitulo.setLocation(100, 60);
		lblTitulo.setText("Inicio");
		lblTitulo.setSize(600, 50);
		lblTitulo.setForeground(Color.gray);
		lblTitulo.setFont(new Font("Arial", 1, 25));
		getContentPane().add(lblTitulo);
		
		btDash = new JButton("Dashboard");
		btDash.setSize(400, 200);
		btDash.setBackground(new Color(74, 222, 218));
		btDash.setLocation(0, 0);
		btDash.setForeground(Color.white);
		btDash.setFont(new Font("Arial", 1, 20));
		
		btCadDenuncia = new JButton("Cadastra Denúncia");
		btCadDenuncia.setSize(400, 200);
		btCadDenuncia.setLocation(0, 200);
		btCadDenuncia.setBackground(new Color(74, 222, 218));
		btCadDenuncia.setForeground(Color.white);
		btCadDenuncia.setFont(new Font("Arial", 1, 20));
		
		btDenuncia = new JButton("Denúncias");
		btDenuncia.setSize(400, 200);
		btDenuncia.setLocation(400, 0);
		btDenuncia.setBackground(new Color(74, 222, 218));
		btDenuncia.setForeground(Color.white);
		btDenuncia.setFont(new Font("Arial", 1, 20));
		
		btUsuarios = new JButton("Usuários");
		btUsuarios.setSize(450, 200);
		btUsuarios.setLocation(400, 200);
		btUsuarios.setBackground(new Color(74, 222, 218));
		btUsuarios.setForeground(Color.white);
		btUsuarios.setFont(new Font("Arial", 1, 20));
		
		lblCard = new JPanel(new LayoutManager() {
			
			@Override
			public void removeLayoutComponent(Component comp) {
				
			}
			
			@Override
			public Dimension preferredLayoutSize(Container parent) {
				return null;
			}
			
			@Override
			public Dimension minimumLayoutSize(Container parent) {
				return null;
			}
			
			@Override
			public void layoutContainer(Container parent) {
				
			}
			
			@Override
			public void addLayoutComponent(String name, Component comp) {
				
			}
		});
		
		lblCard.setSize(800, 400);
		lblCard.setLocation(100,200);
		lblCard.add(btDash);
		lblCard.add(btCadDenuncia);
		lblCard.add(btDenuncia);
		lblCard.add(btUsuarios);
		getContentPane().add(lblCard);
		
		
		
		btDash.addActionListener(this);
		btCadDenuncia.addActionListener(this);
		btDenuncia.addActionListener(this);
		btUsuarios.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if( evento.getSource() == btDash) {
			Dashboard dash = new Dashboard();
			dash.show();
		}
		if(evento.getSource() == btDenuncia) {
			Denuncias dash = new Denuncias();
			dash.show();
		}
		if(evento.getSource() == btUsuarios) {
			Usuario dash = new Usuario();
			dash.show();
		}
		
		if(evento.getSource() == btCadDenuncia) {
			CadastraDenuncia dash = new CadastraDenuncia();
			dash.show();
		}
		
	}

}
