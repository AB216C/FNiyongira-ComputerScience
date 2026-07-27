package chapter9InheritanceSuperClassOverriding;


 /**
  * This class computes a curved grade. It extends
  * the GradedActivity class.
  */
public class CurvedActivity extends GradedActivity{
	
	private double rawScore ;
	private double percentage;
	
	
	
	   /**
	   * The constructor sets the curve percentage.
	   */
	
	public CurvedActivity(double percent) 
	{
		percentage = percent;
		rawScore = 0.0;
	}
	
	
	   /**
	   * The setScore method overrides the superclass setScore method. 
	   * This version accepts the unadjusted score as an argument. That
	   * score is multiplied by the curve percentage and the result is
	   * sent as an argument to the superclass's setScore method.
	   */
	
	@Override
	
	public void setScore(double s) 
	{
		rawScore = s;
		super.setScore(rawScore*percentage);
	}
	
	
	/*
	 * The get score method return a raw score
	 * */
	
	public double getRawScore() 
	{
		return rawScore;
	}
	
	
	/*
	 * The percentage method return the percentage
	 * */
	
	public double getPercentage() 
	{
		return percentage;
	}

}
