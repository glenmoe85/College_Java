public class MathRandom_LabFour{
	private int guess;
	private int random;
	private String msg;
	public MathRandom_LabFour(){
			guess=0;
			msg="";
			random=(int)(Math.random() * 10) +1;
	}
	public void setGuess(int guess){
			this.guess=guess;
	}
	public void computeMsg(){
		if(guess==random){
			msg="Winner! Your guess:"+guess+" Randon Number:"+random;
		}
		else{
			msg="Loser! Your guess:"+guess+" Random Number:"+random;
		}
	}
	public String getMsg(){
		return msg;
	}

}
