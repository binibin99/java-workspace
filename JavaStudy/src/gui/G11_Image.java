package gui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class G11_Image {
	
	// 해당 컴포넌트의 이미지를 setIcon 메서드로 교체할 수 있다
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Image Samples");
		
		f.setLayout(new BorderLayout());
		
		JLabel imageLabel = new JLabel("image.");
		
		
		// 라벨 이미지 설정하기
//		imageLabel.setIcon(new ImageIcon("myimages/다운로드.jpg"));
		
		// 1. 이미지의 크기를 수정하기 위해 불러온다
		try {
			BufferedImage bufferedImage =
			ImageIO.read(new File("myimages/apple.jpg"));
			
			// 2. 불러온 이미지로부터 사이즈 조절된 새로운 인스턴스를 받을 수 있다
			// Image ScaleImage =
			// bufferedImage.getScaledInstance(200 , 200, Image.SCALE_SMOOTH);
			
			// 2-1 이미지의 일부를 잘라서 활용하는 방법도 있다
			// Image subImage = bufferedImage.getSubimage(100, 100, 150, 150);
			
			// 3. 크기 조절된 이미지를 라벨에 붙인다
			imageLabel.setIcon(new ImageIcon(bufferedImage));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// 연습: 다음 버튼을 누르면 이미지가 교체되도록 만들어보세요 (순환 될것)
		JButton southBtn = new JButton("다음!");

		
		f.add(imageLabel, "Center");
		f.add(southBtn, "South");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		
	}
}
