package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class G10_CardLayout {
	
	/*
	 	다음 카드로 넘기듯이 컴포넌트를 넘기면서 보여줄 수 있는 레이아웃
	 	ex: 설치 프로그램
	 */
	public static void main(String[] args) {
		JFrame f = new JFrame("CardLayout Sample");
		
		CardLayout card = new CardLayout();
		
		f.setLayout(card);
		
		JPanel panel1 = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new GridLayout(3,3));
		JPanel panel3 = new JPanel(null);
		
		JButton panel1NextBtn = new JButton("다음");
		panel1NextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 카드 레이아웃을 조정하기 위해서는 해당 카드 레이아웃을
				// 부모 컨테이너를 전달해줘야한다
				card.next(f.getContentPane());
			}
		
		});
		
			
		panel1.add(panel1NextBtn, "South");
		
		for (int i = 0; i < 9; ++i) {
			JButton btn = new JButton("Button" + i);
			
			if (i == 4) {
				btn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						card.next(f.getContentPane());
					}
				});
			}
			
			panel2.add(btn);
		}
		
		JButton panel3PrevBtn = new JButton("Prev");
		JButton panel3Page1Btn = new JButton("Page1");
		JButton panel3Page2Btn = new JButton("Page2");
		JButton panel3nextBtn = new JButton("Next");
		
		panel3PrevBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(f.getContentPane());
				
			}
		});
		
		panel3Page1Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// show를 사용하기 위해서는
				// 카드 레이아웃에 컴포넌트를 추가할 때 이름 설정이 필요하다
				card.show(f.getContentPane(), "apple");
				
			}
		});
		
		panel3PrevBtn.setBounds(30, 200 , 80, 50);
		panel3Page1Btn.setBounds(150, 200, 80, 50);
		panel3Page2Btn.setBounds(270, 200 , 80, 50);
		panel3nextBtn.setBounds(390, 200 , 80, 50);
		
		panel3.add(panel3PrevBtn);
		panel3.add(panel3Page1Btn);
		panel3.add(panel3Page2Btn);
		panel3.add(panel3nextBtn);
		
		// 카드 레이아웃에 컴포넌트를 추가할 때 이름 설정을 해두면 좋다.
		f.add("apple", panel1);
		f.add("banana", panel2);
		f.add("orange", panel3);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
	}

}
