import java.sql.ResultSet;
import java.util.ArrayList;


public class controleur {

	public static void main(String[] args) {

		ArrayList<Employe>uneListe = new ArrayList();
		
		try{
			modele.connexion();
			int i;
			i = 0;
			ResultSet rs = modele.select();
			
			while(rs.next()){
				Employe employe = new Employe(rs.getInt(1),(rs.getString(2)),(rs.getString(3)));
				uneListe.add(employe);
			}
		modele.deconnexion();
		}
	catch(Exception e){
			System.out.println("erreur");
		}
		Fenetre fenetre = new Fenetre(uneListe);
		
}}