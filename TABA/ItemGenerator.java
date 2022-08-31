//Glenda Morris: x21110646
//Higher Diploma in Science in Computing, Year 1, HDWD_SEPOL
//Question 1a: Assigned Item password
//Question 2a: Functionality iD: F2
public class ItemGenerator{
	//vars
	private String fullName;
	private String password;
	private int charEliminatedCount;
	private int strLen;
	private String [] paragraphArr;
	private int [] vowelCountArr;
	private int vowelCount;
	private int paraLen;

	//constructor
	public ItemGenerator(){
		charEliminatedCount=0;
		vowelCount=0;
		password="";
	}

	//set: This method will take the user input entered and set it to a private variable for further use
	public void setPassword(String fullName){
		this.fullName=fullName;
		strLen = fullName.length();
	}

	//set: This method will take the users input of paragraphs via an array and set it to a private variable for further use
	public void setPara(String [] paragraphArr){
		this.paragraphArr=paragraphArr;
		vowelCountArr=new int[paragraphArr.length];
	}

	//compute: This method will create the password based on user input and conditions below
	public void computePassword(){
		for(int i=0; i<strLen; i++){
			//1.The letters ‘a’, ’e’, and ‘t’ from the given full name will not be used in the password
			if (fullName.charAt(i)=='a' || fullName.charAt(i)=='A' || fullName.charAt(i)=='e' ||fullName.charAt(i)=='E' || fullName.charAt(i)=='t' || fullName.charAt(i)=='T'){
				charEliminatedCount++;
			}
			//2. Each vowel (except ‘a’ and ‘e’ which are eliminated) is going to be added twice
			else if (fullName.charAt(i)=='i' || fullName.charAt(i)=='I' || fullName.charAt(i)=='o' || fullName.charAt(i)=='O' || fullName.charAt(i)=='u' || fullName.charAt(i)=='U'){
				password+=fullName.charAt(i)+""+fullName.charAt(i);
			}
			//3. Each space is replaced by the letter ‘S’ followed by a ‘&’ and a ‘?’
			else if (fullName.charAt(i) == ' '){
				password+="S&?";
			}
			//4. All the other characters will remain the same as in the given full name
			else {
				password+=fullName.charAt(i);
			}
		}
		//5. The password ends with the total number of letters eliminated (i.e. the total number of letters ‘a’, ’e’, and ‘t’ from the given full name that were not used in the password)
		password=password+""+charEliminatedCount;
	}

	//compute: This method counts vowels in each paragraph and stores count of each in an array
	public void computeVowelCount(){
		for(int i=0;i<paragraphArr.length;i++){
			paraLen = paragraphArr[i].length();
			String para=paragraphArr[i];
			for(int j=0; j<paraLen;j++){
				if (paragraphArr[i].charAt(j)=='a' || paragraphArr[i].charAt(j)=='A' || paragraphArr[i].charAt(j)=='e' || paragraphArr[i].charAt(j)=='E' || paragraphArr[i].charAt(j)=='i' || paragraphArr[i].charAt(j)=='I' || paragraphArr[i].charAt(j)=='o' || paragraphArr[i].charAt(j)=='O' || paragraphArr[i].charAt(j)=='u' || paragraphArr[i].charAt(j)=='U'){
					vowelCount++;
				}
			}
			vowelCountArr[i]=vowelCount;
			vowelCount=0;
		}
	}

	//get: This will return the password to display on screen
	public String getPassword(){
		return password;
	}
	//get: This will return the vowel count of each paragraph in an array
	public int [] getVowelCount(){
			return vowelCountArr;
	}
}