package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] arg) {
	
	String ageInString = JOptionPane.showInputDialog("How old are you in years?");
		
		
	int ageInInt = Integer.parseInt(ageInString);
	
	if(ageInInt >= 18) {
		
	JOptionPane.showInputDialog("Who should be the next president?");
		
	}
	
	else {
	
	JOptionPane.showMessageDialog(null, "No one cares what you think >:D");
		
	}
		
		
	}
}
