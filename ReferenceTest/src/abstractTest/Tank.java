package abstractTest;

public class Tank extends Unit {

	void changeMode() {}

	@Override
	void move(int x, int y) {
		System.out.println("("+x+", "+y+")로 이동");
	}

}
