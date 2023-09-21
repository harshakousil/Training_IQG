public class StudentRecord {
	
	private String name;
	
	private double mathGrade;
	
	private double englishGrade;
	
	private double scienceGrade;
	
	private double average;
	
	private static int studentCount = 0;
	
	public StudentRecord() {
	}

	public StudentRecord(String name){
		this.name = name;
	}
	
	public StudentRecord(String name, double mGrade){
		this.name = name;
		mathGrade = mGrade;
	}
	
	// Constructor that gets three parameters
	
	public StudentRecord(String name, double mGrade, double eGrade){
		this.name = name;
		mathGrade = mGrade;
		englishGrade = eGrade;
	}
	
	// Constructor that gets four parameters
	
	public StudentRecord(String name, double mGrade, double eGrade,double sGrade){
		this.name = name;
		mathGrade = mGrade;
		englishGrade = eGrade;
		scienceGrade = sGrade;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String temp ){
		name =temp;
	}
	
	public double getAverage(){
		double result =0;
		result =(getMathGrade()+getEnglishGrade()+getScienceGrade() )/3;
		return result;
	}
	
	public static int getStudentCount(){
		return studentCount;
	}
	
	public static void increaseStudentCount(){
		studentCount++;
	}
	
	// Instance methods
	
	public double getMathGrade() {
		return mathGrade;
	}
	
	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}
	
	public double getEnglishGrade() {
		return englishGrade;
	}
	
	public void setEnglishGrade(double englishGrade) {
		this.englishGrade = englishGrade;
	}
	
	public double getScienceGrade() {
		return scienceGrade;
	}
	
	public void setScienceGrade(double scienceGrade) {
		this.scienceGrade = scienceGrade;
	}
	/*public void setAverage (double average){
		this.average=average;
	}
	public double getAverage(){
		return average;
	}
	*/
}