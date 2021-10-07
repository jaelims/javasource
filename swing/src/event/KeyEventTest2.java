package event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// KeyListener
// KeyEvent를 감지하는 리스너
// KeyEvent는 포커스를 가진 컴포넌트에서만 발생
// KeyPressed() : 키를 누르는 순간 발생
// 			KeyTyped() : 누른 키가 떼어지는 순간 호출(단, 유니코드인 경우만 호출)
// KeyReleased() : 누른 키를 떼는 순간 호출

public class KeyEventTest2 extends JFrame {

	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;
	
	
	public KeyEventTest2() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		
		panel.add(new JLabel("문자를 입력하세요 "));
		
		textField = new JTextField(10);
		textField.addKeyListener(new MyKeyListener());
		panel.add(textField);
		
		textArea = new JTextArea(3,30);
		
		getContentPane().add(panel,BorderLayout.NORTH);
		getContentPane().add(textArea,BorderLayout.CENTER);
		
		setTitle("키 이벤트");
		setSize(400,200);
		setVisible(true);
	}
	
	protected void display(KeyEvent e, String str) {
		char keyChar = e.getKeyChar(); // 현재 눌러진 키 문자값
		int keyCode = e.getKeyCode(); // 현재 눌러진 키 코드값
		
		// textArea.setText(t);
		
		String modifiers = "Alt : " + e.isAltDown() + " Ctrl : " + e.isControlDown()
							+ " Shift : " + e.isShiftDown();
		textArea.append(str + " 문자 : " + keyChar + " (코드 : " + keyCode + ") " + modifiers + "\n");
	}

	public static void main(String[] args) {
		new KeyEventTest2();
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			display(e, "KeyTyped : ");
		}
	}

}
