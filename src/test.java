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
	// Pour acc�der � chacune des lignes du r�sultat de la requ�te :
	while (rs.next()) {
	num = rs.getInt("matricule");
	nom = rs.getString("Nom");
	prenom = rs.getString("Prenom");
	Datenaiss =  rs.getString("Datenaiss");
	System.out.println("Matricule : "+ num + "Nom : "+nom+ "Prenom : " +prenom+ "Datenaiss : " + Datenaiss) ;
	}
	rs.close() ; // Permet de lib�rer la m�moire utilis�e.
	// . . .
	connexion.close(); // Fermeture de la connexion
	}
	catch(ClassNotFoundException erreur) {
	System.out.println("Driver non charg� !" + erreur);
	}
	catch(SQLException erreur) {
		System.out.println("La connexion a �chou� !" + erreur);
	}

}
}