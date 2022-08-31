public class Reverse{
	private String userInput;
	private StringBuffer strBuff;
	private String reversed;

	public Reverse(){
		strBuff=new StringBuffer();
	}

	public void setUserInput(String userInput){
		this.userInput=userInput;
	}

	public void reverseString(){
		for(int i=userInput.length()-1;i>=0;i--){
			if(userInput.charAt(i)==' '){
				strBuff.append('-');
			}
			else{
				strBuff.append(userInput.charAt(i));
			}
		}
		reversed=strBuff.toString();
	}
	public String getReversed(){
		return reversed;
	}
}