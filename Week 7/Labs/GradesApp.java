import javax.swing.JOptionPane;
public class GradesApp{
	public static void main(String[] args){
		//vars
		int [] initialGrades;
		int subCount=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter how many subjects"));
		initialGrades=new int[subCount];
		String [] finalGrades;
		double gradeAvg;
		//declare obj
		Grades g;
		g=new Grades();
		//input
		for(int i=0;i<initialGrades.length;i++){
			initialGrades[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your subject grade"));
		}
		//set
		g.setSubCount(subCount);
		g.setInitialGrades(initialGrades);
		//compute
		g.computeFinalGrades();
		g.computeAvg();
		//get
		finalGrades=g.getFinalGrades();
		gradeAvg=g.getGradeAvg();

		//output
		for(int i=0;i<initialGrades.length;i++){
			JOptionPane.showMessageDialog(null,"Your result is: " +initialGrades[i]+" Your grade is: "+finalGrades[i]);
		}
		JOptionPane.showMessageDialog(null,"Your result average is: " +gradeAvg);
	}
}