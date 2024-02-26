package quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test extends JFrame {
	
	JPanel main_panel;
	
	JComboBox<String> cbb_email;
	
	JLabel lb_print;
	
	JTextField tf_username;
	
	public Test() {
		
		setTitle("JComboBox");  // 프레임 타이틀바 텍스트
		setSize(400,200); // 프레임 크기 조절 (픽셀)
		// 프레임바 우측상단에 x버튼에 대한 강제종료 기능 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel = new JPanel();
		main_panel.setLayout(null);
		
		
		cbb_email = new JComboBox();
		cbb_email.setModel(new DefaultComboBoxModel(new String[] { "naver.com" , " daum.net" , "gmail.com"}));
		lb_print = new JLabel("아앙기모: ");
		
		tf_username = new JTextField();
		tf_username.setBounds(10, 50, 300, 25);
		
		cbb_email.setBounds(10, 10, 70, 25);
		lb_print.setBounds(100, 7, 200, 35);
		
		main_panel.add(cbb_email);
		main_panel.add(lb_print);
		add(main_panel);
		
		cbb_email.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String email = cbb_email.getSelectedItem().toString();
			lb_print.setText("이메일: " + email);
		
				
			}
		});
		
	
		setVisible(true); // 프레임 보이게하기
	}
	
	public static void main(String[] args) {
		new Test();
	}
	
}