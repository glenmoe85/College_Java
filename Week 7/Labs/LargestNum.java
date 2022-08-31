public class LargestNum{
	public static void main(String[] args){
		int[] numbersArr={5,4,11,5,16,22,1,35,9};
		int largestNum=0;
		for(int i=0;i<numbersArr.length;i++){
			if(numbersArr[i] > largestNum){
				largestNum = numbersArr[i];
			}
		}
		System.out.println("Largest number in array is: "+largestNum);
	}
}