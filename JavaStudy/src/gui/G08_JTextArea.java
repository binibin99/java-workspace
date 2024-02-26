package gui;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class G08_JTextArea extends JFrame {
	
	// 텍스트 필드보다 더 많은 양의 텍스트를 입력할 때 사용하는 컴포넌트
	
	public G08_JTextArea() {
		super("JTextField sample");
		setLayout(null);
		
		JTextArea ta = new JTextArea();
		
		ta.setBounds(100, 100, 300, 300);
		
		// 테두리 설정
		ta.setBorder(BorderFactory.createLineBorder(Color.gray));
		
		
		// 키보드 이벤트 설정
		// KeyListener 자리에 KeyAdapter를 사용하면
		// 여러 이벤트를 중 원하는 이벤트 메서드만 오버라이드 할 수 있다
		ta.addKeyListener(new KeyAdapter() {		
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
			}
		});
		
		add(ta);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new G07_JTextField();
	}


	
}
