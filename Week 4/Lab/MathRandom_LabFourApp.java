import javax.swing.JOptionPane;
public class MathRandom_LabFourApp{
	public static void main(String[] args){
		int guess;
		String msg;
		//objects
		MathRandom_LabFour guessNum;
		guessNum=new MathRandom_LabFour();
		//inputs
		guess=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number between 1-10"));
		//sets
		guessNum.setGuess(guess);
		//compute
		guessNum.computeMsg();
		//get
		msg=guessNum.getMsg();
		//output
		System.out.println(msg);
		}
}