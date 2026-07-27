package chapter42GradingNestedIfStatements;

public class TestGrade {
	
	private int score;
	
	
	public TestGrade(int score) {
		
		this.score = score;
	}
	
	
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	public int getScore() {
		return score;
	}
	
	
	
	public char getLetterGrade() {
		char grade;
		
		if(score < 60) 
		{
			grade = 'F';
		}
		else if(score < 70)
		{
			grade = 'D';
		}
		else if(score < 80)
		{
			grade = 'C';
		}
		else if (score < 90)
		{
			grade = 'B';
		}
		else
			grade = 'A';
		
		
		return grade;
	}
	

}
