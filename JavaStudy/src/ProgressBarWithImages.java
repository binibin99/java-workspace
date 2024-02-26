
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class ProgressBarWithImages extends JFrame {
    private static final long serialVersionUID = 1L;
    private JProgressBar progressBar;
    private Timer timer;
    private int progressValue;
    private JLabel imageLabel;

    private String[] imagePaths = {
            "C:\\Users\\Gi7E-36\\Desktop\\apple.jpg",
            "C:\\Users\\Gi7E-36\\Desktop\\banana.jpg",
            "C:\\Users\\Gi7E-36\\Desktop\\peach.jpg",
            "C:\\Users\\Gi7E-36\\Desktop\\strawberry.jpg",
            "C:\\Users\\Gi7E-36\\Desktop\\good.jpg"
            // Add more image paths as needed
    };

    public ProgressBarWithImages() {
        setTitle("Progress Bar with Images");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        imageLabel = new JLabel();
        add(progressBar, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (progressValue < 100) {
                    progressValue++;
                    progressBar.setValue(progressValue);

                    // Change image at specific progress value
                    if (progressValue % 25 == 0) {
                        updateImage();
                    }
                } else {
                    timer.stop();
                    JOptionPane.showMessageDialog(ProgressBarWithImages.this, "프로그램 진행 완료!");
                }
            }
        });
    }

    private void updateImage() {
        if (progressValue <= 0) {
            imageLabel.setIcon(new ImageIcon(imagePaths[0]));
        } else if (progressValue <= 25) {
            imageLabel.setIcon(new ImageIcon(imagePaths[1]));
        } else if (progressValue <= 50) {
            imageLabel.setIcon(new ImageIcon(imagePaths[2]));
        } else if (progressValue <= 75) {
            imageLabel.setIcon(new ImageIcon(imagePaths[3]));
        } else if (progressValue <= 100) {
            imageLabel.setIcon(new ImageIcon(imagePaths[4]));
        }
        // Add more conditions as needed for additional images
    }

    public void startProgressBar() {
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProgressBarWithImages progressBarWithImages = new ProgressBarWithImages();
                progressBarWithImages.setVisible(true);
                progressBarWithImages.startProgressBar();
            }
        });
    }
}