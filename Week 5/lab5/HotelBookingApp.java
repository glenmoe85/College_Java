import javax.swing.JOptionPane;
public class HotelBookingApp{
	public static void main(String[] args){
		//declare vars
		int age,numOfNights;
		String name;
		String msg;
		//declare & create objects
		HotelBooking h;
		h=new HotelBooking();
		//input
		age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
		name=JOptionPane.showInputDialog(null,"Enter Your Name");
		numOfNights=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of nights"));
		//set
		h.setAge(age);
		h.setNumOfNights(numOfNights);
		//compute
		h.computeCostOfStay();
		//get
		msg=h.getRoomCost();
		//output
		JOptionPane.showMessageDialog(null,"Hello "+name+". "+msg);
	}
}