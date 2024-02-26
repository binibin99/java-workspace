package gui;

import java.awt.GridLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class G09_JPasswordField extends JFrame {

	public G09_JPasswordField() {
	super("JTextArea Sample");
	setLayout(new GridLayout(2, 2));
	
	JLabel idLabel = new JLabel("ID:");
	JTextField idField = new JTextField();
	
	// 비밀번호를 텍스트 필드로 하게되면 옆사람에게 다 보인다
	JLabel pwLabel = new JLabel("PW:");
	JPasswordField pwField =new JPasswordField();
	// JTextField pwField = new JTextField();
	
	add(idLabel);
	add(idField);
	
	add(pwLabel);
	add(pwField);
	
	this.addComponentListener(new ComponentListener() {
		
		@Override
		public void componentShown(ComponentEvent e) {
		
			
			
		}
		
		@Override
		public void componentResized(ComponentEvent e) {
			System.out.println(
					"width: " + e.getComponent().getWidth() +
					", height:" + e.getComponent().getHeight());
			
			
		}
		
		@Override
		public void componentMoved(ComponentEvent e) {
			//System.out.println(e.getComponent());
			System.out.println(
					"X: " + e.getComponent().getX() +
					"Y: " + e.getComponent().getY());
			
			
		}
		
		@Override
		public void componentHidden(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(100, 100, 250, 80);
	setVisible(true);
	}

	public static void main(String[] args) {
		new G09_JPasswordField();
	}

}
