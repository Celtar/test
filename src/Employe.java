
public class Employe {

private int matricule;
private String nom;
private String prenom;

	public Employe(int unMatricule, String unNom,String unPrenom ){
	this.setMatricule(unMatricule);
	this.setNom(unNom);
	this.setPrenom(unPrenom);
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}





}
