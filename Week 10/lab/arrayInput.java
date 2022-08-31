//package userinput;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class arrayInput{
	private int[] arraylist;
	private int arrayCount;
	private int largestNum;
	private int sumArray=0;
	public int[] setFillArray(int [] arraylist, int arrayCount){
		this.arraylist=arraylist;
		this.arrayCount=arrayCount;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the " + arrayCount + " numbers now.");
		for (int i = 0 ; i < arraylist.length; i++ ) {
			arraylist[i] = in.nextInt();
        }
        return arraylist;
	}
	public int maxNum(int [] arraylist){
		this.arraylist=arraylist;
		for(int i=0;i<arraylist.length;i++){
					if(arraylist[i] > largestNum){
						largestNum = arraylist[i];
					}
		}
		return largestNum;
	}
	public int sumOfArrayNum(int [] arraylist){
		this.arraylist=arraylist;
		for(int i=0;i<arraylist.length;i++){
			sumArray += arraylist[i];
		}
		return sumArray;
	}
}
