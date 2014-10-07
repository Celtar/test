import java.sql.*;
import java.util.ArrayList;

public class modele {
private static Connection connexion ;
private static ResultSet rs;

public static void connexion(){
	try {
	Class.forName("com.mysql.jdbc.Driver") ;
	connexion = DriverManager.getConnection("jdbc:mysql://localhost/sio2", "root", "");
	}
	catch(ClassNotFoundException erreur) {
	System.out.println("Driver non chargé !" + erreur);
	}
	catch(SQLException erreur) {
		System.out.println("La connexion a échoué !" + erreur);
		
	}
}	
	
public static void deconnexion(){
	try {	
	connexion.close(); // Fermeture de la connexion
	}
	catch(SQLException erreur) {
		System.out.println("La connexion a échoué !" + erreur);
	}
}


public static ResultSet select(){
		try {
			Statement st = connexion.createStatement();
	    	rs = st.executeQuery("SELECT * FROM employe");
	    	}
	    	catch(SQLException erreur) {
		    	System.out.println("erreur de la requete" + erreur);
	    	}
	    	return (rs);
		}


public static ArrayList<Employe> methode(ArrayList<Employe>modele){
	ResultSet resultat = select();
	try{
		while (resultat.next()){
			Employe employe = new Employe(resultat.getInt(1) ,resultat.getString(2), resultat.getString(3));
			modele.add(employe);
		}
	}
	catch(SQLException erreur) {
    	System.out.println("erreur de la requete" + erreur);
	}
	return (modele);
}
}