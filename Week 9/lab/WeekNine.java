import java.util.ArrayList;
public class WeekNine{
	private String userInput;
	private StringBuffer strBuff;
	private String inputMath;
	private int count=0;
	private String onlyLetters;
	private String secondLetters;
	private ArrayList<Integer> indexOfSpaces = new ArrayList<Integer>();
	private String spaceInInput;
	private String changedVowels;
	public WeekNine(){
		strBuff=new StringBuffer();
	}

	public void setUserInput(String userInput){
		this.userInput=userInput;
	}

	public void letterCount(){
		for (int i = 0; i < userInput.length(); i++) {
			if (Character.isLetter(userInput.charAt(i))){
			count++;
			}
		}
	}
	public void countVowels(){
		count = 0;
		String userInputLC=userInput.toLowerCase();
		for (int i = 0; i < userInputLC.length(); i++)
		{
			if (userInputLC.charAt(i) == 'a' || userInputLC.charAt(i) == 'e' || userInputLC.charAt(i) == 'i' || userInputLC.charAt(i) == 'o' || userInputLC.charAt(i) == 'u')
			{
				count++;
			}
		}
	}
	public void changeVowels(){
		String userInputLC=userInput.toLowerCase();
			for(int i = 0; i < userInputLC.length(); i++){
				if(userInputLC.charAt(i) == 'a' || userInputLC.charAt(i) == 'e' || userInputLC.charAt(i) == 'i' || userInputLC.charAt(i) == 'o' || userInputLC.charAt(i) == 'u')
			{
					strBuff.append('!');
				}
				else{
					strBuff.append(userInput.charAt(i));
				}
			}
			changedVowels=strBuff.toString();
			strBuff.delete(0, strBuff.length());
	}
	public void storedString(){
		onlyLetters=userInput;
		onlyLetters=onlyLetters.replace(" ", "");
		onlyLetters=onlyLetters.replace(".", "");
		for(int i=1; i < onlyLetters.length(); i+=2){
			strBuff.append(onlyLetters.charAt(i));
			secondLetters=strBuff.toString();
		}
	}
	public void spaceInString(){
		char character = 'n';
		for(int i = 0; i < userInput.length(); i++){
		    if(userInput.charAt(i) == ' '){
		       indexOfSpaces.add(i+1);
    		}
		}
		for (int s : indexOfSpaces) {
		         strBuff.append(s);
		         strBuff.append(", ");
		      }
     spaceInInput = strBuff.toString();
     strBuff.delete(0, strBuff.length());
	}
	public int getLetterCount(){
			return count;
	}
	public int getVowelCount(){
			return count;
	}
	public String getStoredString(){
		return secondLetters;
	}

	public String getSpaceInString(){
			return spaceInInput;
	}
	public String getChangedVowels(){
		return changedVowels;
	}
}