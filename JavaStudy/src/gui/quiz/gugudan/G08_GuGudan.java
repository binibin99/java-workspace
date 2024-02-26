package gui.quiz.gugudan;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class G08_GuGudan extends JFrame {
	
	/*
	  	# 실행하면 구구단이 출력되는 GUI 프로그램을 만들어보세요
	  	
	  	(1) 프로그램을 처음 시작하면 구구단 2단이 출력된 상태로 시작
	  	
	  	(2) + 버튼을 누르면 단이 증가하며 구구단 내용이 바뀜 (최대 9단 까지)
	  	
	  	(3) - 버튼을 누르면 단이 감소하며 구구단 내용이 바뀜 (최소 2단 까지) 
	 */
	public G08_GuGudan() {
		super("구구단이다");
		JFrame f = new JFrame("JPanel Sample");
		JPanel panel = new JPanel();
		
		JButton btn1 = new JButton();
		btn1.setText("+");
		btn1.setBounds(100, 100, 50, 70);
		panel.add(btn1, "East");
		JButton btn2 = new JButton();
		
		btn2.setBounds(100, 100, 50, 70);
		btn2.setText("-");
		add(btn1);
		add(btn2);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new G08_GuGudan();
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


