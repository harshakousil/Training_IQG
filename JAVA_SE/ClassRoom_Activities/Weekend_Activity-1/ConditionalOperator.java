public class ConditionalOperator {

public ConditionalOperator() {
}

	public static void main(String[] args) {

	String status = "";
	String status_1 = "";
	
	int grade = 80;

	status = (grade >= 60)?"Passed":"Fail";

	System.out.println( status );
	
	int salary =5000;
	
	status_1 =(salary>=5000) ?"You are rich !" : "You are poor!";
	
	System.out.println(status_1);
	
}
}