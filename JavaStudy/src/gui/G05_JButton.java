package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


// Swing 컴포넌트들은 상속을 통한 구현이 가능하다
public class G05_JButton extends JFrame {

	public G05_JButton() {
		setLayout(null);

		// ContentPane : 프레임 내에서 실제로 내용이 그려지는 곳
		getContentPane().setBackground(Color.BLACK);

		JButton btn1 = new JButton("Button1");

		// 여러가지 버튼 설정들
		btn1.setText("Changed Text...");
		btn1.setBounds(100, 100, 300, 70);
		// 글씨색 설정
		btn1.setForeground(new Color(161, 198, 255));
		// 배경색 설정
		btn1.setBackground(Color.WHITE);
		// btn1.setEnabled(false);

		// 버튼을 눌렀을 때의 동작을 설정
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.ORANGE);

			}
		});

		add(btn1);
		add(new MyButton(100, 200, this));
		add(new MyButton(100, 300, this));

		setTitle("JButton Examples...");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100, 100);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new G05_JButton();
	}
}

class MyActionListener implements ActionListener {

	JFrame parent;

	public MyActionListener(JFrame parent) {
		this.parent = parent;
	}

	public void actionPerformed(ActionEvent e) {
		parent.getContentPane().setBackground(Color.BLACK);
	}
}

class MyButton extends JButton implements ActionListener {
	JFrame parent;
	
	public MyButton(int x, int y, JFrame parent) {
		super("MyButton");
		
		this.parent = parent;

		setBounds(x, y, 300, 70);
		setBackground(new Color(161, 198, 255));
		setForeground(new Color(0, 0, 0));
//		addActionListener(new MyActionListener(parent));
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		parent.getContentPane().setBackground(Color.PINK);
		
	}

}

