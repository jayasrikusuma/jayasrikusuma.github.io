/*
* IDGeneratorApp.java
* @author Jayasri
* 20/8/2022
*/
import javax.swing.JOptionPane;
public class IDGeneratorApp{
	public static void main(String [] args){
		String userName;
		String userId;

		//Declare and Create an object of IDGenerator class
		IDGenerator idG=new IDGenerator();

		userName=JOptionPane.showInputDialog(null,"Enter your name in the format \"Firstname MiddleName Lastname\"\n**NOTE: Please note first letter in each word must be CAPITAL and each word is seperated by one space");

		//Set Username
		idG.setName(userName);

		//UserID Compute method - generateUserId
		idG.generateUserId();

		//Get UserID
		userId=idG.getUserId();
		JOptionPane.showMessageDialog(null, "The user ID for name: " + userName + ", is: "+ userId);

	}

} //end of App class IDGeneratorApp