package gui.quiz.gugudan;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GugudanFrame extends JFrame {
// 초기값
	final int GUGUDAN_SIZE;
	int dan = 2;
// 이 프레임에 사용되는 하위 컴포넌트 및 해당 컴포넌트의 설정
	List<JLabel> gugudanLabels = new ArrayList<>();
	Font gugudanLabelFont = new Font("consolas", Font.PLAIN, 25);
	JPanel topPanel = new JPanel(new GridLayout(9, 1));
	JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
// 필요한 경우 이 프레임의 하위 컴포넌트에서 현재 컴포넌트의 모든것을 알 수 있도록 
// 데이터를 전달해 주는 것이 편하다
	JButton prevBtn = new PrevButton(this);
	JButton nextBtn = new NextButton(this);
// 이벤트 모음 (인스턴스 변수로 만듦)
	ActionListener gugudanButtonAction;

	public GugudanFrame() {
		this(9);
	}

	public GugudanFrame(int size) {
		GUGUDAN_SIZE = size;
// 레이아웃 설정
		setLayout(new BorderLayout());
// 이벤트 초기화 (생성자로부터 전달된 값을 사용하기 위해)
		gugudanButtonAction = new GugudanButtonActionListener(this);
		Container pane = getContentPane();
		for (int i = 0; i < 9; ++i) {
			JLabel gugudanLabel = new JLabel();
			int gop = i + 1;
			gugudanLabel.setText(String.format("2 x %d = %d", gop, 2 * gop));
			gugudanLabel.setFont(gugudanLabelFont);
			gugudanLabels.add(gugudanLabel);
			topPanel.add(gugudanLabel);
		}
		add(topPanel, "Center");
		add(bottomPanel, "South");
		bottomPanel.add(prevBtn);
		bottomPanel.add(nextBtn);
// 컴포넌트에 이벤트 부착 (모든 컴포넌트들을 초기화 한 맨 마지막에 붙이는 것이 좋다
		prevBtn.addActionListener(gugudanButtonAction);
		nextBtn.addActionListener(gugudanButtonAction);
// 프레임 설정
		setTitle("구구단!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GugudanFrame(19);
	}
}