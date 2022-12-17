/*
* PasswordGeneratorApp.java
* @author Jayasri
* 20/8/2022
*/
import javax.swing.JOptionPane;
public class PasswordGeneratorApp{
	public static void main(String [] args){
		String userId;
		String password;
		int totalUserIds;
		String userIdPasswords="";


		//Declare and Create an object of IDGenerator class
		PasswordGenerator pwdG=new PasswordGenerator();

		//Approach ID: MIA2  - Generate passwords for a given number of user Ids
		totalUserIds=Integer.parseInt(JOptionPane.showInputDialog(null,"How many passwords would you like to generate?"));
		for(int i=0;i<totalUserIds;i++){
			userId=JOptionPane.showInputDialog(null,"Enter your userId in the format \"FourCharacters followed by Either Digits - eg:EaES12345678\"");

			//Set Username
			pwdG.setId(userId);

			//UserID Compute method - generateUserId
			pwdG.generatePassword();

			//Get UserID
			password=pwdG.getPassword();
			userIdPasswords = userIdPasswords+"\nUserID: "+userId+"\tPassword: "+password+"\n";
		}

		JOptionPane.showMessageDialog(null, "Generated Passwords for UserId entered:\n" + userIdPasswords);



	}

} //end of App class PasswordGeneratorApp