//Glenda Morris: x21110646
//Higher Diploma in Science in Computing, Year 1, HDWD_SEPOL
//Question 1b: Approach ID: MFNA1
//Question 2b
import javax.swing.JOptionPane;
public class ItemGeneratorApp{
	public static void main(String[] args){
		//vars
		int numOfPara;
		String[] paragraphArr;
		int[] vowelCount;
		int genPw=0;
		int num;
		while (genPw==0){
			//vars
			String fullName=JOptionPane.showInputDialog(null,"Enter in your full name");
			String password;
			//declare obj
			ItemGenerator p;
			p=new ItemGenerator();
			//set
			p.setPassword(fullName);
			//compute
			p.computePassword();
			//get
			password=p.getPassword();
			//output
			System.out.println("Password for "+fullName+" is: "+password);
			genPw = JOptionPane.showConfirmDialog(null, "Do you want input another full name?");
		}
		numOfPara=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter in the number of paragraphs you will be entering"));
		//set array length
		paragraphArr=new String[numOfPara];
		vowelCount=new int[numOfPara];
		//Populate array with paragraphs
		for(int i=0;i<paragraphArr.length;i++){
			paragraphArr[i]=JOptionPane.showInputDialog(null,"Enter in your paragraph");
		}
		//declare obj
		ItemGenerator para;
		para=new ItemGenerator();
		//set
		para.setPara(paragraphArr);
		//Compute
		para.computeVowelCount();
		//get
		vowelCount=para.getVowelCount();
		//Loop through array to get all the entries of count to print on screen
		for(int j=0;j<vowelCount.length;j++){
			//num not needed, its just for better presentation to user, to say which paragraphs count it is
			num=j+1;
			System.out.println("Vowel counts for paragraph "+num+" is "+vowelCount[j]);
		}
	}
}
