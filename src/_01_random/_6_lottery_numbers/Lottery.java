package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		
		
	Random random = new Random ();
	
	int ran1 = random.nextInt(6);
	
	int ran2 = random.nextInt(8);
	
	int ran3 = random.nextInt(3); 
	
	int ran4 = random.nextInt(7);
	
	int ran5 = random.nextInt(4);
	
	int ran6 = random.nextInt(1);
	
	JOptionPane.showMessageDialog(null, ran1 + " " + ran2 + " " + ran3 + " " + ran4 + " " + ran5 + " " + ran6, "LOTTERY", JOptionPane.INFORMATION_MESSAGE);
	
}
}