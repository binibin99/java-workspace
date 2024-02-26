package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G03_GridLayout {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("GridLayout Sample");
		
		// 행과 열을 설정한 후 컴포넌트를 순서대로 붙이는 방식의 레이아웃
		GridLayout gl = new GridLayout(5, 3);
		
		gl.setHgap(15);
		gl.setVgap(30);
		
		f.setLayout(gl);
		
		for (int i = 0; i < 13; ++i) {
			f.add(new JButton("Button" + i));
		}
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
	}

}
