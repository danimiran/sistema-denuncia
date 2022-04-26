import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usuario extends Tela{

	JTable tabUsuario;
	JScrollPane scrlTab;
	JLabel lblTitulo;
	
	String data[][]={ 
			          {"01","Rafaela Silva", "rafaela@email.com", "comum", "Ativo" },    
			          {"02","Gabriel Souza", "gabriel@email.com", "comum", "Ativo" },   
			          {"03","Daniela Miranda", "daniela@email.com", "Administrador", "Ativo" },   
			          {"04","Diego", "diego@email.com", "comum", "Ativo" },   
			          {"05","Maria Carla", "maria@email.com", "comum", "Ativo" },   
			          {"06","Bianca Santos", "bianca@email.com", "comum", "Ativo" },   
			          {"07","Pedro Cruz", "  pedro@email.com", "comum", "Ativo" },   
                      
                    };    
    String column[]= {"ID"," Nome", "Email", "tipoAcesso", "Status" 
       }; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Usuario() {
		super("Sistema de Denúncia", new Dimension(1000, 800));
		       
		lblTitulo = new JLabel();
		lblTitulo.setLocation(100, 60);
		lblTitulo.setText("Usuários");
		lblTitulo.setSize(600, 50);
		lblTitulo.setForeground(Color.gray);
		lblTitulo.setFont(new Font("Arial", 1, 25));
		getContentPane().add(lblTitulo);
		
	    tabUsuario= new JTable(data,column);    
	    tabUsuario.setBounds(30,40,200,300);
	    tabUsuario.getTableHeader().setOpaque(false);
	    tabUsuario.getTableHeader().setBackground(Color.gray);
	    tabUsuario.getTableHeader().setForeground(Color.white);
	    scrlTab = new JScrollPane(tabUsuario);             
	    scrlTab.setSize(850,200);
	    scrlTab.setLocation(100, 200);
	    
	    getContentPane().add(scrlTab);
	}

}
