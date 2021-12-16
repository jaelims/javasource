package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalc extends JFrame implements ActionListener {
	
	private JTextField num1,num2,result;	
	
	public SimpleCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� ����");
		
		//��� ���� �г� ����
		JPanel top = new JPanel();
		
		//���ڸ� �Է��ϰ� ����� ����� �ؽ�Ʈ�ʵ� ����
		num1 = new JTextField(10);
		top.add(num1);
		
		JLabel op = new JLabel("+");
		top.add(op);
		
		num2 = new JTextField(10);
		top.add(num2);
		
		JLabel op2 = new JLabel("=");
		top.add(op2);
		
		result = new JTextField(10);
		top.add(result);
			
		
		add(top,BorderLayout.NORTH);
		
		
		//�ϴ� ���� �г� ����
		JPanel bottom = new JPanel();
		
		
		//��ư 2�� ���� �� add
		JButton btnOk = new JButton("Ȯ��");
		btnOk.addActionListener(this);
		
		JButton btnReset = new JButton("���");
		btnReset.addActionListener(this);
		
		bottom.add(btnOk);
		bottom.add(btnReset);
		
		
		add(bottom,BorderLayout.CENTER);	
		
		setSize(450, 150);
		setVisible(true);
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd=e.getActionCommand();
		if(cmd.equals("Ȯ��")) {
			//Ȯ�� ��ư Ŭ��
			//num1, num2 �� ��� �ִ� �� ��������
		
			try {
				// Integer.parseInt("") => NumberFormatException
				int op1=Integer.parseInt(num1.getText());  //  "5" + "7" => "57"
				int op2=Integer.parseInt(num2.getText());  
				
				//������ ���ڸ� ����
				int total = op1 + op2;
				
				//����� result �����ֱ�  11  => "11"
				//result.setText(total+""); 
				result.setText(String.valueOf(total));				
				
			} catch (Exception e2) {
				//�����Ҷ� ���� �߻� �ܰ踦 ���
				//e2.printStackTrace();
				
				//����ڿ��� �޽��� ���
				JOptionPane.showMessageDialog(getParent(), "�Է°��� Ȯ���� �ּ���");
			}
			
			
			
		}else {
			//��� ��ư Ŭ��
			//num1, num2, result �� ����ִ� �� �����	
			num1.setText("");
			num2.setText("");
			result.setText("");
		}
	}

	public static void main(String[] args) {
		new SimpleCalc();
	}
}




