public class AnimalMakerApp{
	public static void main(String[] args){
		Dog dog1=new Dog("Lab");
		Animal a1=new Animal();
		System.out.println(dog1.getName());
		dog1.hungerCheck();
		dog1.feed();
		dog1.hungerCheck();
		dog1.animalNoise(dog1.dogNoise());

		System.out.println("Generic Animal");
		a1.hungerCheck();
		a1.feed();
		a1.hungerCheck();
		a1.animalNoise("ROAR!");
	}
}