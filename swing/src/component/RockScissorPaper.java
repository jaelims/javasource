package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {
	
	private JTextField textField;
	private JButton btnRock, btnPaper, btnScissor;
	
	static final int SCISSOR = 0;
	static final int ROCK = 1;
	static final int PAPER = 2;
	
	public RockScissorPaper() {
		setTitle("가위바위보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//현재 contentPane 가져오기
		Container contentPane = getContentPane();
		
		// 상단 메시지 출력
		JLabel label = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(label, BorderLayout.NORTH); //add(label, BorderLayout.NORTH);
		
		// 가운데 이미지 출력
		// JPanel 을 Center에 부착 => JPanel 을 GridLayout 변경 => 버튼 3개 부착
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		
		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/rock.png")));
		btnRock.setActionCommand("rock");
		btnRock.addActionListener(this);
		panel.add(btnRock);
		
		btnPaper = new JButton();
		btnPaper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/paper.png")));
		btnPaper.setActionCommand("paper");
		btnPaper.addActionListener(this);
		panel.add(btnPaper);
		
		btnScissor = new JButton();
		btnScissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/scissor.png")));
		btnScissor.setActionCommand("scissor");
		btnScissor.addActionListener(this);
		panel.add(btnScissor);
		
		contentPane.add(panel, BorderLayout.CENTER);
		
		// 하단 결과 출력
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(textField, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new RockScissorPaper();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 게임자가 누른 가위,바위,보 가져오기
		String cmd = e.getActionCommand();
		
		// 컴퓨터의 가위, 바위, 보 결정
		int com = (int) (Math.random()*3); // 0,1,2
		// 0 = 가위, 1 = 바위, 보 = 2
		// 컴퓨터와 게임자 사이에서 누가 이겼는지 출력
		switch (com) {
		case SCISSOR:
			if (cmd.equals("rock")) {
				textField.setText("당신이 이겼습니다.");
			} else if (cmd.equals("paper")) {
				textField.setText("컴퓨터가 이겼습니다.");
			} else
				textField.setText("비겼습니다.");
			break;
		case ROCK:
			if (cmd.equals("rock")) {
				textField.setText("비겼습니다.");
			} else if (cmd.equals("paper")) {
				textField.setText("당신이 이겼습니다.");
			} else
				textField.setText("컴퓨터가 이겼습니다.");
			break;
		case PAPER:
			if (cmd.equals("rock")) {
				textField.setText("컴퓨터가 이겼습니다.");
			} else if (cmd.equals("paper")) {
				textField.setText("비겼습니다.");
			} else
				textField.setText("당신이 이겼습니다.");
	break;
		default:
			break;
		}
	}

}
