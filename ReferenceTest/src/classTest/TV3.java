package classTest;

public class TV3 {	
	
	private String color; 
	private boolean power;    
	private int channel;
	
	//생성자
	TV3(){
		//default(기본) 생성자
		//명시적으로 생성자가 하나도 선언되지 않았다면 컴파일러가 자동으로 만들어냄
	}
	TV3(String color,int channel){
		this.color = color;
		this.channel = channel;
	}	
	public TV3(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
		
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	// 동작(메소드) => 채널 변경(증가,감소)하다/전원을 켜다/끄다
	void channelUp() {
		//channelUp 가 해야 하는 작업 작성 현재 채널 7 => 8,9,10....
		channel++;		
	}
	void channelDown() {
		//channelDown 이 해야 하는 작업 작성 현재 채널 7 => 6,5,4....
		channel--;
	}
	
	void power() {
		//power가 해야 하는 작업 on => off,  off => on
		power = !power;
	}
	
}




