package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class PlusCal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlusCal frame = new PlusCal();
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
	public PlusCal() {
		setTitle("덧셈 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		num1 = new JTextField();
		panel.add(num1);
		num1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		panel.add(lblNewLabel);
		
		num2 = new JTextField();
		panel.add(num2);
		num2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		panel.add(lblNewLabel_1);
		
		result = new JTextField();
		panel.add(result);
		result.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btn1 = new JButton("확인");
		btn1.addActionListener(this);
		panel_1.add(btn1);
		
		JButton btn2 = new JButton("취소");
		btn2.addActionListener(this);
		panel_1.add(btn2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if(cmd.equals("확인")) {
		// 확인 버튼 클릭
		// num1, num2에 들어 있는 값 가져오기
			int op1 = Integer.parseInt(num1.getText());
			int op2 = Integer.parseInt(num2.getText());
			
		// 가져온 숫자를 덧셈
			int total = op1 + op2;
			
		// 결과를 result 보여주기
		// result.setText(total+"");
		result.setText(String.valueOf(total));
		
		} else {
		// 취소 버튼 클릭
		// num1, num2, result 에 들어있는 값 지우기
			num1.setText("");
			num2.setText("");
			result.setText("");
		}
	}

}
