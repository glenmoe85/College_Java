import javax.swing.JOptionPane;
public class FourYrResults{
	public static void main(String[] args) {
		String[] years={"Year1", "Year2", "Year3","Year4"};
		int rows=years.length;
		int numResults=5;
		int columns=numResults;
		double[][] results;
		int yrAverage;
		int totalAverage;
		totalAverage=0;
		int numOfEntries;
		numOfEntries=rows*numResults;
		results=new double[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				results[i][j]=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter result "+(j+1)+" for "+years[i]));
			}
		}
		for(int i=0;i<rows;i++){
			yrAverage=0;
			for(int j=0;j<columns;j++){
				yrAverage+=results[i][j];
			}
			totalAverage+=yrAverage;
			yrAverage=yrAverage/numResults;
			System.out.println("Average for "+years[i]+" is "+yrAverage);
		}
		totalAverage=totalAverage/numOfEntries;
		System.out.println("Average Overall is "+totalAverage);
	}
}