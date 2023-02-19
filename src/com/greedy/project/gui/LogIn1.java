package com.greedy.project.gui;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LogIn1 extends JFrame{

			public LogIn1() {
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
			
			/* 로그인 라벨 */
			JLabel logo2 = new JLabel(new ImageIcon("images/label/login1.PNG"));
			logo2.setBounds(60, 60, 650, 500);
			logo2.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬
			
			/* 나가기 버튼 */
			JButton b1 = new JButton(new ImageIcon("images/button/login_outbt1.PNG"));
			b1.setBounds(80, 450, 200, 55);
			
			/* 확인 버튼 */
			JButton b2 = new JButton(new ImageIcon("images/button/login_inbt1.PNG"));
			b2.setBounds(290, 450, 200, 55);
			
			/* 회원가입 버튼 */
			JButton b3 = new JButton(new ImageIcon("images/button/login_registbt.PNG"));
			b3
			.setBounds(500, 450, 200, 55);
			
			/* 패널에 컴포넌트 추가 */
			panel.add(logo2);		//짱구의 하루 라벨
		    panel.add(logo);		//배경화면
		    panel.add(background);	//배경화면
		    panel.add(b1);			//나가기
		    panel.add(b2);			//확인
		    panel.add(b3);			//회원가입

		    /* 패널을 프레임에 추가 */
		    this.getContentPane().add(panel);
		    
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		}
