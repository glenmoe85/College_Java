import javax.swing.JOptionPane;
public class SimpleAdditionUserInputApp{
	public static void main(String[] args){
		int x;
		int y;
		int ans;
		//objects
		SimpleAdditionUserInput add;
		add=new SimpleAdditionUserInput();
		//inputs
		x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		//sets
		add.setX(x);
		add.setY(y);
		//compute
		add.computeAns();
		//get
		ans=add.getAns();
		//output
		System.out.println(ans);
		}
}