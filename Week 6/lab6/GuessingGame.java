public class GuessingGame{
	private int guess;
	private int random;
	private int result;
	private String msg;
	public GuessingGame(){
			guess=0;
			msg="";

	}
	public void setRandomNum(){
		random=(int)(Math.random() * 10) +1;
	}
	public void setGuess(int guess){
			this.guess=guess;
	}
	public void computeMsg(){
		if(guess==random){
			msg="Winner! Your guess:"+guess+" Randon Number:"+random + ". Game Over!";
			result=0;
		}
		else{
			msg="Loser! Your guess:"+guess+" Random Number:"+random;
			result=1;
		}
	}
	public String getMsg(){
		return msg;
	}
	public int getResult(){
			return result;
	}

}
