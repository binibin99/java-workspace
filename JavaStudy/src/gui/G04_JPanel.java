package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class G04_JPanel {
	
	/*
	  	# JPanel
	  	
	  	- 컨테이너 역할을 하는 컴포넌트
	 	- 컨테이너이기 때문에 레이아웃 설정이 가능하고 위에 다른 컴포넌트를 붙일 수 있다
	 	- 컴포넌트이기 때문에 다른 컨테이너 위에 붙일 수 있다
	 	- 레이아웃 위에 다른 레이아웃을 설정할 때 사용한다
	 */
	public static void main(String[] args) {
		
		JFrame f = new JFrame("JPanel Sample");
		
		f.setLayout(new GridLayout(2, 2));
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		
		// 메인 프레임에 3번째로 추가할 패널의 레이아웃을 보더로 설정
		panel.setLayout(new BorderLayout());
		panel2.setLayout(new GridLayout(3,3));
		
		for (int i = 0; i < 9; ++i) {
			panel2.add(new JButton("" + i));
		}
		
		panel.add(new JButton("sub-button1"), "East");
		panel.add(new JButton("sub-button2"), "West");
		panel.add(new JButton("sub-button3"), "South");
		panel.add(new JButton("sub-button4"), "North");
		panel.add(panel2,"Center");
		
		
		f.add(new JButton("Button1"));
		f.add(new JButton("Button2"));
		f.add(panel);
		f.add(new JButton("Button4"));
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
	}

}
