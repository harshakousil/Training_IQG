import javax.swing.JOptionPane;
public class ForLoop {

	public ForLoop() {
	}
	public static void main(String[] args) {

		String names[]={"Beah","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};

		String searchName = JOptionPane.showInputDialog("Enter either \"Yza\" or \"noname\"!");

		boolean foundName =false;

		for (int i=0; i<names.length; i++){
			
			if (names [i ].equals(searchName)){
			foundName =true;
			break;
		}
		}

	if (foundName)
	JOptionPane.showMessageDialog(null, searchName + " is found!");
	else
	JOptionPane.showMessageDialog(null, searchName + " is not found!");
}
}