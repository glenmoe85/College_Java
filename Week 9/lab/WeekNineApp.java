import javax.swing.JOptionPane;
public class WeekNineApp{
	public static void main(String[] args){
		String userInput;
		int results;
		String resultStr;
		WeekNine strMath;
		strMath=new WeekNine();
		userInput=JOptionPane.showInputDialog(null,"Enter a message");
		strMath.setUserInput(userInput);
		strMath.letterCount();
		results=strMath.getLetterCount();
		System.out.println("User Input: "+userInput);
		System.out.println("This input has "+results+" letters");
		strMath.countVowels();
		results=strMath.getVowelCount();
		System.out.println("This input has "+results+" vowels");
		strMath.spaceInString();
		resultStr=strMath.getSpaceInString();
		if (resultStr.isEmpty()){
			System.out.println("No spaces found in your input");
		}
		else{
		System.out.println("Spaces are in position(s) "+resultStr);
	}
		strMath.changeVowels();
		resultStr=strMath.getChangedVowels();
		System.out.println("Replace vowels with ! : "+resultStr);


		strMath.storedString();
		resultStr=strMath.getStoredString();
		System.out.println("New string with every 2nd letter "+resultStr);
	}
}