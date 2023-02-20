package com.greedy.project.gui.start;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

	public MainFrame() {
	this.setBounds(300, 200, 750, 650);
	this.setResizable(false);
	this.setTitle("HDplz");
	try {
		this.setIconImage(ImageIO.read(new File("images/icon.PNG")));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
    /* JPanel 생성 */
    JPanel panel = new JPanel(null);
    panel.setLayout(null);
	
	/* 배경화면 이미지 */
	JLabel background = new JLabel(new ImageIcon("images/background/Start.PNG"));
	background.setBounds(0, 0, 750, 650);
	
	/* 짱구의 하루 라벨 */
	JLabel logo = new JLabel(new ImageIcon("images/logo/Start_logo.PNG"));
	logo.setBounds(0, 30, 750, 150);
	logo.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬
	
	/* 시작하기 버튼 */
	JButton b1 = new JButton(new ImageIcon("images/button/Start_startbutton.PNG"));
	b1.setBounds(150, 350, 450, 70);
	
	/* 종료하기 버튼 */
	JButton b2 = new JButton(new ImageIcon("images/button/Start_quitbutton.PNG"));
	b2.setBounds(150, 450, 450, 70);
	
	/* 패널에 컴포넌트 추가 */
    panel.add(logo);
    panel.add(background);
    panel.add(b1);
    panel.add(b2);

    /* 패널을 프레임에 추가 */
    this.getContentPane().add(panel);
    
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

