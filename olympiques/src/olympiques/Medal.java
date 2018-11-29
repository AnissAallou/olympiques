package olympiques;

public class Medal {


	private GradeMedal gradeMedal;
	private Games game;

	public Medal(GradeMedal gradeMedal, Games game) {
		this.gradeMedal = gradeMedal;
		this.game = game;
	}

	public GradeMedal getGradeMedal() {
		return gradeMedal;
	}

	public void setGradeMedal(GradeMedal gradeMedal) {
		this.gradeMedal = gradeMedal;
	}

	public Games getGame() {
		return game;
	}
	
	public void setGame(Games game) {
		this.game = game;
	}

	
}
