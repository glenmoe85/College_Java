public class Dog extends Animal{
	private String name;
	private String breed;
	private int randomBark;
	private String chosenNoise;

	public Dog(String breed){
		this.breed=breed;
		name="Stray";
	}
	//methods
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public String dogNoise(){
		String[] barkNoise={"bark","yip","Yap"};
		randomBark=(int)(Math.random()*3);
		chosenNoise=barkNoise[randomBark];
		return chosenNoise;
	}
	@Override
	public void animalNoise(String noise){
		for(int i=0;i<3;i++){
			super.animalNoise(chosenNoise);
		}
	}
}