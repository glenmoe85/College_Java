import javax.swing.JOptionPane;
public class NumberApp{
	public static void main(String[] args){
		//vars
		int [] initalNumbers;
		initalNumbers=new int[3];
		int [] finalNumbers;
		//declare obj
		Numbers n;
		n=new Numbers();
		//input
		for(int i=0;i<initalNumbers.length;i++){
			initalNumbers[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		}
		//set
		n.setInitialNumbers(initalNumbers);
		//compute
		n.computeFinalNumbers();
		//get
		finalNumbers=n.getFinalNumbers();
		//output
		for(int i=0;i<initalNumbers.length;i++){
			JOptionPane.showMessageDialog(null,initalNumbers[i]+" times 9 "+finalNumbers[i]);
		}
	}
}