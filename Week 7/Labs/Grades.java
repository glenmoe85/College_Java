public class Grades{
	//vars
	private int[] initialGrades;
	private String[] finalGrades;
	private double overallGrades=0;
	private double gradeAvg;

	//constructor
	public Grades(){

	}
	//set
	public void setSubCount(int subCount){
		finalGrades=new String[subCount];
	}
	public void setInitialGrades(int[] initialGrades){
		this.initialGrades=initialGrades;
	}
	//compute
	public void computeAvg(){
		for(int i=0;i<initialGrades.length;i++){
			overallGrades=overallGrades + initialGrades[i];
		}
		gradeAvg=overallGrades / initialGrades.length;
	}
	public void computeFinalGrades(){
		for(int i=0;i<initialGrades.length;i++){
			if(initialGrades[i]>=85){
				this.finalGrades[i]="A";
			}
			else if(initialGrades[i]>=70){
				this.finalGrades[i]="B";
			}
			else if(initialGrades[i]>=55){
				this.finalGrades[i]="C";
			}
			else if(initialGrades[i]>=40){
				this.finalGrades[i]="D";
			}
			else if(initialGrades[i]>=25 && initialGrades[i]<=39){
				this.finalGrades[i]="E";
			}
			else{
				this.finalGrades[i]="F";
			}
		}
	}
	//get
	public String[] getFinalGrades(){
		return finalGrades;
	}
	public double getGradeAvg(){
		return gradeAvg;
	}
}