import javax.swing.JOptionPane;
public class LeapYearApp{
	public static void main(String[] args){
		//declare vars
		int year;
		String msg;
		//declare & create objects
		LeapYear leapYr;
		leapYr=new LeapYear();
		//input
		year=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter year to check if Leap Year"));
		//set
		leapYr.setYear(year);
		//compute
		leapYr.computeIsLeapYear();
		//get
		msg=leapYr.getMsg();
		//output
		JOptionPane.showMessageDialog(null,msg);
	}
}