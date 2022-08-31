public class TenByTenGrid{
	public static void main(String[] args) {
		int rows=10;
		String outputVal="";
		for(int i=0;i<rows;i++){
			outputVal="";
			for(int j=0;j<rows;j++){
				outputVal+="-";
			}
			System.out.println(outputVal);
		}
	}
}