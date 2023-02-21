package com.greedy.project.gui.login;

import java.awt.TextField;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Regist extends JFrame {
	
	public Regist() {
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
	JLabel background = new JLabel(new ImageIcon("images/background/Start-bg.PNG"));
	background.setBounds(0, 0, 750, 630);
	
	/* 짱구의 하루 라벨 */
	JLabel logo = new JLabel(new ImageIcon("images/ui/Start_logo.PNG"));
	logo.setBounds(0, 30, 750, 150);
	logo.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬
	
	/* 회원가입 창 */
	JLabel regist = new JLabel(new ImageIcon("images/ui/login-regist.PNG"));
	regist.setBounds(40, 60, 650, 500);
	regist.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬
	
	/* 나가기 버튼 */
	JButton b1 = new JButton(new ImageIcon("images/button/login-registout.PNG"));
	b1.setBounds(150, 450, 160, 55);

	/* 회원가입 버튼 */
	JButton b2 = new JButton(new ImageIcon("images/button/login_registbt.PNG"));
	b2.setBounds(420, 450, 160, 55);
	
	/* 아이디 입력 */
	TextField idtext = new TextField();
	idtext.setBounds(220, 200, 450, 45);
	
	/* 비밀번호 입력 */
	TextField pwdtext = new TextField();
	pwdtext.setBounds(220, 275, 450, 45);
	
	/* 닉네임 입력 */
	TextField nametext = new TextField();
	nametext.setBounds(220, 350, 450, 45);
	
	/* 짱구 그림 */
	JLabel picture = new JLabel(new ImageIcon("images/ui/Start_짱구.PNG"));
	picture.setBounds(20, 280, 160, 250);
	
	
	
	/* 패널에 컴포넌트 추가 */
	panel.add(b1);			//나가기
	panel.add(b2);			//가입하기
    panel.add(idtext);		//아이디 텍스트
    panel.add(pwdtext);		//비밀번호 텍스트
    panel.add(nametext);	//닉네임 텍스트
	panel.add(regist);		//회원가입 창
    panel.add(logo);		//짱구의 하루 라벨
    panel.add(picture);		//짱구 그림
    panel.add(background);	//배경화면


    /* 패널을 프레임에 추가 */
    this.getContentPane().add(panel);
    
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}


