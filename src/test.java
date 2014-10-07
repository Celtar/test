import java.sql.*;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Connection connexion;
	try {
	Class.forName("com.mysql.jdbc.Driver") ;
	connexion = DriverManager.getConnection("jdbc:mysql://localhost/sio2", "root", "");
	Statement st = connexion.createStatement();
	ResultSet rs = st.executeQuery("SELECT * FROM employe");
	int num ; 
	String nom ;
	String prenom; 
	String Datenaiss;
	// Pour accéder à chacune des lignes du résultat de la requête :
	while (rs.next()) {
	num = rs.getInt("matricule");
	nom = rs.getString("Nom");
	prenom = rs.getString("Prenom");
	Datenaiss =  rs.getString("Datenaiss");
	System.out.println("Matricule : "+ num + "Nom : "+nom+ "Prenom : " +prenom+ "Datenaiss : " + Datenaiss) ;
	}
	rs.close() ; // Permet de libérer la mémoire utilisée.
	// . . .
	connexion.close(); // Fermeture de la connexion
	}
	catch(ClassNotFoundException erreur) {
	System.out.println("Driver non chargé !" + erreur);
	}
	catch(SQLException erreur) {
		System.out.println("La connexion a échoué !" + erreur);
	}

}
}