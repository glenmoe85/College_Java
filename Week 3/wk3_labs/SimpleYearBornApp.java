//fix the code by figuring out what should be in the **** sections
import javax.swing.JOptionPane;
public class SimpleYearBornApp{
	public static void main(String[] args){
		//variables
		int age;
		int currentYr;
		int yearBorn;
		//objects
		SimpleYearBorn yrBorn;
		yrBorn=new SimpleYearBorn();
		//inputs
		age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
		currentYr=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter current year"));
		//set
		yrBorn.setAge(age);
		yrBorn.setCurrentYr(currentYr);
		//compute
		yrBorn.computeYearBorn();
		//get
		yearBorn=yrBorn.getYearBorn();
		//output
		JOptionPane.showMessageDialog(null,"Your where born in year: "+yearBorn);
	}
}