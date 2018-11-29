package olympiques;

public enum GradeMedal {
	
	
 	
 	BRONZE("M�daille de Bronze"),
	SILVER("M�daille d'Argent"),
	GOLD("M�daille d'Or");
	
	private String grades;

	private GradeMedal(String grades) {
		this.grades = grades;
	}

	public String getGrade() {
		return grades;
	}

	public void setGrade(String grades) {
		this.grades = grades;
	}

}
