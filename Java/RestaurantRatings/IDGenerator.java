/*
* IDGenerator.java
* @author Jayasri
* 20/8/2022
*/

public class IDGenerator{
	private String userName;
	private String userId;
	//private StringBuffer strBuff;
	private StringBuffer strBuffChars;
	private boolean isSpace;
	private int countSpaces;

	//Constructor method
	public  IDGenerator(){
		String userName="";
		String userId="";
		strBuffChars = new StringBuffer();
		//strBuff = new StringBuffer();

	}

	//Set user name
	public void setName(String name){
		this.userName = name;
	}

	//Generate User ID
	//Input name foramt "Firstname Middlename Lastname"
	//Sample userId format ddddddddcccc
	//UserID Length = 12
	public void generateUserId(){

		int randomNumDb;
		//Generate 8 Random digits for first eight characters in user Id
		for(int i=0;i<8;i++){
			randomNumDb = (int) (Math.random()*10);
			strBuffChars.append(randomNumDb);
		}

		//Based on the given user name, set last four characters of the user ID
		for(int i=0; i<userName.length();i++){

			if(i==0){
				strBuffChars.append(userName.charAt(i));
			}else{
				if(userName.charAt(i)==' '){
					isSpace=true;
					countSpaces++;
				}else if(isSpace){
					strBuffChars.append(userName.charAt(i));
					if(countSpaces == 2){
						i=userName.length()-1;
					}
					isSpace = false;
				}
			}
		}
		strBuffChars.append(userName.charAt(userName.length()-1));
		userId = strBuffChars.toString();
	}

	//return user ID
	public String getUserId(){
		return userId;
	}


}  //end of instantiable class IDGenerator