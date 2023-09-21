import javax.swing.JOptionPane;
public class Grades {
	public static void main(String[] args) {
	int mathGrade = 0;
	int historyGrade = 0;
	int scienceGrade = 0;
	double average = 0;
	mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter math grade between 0 and 100!"));
	historyGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter history grade between 0 and 100!"));
	scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter science grade between 0 and 100!"));

	average = (mathGrade+historyGrade+scienceGrade)/3;

	if (average >= 90){
		JOptionPane.showMessageDialog(null,
		"You worked too hard ! your average is " + average);
	} else if(average >50 && average<=90){
		JOptionPane.showMessageDialog(null,
		"You did OK! Your average is " + average);
		}
	  else if(average <=50)
	  {
		  JOptionPane.showMessageDialog(null,
		"You need to do some work! Ypur average is " + average);
	  }
	  else{
		  System.out.println("Error happend");
		  System.exit(0);
	  }
	}
}