package event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Field;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// KeyListener
// KeyEvent�� �����ϴ� ������
// KeyEvent �� ��Ŀ���� ���� ������Ʈ������ �߻�
// keyPressed() : Ű�� ������ ���� �߻�
//             keyTyped() : ���� Ű�� �������� ���� ȣ��(��, �����ڵ��� ��츸 ȣ��)
// keyReleased() : ���� Ű�� ���� ���� ȣ��

public class KeyEventTest2 extends JFrame{
	
	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;	
	
	
	public KeyEventTest2() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		
		panel.add(new JLabel("���ڸ� �Է��ϼ��� "));
		
		textField = new JTextField(10);
		textField.addKeyListener(new MyKeyListener());
		panel.add(textField);
		
		textArea = new JTextArea(3, 30);
		
		getContentPane().add(panel,BorderLayout.NORTH);
		getContentPane().add(textArea,BorderLayout.CENTER);
		
		setTitle("Ű �̺�Ʈ");
		setSize(400,200);
		setVisible(true);
	}
	
	protected void display(KeyEvent e, String str) {
		char keyChar = e.getKeyChar(); //���� ������ Ű ���ڰ�
		int keyCode = e.getKeyCode(); // ���� ������ Ű �ڵ尪
		
		// textArea.setText(t);
		
		String modifiers = "Alt : "+e.isAltDown()+" Ctrl : "+e.isControlDown()
					+" Shift : "+e.isShiftDown();
		textArea.append(str+" ���� : "+keyChar+" (�ڵ� : "+keyCode+") "+modifiers+"\n");
	}	

	public static void main(String[] args) {
		new KeyEventTest2();
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			display(e, "keyPressed : ");
		}
	}

}
















