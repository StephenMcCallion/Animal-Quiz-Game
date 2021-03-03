package myPackage;

/*
 * This model is a simple class that manages the users score
 */
public class Score {

	int currentScore;

	public Score(int currentScore) {
		super();
		this.currentScore = currentScore;
	}

	public int getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	
}
