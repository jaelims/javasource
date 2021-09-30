package abstractTest;

public abstract class Unit {
		private int x,y;
		
		abstract void move(int x, int y);
		void stop() {
			System.out.println("지정된 위치에서 멈춤");
		}
}
