package interfaceTest;

public class SoundableEx {
	public static void main(String[] args) {
		printSount(new Cat());
		printSount(new Dog());
		
	}
	private static void printSount(Soundable soundable)	{
		System.out.println(soundable.sound());
	}
}
