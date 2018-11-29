package olympiques;

import java.util.ArrayList;

import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Athlete {
	
	private String nom;
	private String prenom;
	

	private List<Games> games = new ArrayList<>();
	private List <Medal> medals = new ArrayList<Medal>();


	public Athlete(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Athlete(String nom, String prenom, List<Games> games, List<Medal> medal) {
		this.nom = nom;
		this.prenom = prenom;
		this.games = games;
		this.medals = medal;
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


	public List<Games> getGame() {
		return games;
	}


	public void setGame(List<Games> games) {
		this.games = games;
	}


	public List<Medal> getMedal() {
		return medals;
	}


	public void setMedal(List<Medal> medal) {
		this.medals = medal;
	}
	
	
	public void addMedal(Medal medal) {
		this.medals.add(medal);
		this.games.add(medal.getGame());
		// En ajoutant une m�daile a un athl�te on lui ajoute le game
		// pour lequel il remporte la reward
	}
	
	public void addGame(Games game) {
		this.games.add(game);
	}
	
	

	/**
	 * On v�rifie les m�dailles � gagner pour chaque game
	 */
	
	@Override
	public String toString() {
	String info = "Athl�te : " + nom + " " + prenom + " joue � :\n";
	for (Games game : games) {
		boolean gagner = false; // Si le bool�en est � false pour ce game 
		// l'athl�te a jou� � ce game mais il n'a pas gagn� de reward
		info += "- " + game.getNom() + " (" + game.getPresentation() + ")" ;

		for (Medal medal : medals) {
			if(game.getNom().equals(medal.getGame().getNom())){
				gagner = true; // Si le nom du game de la reward correspond au nom du game 
				// on affiche son r�sultat et on d�termine le bool�en � Vrai
				info +=  " remporte la " + medal.getGradeMedal().getGrade() + " \n";
			}
		}
		if(!gagner) {
			info += " et n'a pas remport� de m�daille\n";
		}
		
	}
	return info;
				
	}
	
	public static void main(String[] args) {
		
		// Creation de nos Champions
		Athlete firstAthlete = new Athlete("Usain","Bolt");
		Athlete secondAthlete = new Athlete("Christophe","Lema�tre");
		
		// M�daille Gold pour firstAthlete au 100 m�tres 
		firstAthlete.addMedal(new Medal(GradeMedal.GOLD, Games.HUNDREDMETERS));
		
		
		// M�daille Bronze pour firstAthlete au lancer de poids
		firstAthlete.addMedal(new Medal(GradeMedal.BRONZE, Games.SHOTPUT));
		System.out.println(firstAthlete.toString());
		
		
		
		// secondAthlete joue � saut en hateur
		secondAthlete.addGame(Games.HIGHJUMP);
		// secondAthlete remporte une medaille d'argent au lancer de poids 
		secondAthlete.addMedal(new Medal(GradeMedal.SILVER, Games.SHOTPUT));
		System.out.println(secondAthlete.toString());
		
	}

}
