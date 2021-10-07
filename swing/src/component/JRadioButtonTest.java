package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JRadioButtonTest extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButtonTest frame = new JRadioButtonTest();
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
	public JRadioButtonTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("선택한 애완동물은?");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdo1 = new JRadioButton("고양이");
		rdo1.addItemListener(this);
		contentPane.add(rdo1);
		
		JRadioButton rdo2 = new JRadioButton("강아지");
		rdo2.addItemListener(this);
		contentPane.add(rdo2);
		
		JRadioButton rdo3 = new JRadioButton("햄스터");
		rdo3.addItemListener(this);
		contentPane.add(rdo3);
		
		JRadioButton rdo4 = new JRadioButton("토끼");
		rdo4.addItemListener(this);
		contentPane.add(rdo4);
		
		JRadioButton rdo5 = new JRadioButton("고슴도치");
		rdo5.addItemListener(this);
		contentPane.add(rdo5);
		
		
		// 여러개 중에 하나만 선택
		ButtonGroup group = new ButtonGroup();
		group.add(rdo1);
		group.add(rdo2);
		group.add(rdo3);
		group.add(rdo4);
		group.add(rdo5);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		//System.out.println(e.getSource());
		//System.out.println(e.getItem());
		
		JRadioButton radio = (JRadioButton) e.getItem();
		textField.setText(radio.getText());
		
	}

}
