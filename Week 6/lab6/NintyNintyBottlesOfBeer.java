public class NintyNintyBottlesOfBeer{
	public static void main(String[] args){

		int bottlesNumberTotal=99;
		int bottlesNumber;
		int bottlesLeft;

		for(int i=0;i<bottlesNumberTotal;i++){
			bottlesNumber=bottlesNumberTotal - i;
			bottlesLeft=bottlesNumber - 1;
			if(bottlesNumber != 1){
				System.out.println(bottlesNumber + " bottles of beer on the wall, "+ bottlesNumber +" bottles of beer");
				System.out.println("Take one down and pass it around, "+ bottlesLeft + " bottle of beer on the wall");
			}
			else{
				System.out.println(bottlesNumber + " bottle of beer on the wall, "+ bottlesNumber +" bottle of beer");
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
			}
			System.out.println();
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
	}
}