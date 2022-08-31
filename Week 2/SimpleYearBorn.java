import javax.swing.JOptionPane;
public class SimpleYearBorn{
	public static void main(String[] args){
		int age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Age"));
		int currentYr=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter current year"));
		int yearBorn=currentYr-age;
		//print
		//System.out.println(ans);
		JOptionPane.showMessageDialog(null, "You where born in "+yearBorn);
	}
}