package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Your mission and you have to accept it:
		 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
		 * The main method should create a bag of Popcorn and cook it in the microwave.
		 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
		 * Don't change the existing methods.
		 */
		
		String flav = JOptionPane.showInputDialog("Enter the flavor of the popcorn you want: ");
		int amtTime = Integer.parseInt(JOptionPane.showInputDialog("How long do you want to cook the popcorn for: "));
		
		Popcorn bag = new Popcorn(flav);
		Microwave micro = new Microwave();
		
		micro.putInMicrowave(bag);
		micro.setTime(amtTime);
		micro.startMicrowave();


	}
}
