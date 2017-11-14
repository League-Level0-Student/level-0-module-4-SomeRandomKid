//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
static int Why2 = 0;	//    Initialize to zero.
static String Why = JOptionPane.showInputDialog(null, "What kind of pet do you want to buy?");
	public static void main(String[] args) {

		// 1. Ask the user what kind of pet they want to buy, and store in variable

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "Water", "Other" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0) {
				feedPet();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	

	// 4. Create methods to handle each of your user selections. 
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
}

	static void feedPet(){
			JOptionPane.showMessageDialog(null, "Your " + Why + " might eat when given food.");
			Why2 += 2;	
}
	void water(){
		JOptionPane.showMessageDialog(null, "Your " + Why + " might drink when given water.");
		Why2 += 3;	
	}
	void other(){
		String Why4 = JOptionPane.showInputDialog(null, "What do you want to make you " + Why + " happy.");
		JOptionPane.showMessageDialog(null, "Your " + Why + " might be happen when " + Why4 + ".");
		Why2 += 4;	
	}
}
