package olympiques;

public enum GradeMedal {
	
	
 	
 	BRONZE("Médaille de Bronze"),
	SILVER("Médaille d'Argent"),
	GOLD("Médaille d'Or");
	
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
