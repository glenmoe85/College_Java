import javax.swing.JOptionPane;
public class ReverseApp{
	public static void main(String[] args){
		String userInput;
		String reversed;
		Reverse rev;
		rev=new Reverse();
		userInput=JOptionPane.showInputDialog(null,"Enter a message to be reversed");
		rev.setUserInput(userInput);
		rev.reverseString();
		reversed=rev.getReversed();
		JOptionPane.showMessageDialog(null,reversed);
	}
}