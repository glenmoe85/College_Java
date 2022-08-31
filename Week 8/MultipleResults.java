import javax.swing.JOptionPane;
public class MultipleResults{
	public static void main(String[] args) {
		String[] students={"Sam Cogan", "John Smith", "Bob Loblaw"};
		int rows=students.length;
		int numModules=4;
		int columns=numModules;
		double[][] results;
		results=new double[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				results[i][j]=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter result "+(j+1)+" for "+students[i]));
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.println(students[i]+" result +"+(j+1)+" is: "+results[i][j]);
			}
		}
	}
}