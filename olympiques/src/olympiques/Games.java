package olympiques;

public enum Games {
	
	HIGHJUMP("Saut en hauteur", "Compétition"),
	TRIPLEJUMP("Saut en longeur", "Compétition 3 sauts en hauteur"),
	HUNDREDMETERS("100 mètres", "Course"),
	TWOHUNDREDMETERS("200 mètres", "Course"),
	SHOTPUT("Lancer de poids", "Compétition");

	
	private final String nom;
	private final String presentation;
	
	
	private Games(String nom, String presentation) {
		this.nom = nom;
		this.presentation = presentation;
	}


	public String getNom() {
		return nom;
	}


	public String getPresentation() {
		return presentation;
	}
}
