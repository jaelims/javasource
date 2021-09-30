package inheritance;

public class TV2 {
	// 속성(필드,멤버변수,프로퍼티) => 색상,전원상태,채널....
	private String color; // red,blue,black....
	private boolean power;	// on, off
	private int channel;
	
//	public TV2() {
//		super();
//	}
	
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	// 동작(메소드) => 채널 변경(증가,감소)하다/전원을 켜다/끄다
	void channelUp() {
		// channelUp 가 해야 하는 작업 작성
		channel++;
	}
	void channelDown() {
		// channelDown 가 해야 하는 작업 작성
		channel--;
	}
	void power() {
		// power 가 해야 하는 작업 on => off, off => on
		power = !power;
	}

	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	}
	
	
	
}
