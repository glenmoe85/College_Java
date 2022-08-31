import javax.swing.JOptionPane;
public class PosNeg_LabTwoApp{
	public static void main(String[] args){
		int num;
		String msg;
		//objects
		PosNeg_LabTwo posNeg;
		posNeg=new PosNeg_LabTwo();
		//inputs
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number to see if negative or positive"));
		//sets
		posNeg.setNum(num);
		//compute
		posNeg.computeMsg();
		//get
		msg=posNeg.getMsg();
		//output
		System.out.println(msg);
		}
}