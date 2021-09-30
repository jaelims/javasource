package abstractTest;

public class Marine extends Unit {

	void stimPack() {}

	@Override
	void move(int x, int y) {
		System.out.println("("+x+", "+y+")로 이동");
	}

	
	
}
