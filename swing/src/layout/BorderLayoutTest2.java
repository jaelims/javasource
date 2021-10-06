package layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

//상,하,좌,우,가운데
//BorderLayout.EAST
//BorderLayout.WEST
//BorderLayout.CENTER
//BorderLayout.NORTH
//BorderLayout.SOUTH

public class BorderLayoutTest2 extends JFrame{
	
	public BorderLayoutTest2() {
		setTitle("BorderLayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 기본 레이아웃 BorderLayout
		Container container = getContentPane();
		container.setLayout(new BorderLayout(30, 20));
		
		JButton btn1 = new JButton("버튼1");
		add(btn1,BorderLayout.EAST);
		
		JButton btn2 = new JButton("버튼2");
		add(btn2,BorderLayout.WEST);
		
		JButton btn3 = new JButton("버튼3");
		add(btn3,BorderLayout.CENTER);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4,BorderLayout.NORTH);
		
		JButton btn5 = new JButton("버튼5");
		add(btn5,BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderLayoutTest2 f = new BorderLayoutTest2();
	}
}
