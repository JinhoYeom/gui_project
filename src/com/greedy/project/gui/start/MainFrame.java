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
	this.setTitle("짱구의 하루");
	try {
		this.setIconImage(ImageIO.read(new File("images/icon.PNG")));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
    /* JPanel 생성 */
    JPanel panel = new JPanel(null);
    panel.setLayout(null);
	
	/* 배경화면 이미지 */
	JLabel background = new JLabel(new ImageIcon("images/background/Start-bg.PNG"));
	background.setBounds(0, 0, 750, 630);
	
	/* 짱구의 하루 라벨 */
	JLabel logo = new JLabel(new ImageIcon("images/ui/Start_logo.PNG"));
	logo.setBounds(0, 30, 750, 150);
	logo.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬
	
	/* 시작하기 버튼 */
	JButton b1 = new JButton(new ImageIcon("images/button/Start_startbt.PNG"));
	b1.setBounds(190, 370, 360, 60);
	
	/* 종료하기 버튼 */
	JButton b2 = new JButton(new ImageIcon("images/button/Start_quitbt.PNG"));
	b2.setBounds(190, 450, 360, 60);
	
	/* 짱구 그림 */
	JLabel picture = new JLabel(new ImageIcon("images/ui/Start_짱구.PNG"));
	picture.setBounds(20, 280, 160, 250);
	
	/* 패널에 컴포넌트 추가 */
    panel.add(b1);
    panel.add(b2);
    panel.add(picture);
    panel.add(logo);
    panel.add(background);


    /* 패널을 프레임에 추가 */
    this.getContentPane().add(panel);
    
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

