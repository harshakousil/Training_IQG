public class StudentRecordExample
{

public static void main(String args[])
{
	StudentRecord annaRecord=new StudentRecord();
	
	StudentRecord.increaseStudentCount();
	
	StudentRecord beahRecord =new StudentRecord();
	
	StudentRecord.increaseStudentCount();
	
	StudentRecord crisRecord= new StudentRecord();
	
	
	StudentRecord.increaseStudentCount();
	
	
	annaRecord.setName("Anna");
	beahRecord.setName("Beah");
	crisRecord.setName("Cris");
	
	System.out.println("Name = "+annaRecord.getName());
	
	System.out.println("Student Count ="+StudentRecord.getStudentCount());
}
}