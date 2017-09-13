package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		
		d1 = new Die();
		d2 = new Die();
		
		getScore(d1.getDieValue() + d2.getDieValue());
	}

	private void getScore(int Score) {
		this.Score= Score;
	}
	public int getScore() {
		return Score;
	}
}
