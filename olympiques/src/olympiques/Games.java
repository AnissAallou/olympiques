package olympiques;

public enum Games {
	
	HIGHJUMP("Saut en hauteur", "Comp�tition"),
	TRIPLEJUMP("Saut en longeur", "Comp�tition 3 sauts en hauteur"),
	HUNDREDMETERS("100 m�tres", "Course"),
	TWOHUNDREDMETERS("200 m�tres", "Course"),
	SHOTPUT("Lancer de poids", "Comp�tition");

	
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
