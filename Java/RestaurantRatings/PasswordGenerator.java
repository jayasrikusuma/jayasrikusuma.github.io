/*
* PasswordGenerator.java
* @author Jayasri
* 20/8/2022
*/

public class PasswordGenerator{
	private String userId;
	private StringBuffer strBuffChars;
	private String password;
	private int countStars;

	//Constructor method
	public  PasswordGenerator(){
		String userId="";
	}

	//Set user ID
	public void setId(String id){
		this.userId = id;
	}


	//Generate Password
	//UserId input format: CcCcdddddddd
	public void generatePassword(){
		//create a new string buffer
		strBuffChars = new StringBuffer();
		//reset stars count
		countStars=0;
		for(int i=0; i<userId.length();i++){
			//Password generation rules per each character in user id
			//replace A=aa; E=ee; L=ll; M=mm; S=ss
			//replace 1 = !* ; 3 = E*; 5 = S*; 7=&*; 9=(*
			//otherwise, just output the same character from userId
			if(userId.charAt(i) == 'A'){
				strBuffChars.append("aa");
			}else if(userId.charAt(i) == 'E'){
				strBuffChars.append("ee");
			}else if(userId.charAt(i) == 'L'){
				strBuffChars.append("ll");
			}else if(userId.charAt(i) == 'M'){
				strBuffChars.append("mm");
			}else if(userId.charAt(i) == 'S'){
				strBuffChars.append("ss");
			}else if(userId.charAt(i) == '1'){
				strBuffChars.append("!*");
				countStars++;
			}else if(userId.charAt(i) == '3'){
				strBuffChars.append("E*");
				countStars++;
			}else if(userId.charAt(i) == '5'){
				strBuffChars.append("S*");
				countStars++;
			}else if(userId.charAt(i) == '7'){
				strBuffChars.append("&*");
				countStars++;
			}else if(userId.charAt(i) == '9'){
				strBuffChars.append("(*");
				countStars++;
			}else{
				strBuffChars.append(userId.charAt(i));
			}

		}
		//Add total stars(*) present in the password
		strBuffChars.append(countStars);

		password = strBuffChars.toString();
	}

	//return Password
	public String getPassword(){
		return password;

	}

} //end of instantiable class PasswordGenerator