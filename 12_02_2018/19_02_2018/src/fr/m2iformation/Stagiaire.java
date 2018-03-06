package fr.m2iformation;

public final class Stagiaire {
	private String nom;
	private String prenom;
	private int numInscription;

	public Stagiaire() {
	}

	public Stagiaire(String nom, String prenom, int numInscription) {
		this.nom = nom;
		this.prenom = prenom;
		this.numInscription = numInscription;
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

	public int getNumInscription() {
		return numInscription;
	}

	public void setNumInscription(int numInscription) {
		this.numInscription = numInscription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + numInscription;
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stagiaire other = (Stagiaire) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numInscription != other.numInscription)
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("\tnom : %s, prénom : %s, num : %d%n", 
				nom, prenom, numInscription);
	}

}
