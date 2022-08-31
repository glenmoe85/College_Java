import javax.swing.JOptionPane;
public class GuessingGameApp{
	public static void main(String[] args){
		int guess;
		String msg;
		int result;
		//objects
		GuessingGame guessNum;
		guessNum=new GuessingGame();
		//inputs
		for(int i=0;i<3;i++){
			guess=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number between 1-10, You have 3 tries"));
			//sets
			guessNum.setRandomNum();
			guessNum.setGuess(guess);
			//compute
			guessNum.computeMsg();
			//get
			msg=guessNum.getMsg();
			result=guessNum.getResult();
			//output
			System.out.println(result);
			if(result==0){
				System.out.println(msg);
				break;
			}
			else{
				System.out.println(msg);
			}
		}
	}
}