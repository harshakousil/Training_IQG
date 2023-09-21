public class StudentRecord
{
 public StudentRecord()
 {
 
 }
 private String name;
 private double mathGrade;
 private double englishGrade;
 private double scienceGrade;
 
 
 private static int studentCount =0;
 
	 public String getName()
	 {
		return name;
	 }
 
	 public void setName(String temp)
	 {
		name=temp;
	 }
 
	 public double getAverage()
	 {
	 double result =0;
	 result =(getMathGrade()+getEnglishGrade()+getScienceGrade())/3;
	 return result;
	 }
	 public static int getStudentCount()
	 {
		return studentCount;
	 }
 
	 public static void increaseStudentCount()
	 {
		studentCount++;
	 }

	public double getMathGrade()
	{
	return mathGrade;
	}
	public void setMathGrade(double mathGrade)
	{
		this.mathGrade=mathGrade;
	}
	public double getEnglishGrade()
	{
		return englishGrade;
	}

	public void setEnglishGrade(double englishGrade)
	{
		this.englishGrade =englishGrade;
	}
	public double getScienceGrade()
	{
		return scienceGrade;

	}
	public void setScienceGrade(double scienceGrade)
	{
		this.scienceGrade=scienceGrade;
	}
}