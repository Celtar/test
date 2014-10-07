import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.ArrayList;
import java.util.ArrayList;
	public class Fenetre extends JFrame {
		
		 private JTable tableau ;
	  public Fenetre(ArrayList<Employe>employe){
		  
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("JTable");
	    this.setSize(500, 320);

	    //Les données du tableau
	    Object tableau[][] = new Object[6][5];
	   	   	    	
	    	modele.connexion();
	    	
	    	int i;
	    	i =0;
	    	
	    	ResultSet rs = modele.select();
	    	 try {
	    	// Pour accéder à chacune des lignes du résultat de la requête :
	    	while (rs.next()){
		    	tableau[i][0]= employe.get(i).getMatricule();
		    	tableau[i][1]= employe.get(i).getNom();
		    	tableau[i][2]= employe.get(i).getPrenom();
		    	i++;
	    	}
	    	 rs.close();
	    	 }
	    	 catch(Exception e) {
	    		System.out.println("erreur");
	    	}
	    	 
	    	 modele.deconnexion();
	    
	    String title[] = {"matricule","Nom","Prenom"};
	     this.tableau = new JTable(tableau , title);

	    this.getContentPane().add(new JScrollPane(this.tableau));
	    this.setVisible(true);
	  }   

	  public static void main(String[] args){
	   
	   
	  }   
	}
