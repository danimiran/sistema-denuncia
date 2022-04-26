import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Denuncias extends Tela{

	JTable tabDenuncia;
	JScrollPane scrlTab;
	JLabel lblTitulo;
	
	String data[][]={ 
			          {"01","Jo�o Victor","Faixas de pedestre sem cor", "Mobilidade", "Em aberto", "21-04-2022","-", "-", "-", "Avenida Maria", "Soberana", "Guarulhos", "SP"},    
                      {"02","Marcia Silva","Sem�foro piscando","Mobilidade", "Solucionado", "21-04-2022","21-04-2022", "Antonio Silva", "J� foi reparado o problema", "Avenida ", "Lavras", "Guarulhos", "SP"},    
                      {"03","Cristina Nunes","Faixas de pedestre sem cor","Mobilidade", "Em aberto", "21-04-2022","-", "-", "-", "Avenida Maria", "Pimentas", "Guarulhos", "SP"},
                      {"05","Andre Santos","Faixas de pedestre sem cor","Mobilidade", "Em aberto","21-04-2022","-", "-", "-", "Avenida Maria", "Pimentas", "Guarulhos", "SP"},
                      {"06","Daniela Miranda","Buracos na cal�ada","Mobilidade", "Em aberto", "21-04-2022","-","-", "-", "Avenida S�o Paulo", "Pimentas", "Guarulhos", "SP"},
                      {"07","Marcia Silva","Sem�foro piscando","Mobilidade", "Solucionado", "21-04-2022","21-04-2022", "Antonio Silva", "J� foi reparado o problema", "Avenida ", "Lavras", "Guarulhos", "SP"},
                      {"08","Leticia Rodrigues","Sem�foro piscando","Mobilidade", "Solucionado", "21-04-2022","21-04-2022", "Antonio Silva", "J� foi reparado o problema", "Avenida Maria ", "Lavras", "Guarulhos", "SP"},
                      {"09","Lourival Santos","Sem�foro piscando","Mobilidade", "Solucionado", "21-04-2022","21-04-2022", "Antonio Silva", "J� foi reparado o problema", "Avenida Maria", "Lavras", "Guarulhos", "SP"},
                      {"10","Marcio Franco","Buracos na cal�ada","Mobilidade", "Solucionado", "21-04-2022","21-04-2022", "Antonio Silva", "J� foi reparado o problema", "Avenida Maria ", "Lavras", "Guarulhos", "SP"},
                      {"12","Carlos Vitor","Sem�foro piscando","Mobilidade", "Solucionado", "21-04-2022","21-04-2022","Antonio Silva", "J� foi reparado o problema", "Avenida Maria ", "Lavras", "Guarulhos", "SP"},
                      {"13","Camila Andreade","Buracos na cal�ada","Mobilidade", "Solucionado", "21-04-2022","21-04-2022", "Antonio Silva", "J� foi reparado o problema", "Avenida Maria ", "Lavras", "Guarulhos", "SP"},
                      {"14","Vitor Pedro","Sem�foro piscando","Mobilidade", "Solucionado", "21-04-2022","21-04-2022","Antonio Silva", "J� foi reparado o problema", "Avenida Maria ", "Lavras", "Guarulhos", "SP"},
                      {"15","Thais Vitoria","Esgoto entupido", "Saneamento", "Em aberto","21-04-2022","-", "", "J� foi reparado o problema", "Avenida Maria ", "Lavras", "Guarulhos", "SP"},
                      {"16","Priscila Rodrigues","Buracos na rua","Mobilidade", "Solucionado", "21-04-2022","21-04-2022", "Antonio Silva", "J� foi reparado o problema", "Avenida Maria ", "Lavras", "Guarulhos", "SP"},
                      
                    };    
    String column[]= {"ID", "Denunciante", "Descri��o", "Tipo Den�ncia", "status", "Criado","Finalizado",  "solu��o", "Solucionador", "Logradouro","Bairro", "Cidade", "Estado", 
       }; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Denuncias() {
		super("Sistema de Den�ncia", new Dimension(1000, 800));
		    
		lblTitulo = new JLabel();
		lblTitulo.setLocation(100, 100);
		lblTitulo.setText("Den�ncias");
		lblTitulo.setSize(600, 50);
		lblTitulo.setForeground(Color.gray);
		lblTitulo.setFont(new Font("Arial", 1, 25));
		getContentPane().add(lblTitulo);
	    
	    tabDenuncia= new JTable(data,column);    
	    tabDenuncia.setBounds(30,40,200,300);
	    tabDenuncia.getTableHeader().setOpaque(false);
	    tabDenuncia.getTableHeader().setBackground(Color.gray);
	    tabDenuncia.getTableHeader().setForeground(Color.white);
	    scrlTab = new JScrollPane(tabDenuncia);             
	    scrlTab.setSize(850,300);
	    scrlTab.setLocation(100, 200);
	    
	    getContentPane().add(scrlTab);
	}

}
