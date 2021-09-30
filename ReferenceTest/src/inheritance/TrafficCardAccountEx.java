package inheritance;

public class TrafficCardAccountEx {
	public static void main(String[] args) {
		TrafficCardAccount traffic = new TrafficCardAccount("122-12", 10000, "홍길동", 
				"122-12-133", true);

		System.out.println("현재잔액 : " + traffic.payTraffic("122-12-133", 1000));

	}
}
