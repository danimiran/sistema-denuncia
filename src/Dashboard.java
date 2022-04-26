import javax.swing.*;
import java.awt.*;



public class Dashboard extends Tela{
	
	JPanel pnlCard1,pnlCard2, pnlCard3;
	ImageIcon grafico = new ImageIcon(getClass().getResource("grafico1.png"));

	JLabel lblTitulo, imgLogo, lblCard1, lblCard2, lblCard3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Dashboard() {
		super("Sistema de Denúncia", new Dimension(1000, 800));
		
		
		lblTitulo = new JLabel();
		lblTitulo.setLocation(100, 60);
		lblTitulo.setText("Dashboard");
		lblTitulo.setSize(600, 50);
		lblTitulo.setForeground(Color.gray);
		lblTitulo.setFont(new Font("Arial", 1, 25));
		getContentPane().add(lblTitulo);
		
		
		lblCard1 = new JLabel();
		lblCard1.setLocation(30, 10);
		lblCard1.setText("<html><center>   Total de denúncias: <br/> 100</center></html>");
		lblCard1.setSize(600, 100);
		lblCard1.setForeground(Color.white);
		lblCard1.setFont(new Font("Arial", 1, 20));
		
		
		pnlCard1 = new JPanel();
		pnlCard1.setLayout(null);
		pnlCard1.setBackground(new Color(74, 222, 218));
		pnlCard1.setLocation(100, 120);
		pnlCard1.setSize(250, 140);
		pnlCard1.setForeground(Color.white);
		pnlCard1.setFont(new Font("Arial", 1, 20));
		pnlCard1.add(lblCard1);
		getContentPane().add(pnlCard1);
		
		
		lblCard2 = new JLabel();
		lblCard2.setLocation(30, 10);
		lblCard2.setText("<html><center>Denúncias em aberto: <br/> 100</center</html>");
		lblCard2.setSize(600, 100);
		lblCard2.setForeground(Color.white);
		lblCard2.setFont(new Font("Arial", 1, 20));
		
		
		pnlCard2 = new JPanel();
		pnlCard2.setLayout(null);
		pnlCard2.setBackground(new Color(74, 222, 218));
		pnlCard2.setLocation(400, 120);
		pnlCard2.setSize(250, 140);
		pnlCard2.setForeground(Color.white);
		pnlCard2.setFont(new Font("Arial", 1, 20));
		pnlCard2.add(lblCard2);
		getContentPane().add(pnlCard2);

		lblCard3 = new JLabel();
		lblCard3.setLocation(15, 10);
		lblCard3.setText("<html><center>Denúncias solucionadas: <br/> 100</center></html>");
		lblCard3.setSize(600, 100);
		lblCard3.setForeground(Color.white);
		lblCard3.setFont(new Font("Arial", 1, 20));
		
		
		pnlCard3 = new JPanel();
		pnlCard3.setLayout(null);
		pnlCard3.setBackground(new Color(74, 222, 218));
		pnlCard3.setLocation(700, 120);
		pnlCard3.setSize(250, 140);
		pnlCard3.setForeground(Color.white);
		pnlCard3.setFont(new Font("Arial", 1, 20));
		pnlCard3.add(lblCard3);
		getContentPane().add(pnlCard3);
		
		imgLogo = new JLabel(grafico);
		imgLogo.setSize(500,500);
		imgLogo.setLocation(250,250);
		getContentPane().add(imgLogo);

	}

}
