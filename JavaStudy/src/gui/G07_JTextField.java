package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class G07_JTextField extends JFrame{
		
	public G07_JTextField() {
		super("JTextField Sample");
		
		setLayout(null);
		
		JLabel label = new JLabel("취미: ");
		
		label.setBounds(50, 100, 50, 30);
		
		JTextField tf = new JTextField(30);
		
		tf.setLocation(100, 100);
		tf.setSize(200, 30);
		
		// JTextField의 액션 리스너는
		// 텍스트 필드가 선택된 채로 엔터키를 눌렀을때 발동한다
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트 발생시 ActionEvent에 필요한 정보들이 함께 넘어온다
				// (이벤트 발생 당시의 여러 정보들)
				System.out.println("이벤트를 발생시킨 컴포넌트: " + e.getSource());
				System.out.println("이벤트 발생 시간: " + new Date(e.getWhen()));
				System.out.println("이벤트 발생당시 텍스트필드 값: " + e.getActionCommand());
				
			}
		});
		
		// 키보드가 눌렸을 때 발생하는 이벤트에 대한 처리
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// 입력이 있을 때 (ctrl, alt, shift등 입력이 없을때는 발동하지 않음)
				// 한글은 2번 누를때 1글자 입력될때도 있고 3번 누를때 입력될 때도 있기 때문에
				// 여기에서만 걸린다..
				// System.out.println("Typed");
				System.out.println(e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// 키보드에서 손을 뗐을 때
				// System.out.println("손을 뗌!");
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// 키가 눌렸을 때 (ctrl, alt, shift 등 에도 발동함)
				// System.out.println("꾹 누르고 있음!");
				System.out.println("KeyChar: " + e.getKeyChar());
				System.out.println("KeyCode: " + e.getKeyCode());
				
				switch (e.getKeyCode()) {
					case KeyEvent.VK_SPACE:
						System.out.println("스페이스가 눌렸습니다!");
						break;
					case KeyEvent.VK_SHIFT:
						System.out.println("쉬프트키가 눌렸습니다!");
				}
			}	
		});
		
		add(label);
		add(tf);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new G07_JTextField();
	}

}
