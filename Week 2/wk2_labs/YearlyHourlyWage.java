import javax.swing.JOptionPane;
public class YearlyHourlyWage{
	public static void main(String[] args){
		//variables
		double monthlyWage;
		double weeklyHrs;
		double yearlyWage;
		double hourlyWage;
		//inputs
		monthlyWage=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter monthly wage"));
		weeklyHrs=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your weekly hours"));
		//process
		yearlyWage=monthlyWage*12;
		hourlyWage=monthlyWage/weeklyHrs;
		//output
		JOptionPane.showMessageDialog(null,"Your yearly wage is: "+yearlyWage);
		JOptionPane.showMessageDialog(null,"Your hrly rate is: "+hourlyWage);
	}
}