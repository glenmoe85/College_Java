import javax.swing.JOptionPane;
public class LabTwoApp{
	public static void main(String[] args){
		int arrayCount;
		int [] arraylist;
		int largeNum;
		int sumArray;
		arrayInput arrayPopulate;
		arrayPopulate=new arrayInput();
		arrayCount=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter how many numbers you want to enter"));
		arraylist=new int[arrayCount];
		arraylist=arrayPopulate.setFillArray(arraylist, arrayCount);
		//JOptionPane.showMessageDialog(null,arraylist[3]);
		arrayInput maxNumber;
		maxNumber=new arrayInput();
		largeNum=maxNumber.maxNum(arraylist);
		System.out.println("The max number in this array is " + largeNum);
		arrayInput sumOfArray;
		sumOfArray=new arrayInput();
		sumArray=sumOfArray.sumOfArrayNum(arraylist);
		System.out.println("The sum of the numbers in array is " + sumArray);
	}
}