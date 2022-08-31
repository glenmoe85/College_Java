import javax.swing.JOptionPane;
public class ArrayExamples{
	public static void main(String[] args){
		//Example 1
		String[] ingredients={"Milk","Sugar","Eggs"};
		System.out.println("Ingredients");
		System.out.println(ingredients[0]);
		System.out.println(ingredients[1]);
		System.out.println(ingredients[2]);
		System.out.println();

		//Example 2
		double [] results;
		results=new double[5];
		for(int i=0;i<results.length;i++){
			results[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Result"));
		}
		System.out.println("Results");
		for(int i=0;i<results.length;i++){
			System.out.println(results[i]);
		}


	}
}