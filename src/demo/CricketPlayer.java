package demo;

public class CricketPlayer {
	
	private String name;
	private int age;
	private int matchesPlayed;
	
	public CricketPlayer(String name, int age, int matchesPlayed) {
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	
}
