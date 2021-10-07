package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class KeyPad extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton[] buttons = new JButton[9];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyPad frame = new KeyPad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KeyPad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		// 패널에 버튼 9개 부탁
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton((i+1)+"");
			// 버튼 font 변경
			buttons[i].setFont(new Font("굴림", Font.PLAIN, 30));
			// 액션리스너
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
//		JButton key1 = new JButton("1");
//		key1.addActionListener(this);
//		key1.setFont(new Font("굴림", Font.PLAIN, 30));
//		panel.add(key1);
//		
//		JButton key2 = new JButton("2");
//		key2.addActionListener(this);
//		key2.setFont(new Font("굴림", Font.PLAIN, 30));
//		panel.add(key2);
//		
//		JButton key3 = new JButton("3");
//		key3.addActionListener(this);
//		key3.setFont(new Font("굴림", Font.PLAIN, 30));
//		panel.add(key3);
//		
//		JButton key4 = new JButton("4");
//		key4.addActionListener(this);
//		key4.setFont(new Font("굴림", Font.PLAIN, 30));
//		panel.add(key4);
//		
//		JButton key5 = new JButton("5");
//		key5.addActionListener(this);
//		key5.setFont(new Font("굴림", Font.PLAIN, 30));
//		panel.add(key5);
//		
//		JButton key6 = new JButton("6");
//		key6.addActionListener(this);
//		key6.setFont(new Font("굴림", Font.PLAIN, 30));
//		panel.add(key6);
//		
//		JButton key7 = new JButton("7");
//		key7.addActionListener(this);
//		key7.setFont(new Font("굴림", Font.PLAIN, 30));
//		panel.add(key7);
//		
//		JButton key8 = new JButton("8");
//		key8.addActionListener(this);
//		key8.setFont(new Font("굴림", Font.PLAIN, 30));
//		panel.add(key8);
//		
//		JButton key9 = new JButton("9");
//		key9.addActionListener(this);
//		key9.setFont(new Font("굴림", Font.PLAIN, 30));
//		panel.add(key9);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼이 클릭되면
		// 눌러진 버튼의 숫자 가져오기
		String cmd = e.getActionCommand();
		// 가져온 숫자를 textField 보여주기
		textField.setText(textField.getText()+cmd);
		
	}

}
