package com.greedy.project.gui.start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LogOut extends JFrame {


	public LogOut() {
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

		/* 배경화면 생성 */
		JLabel background = new JLabel(new ImageIcon("images/background/Start-bg.PNG"));
		background.setBounds(0, 0, 750, 630);

		/* 짱구의 하루 라벨 생성 */
		JLabel logo1 = new JLabel(new ImageIcon("images/ui/Start_logo.PNG"));
		logo1.setBounds(0, 30, 750, 150);
		logo1.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬

		/* 종료 라벨 생성 */
		JLabel logo2 = new JLabel(new ImageIcon("images/ui/Start_logout.PNG"));
		logo2.setBounds(60, 60, 650, 500);
		logo2.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬
		
		/* 짱구 그림 */
		JLabel picture = new JLabel(new ImageIcon("images/ui/Start_짱구.PNG"));
		picture.setBounds(20, 280, 160, 250);

		/* 종료 버튼 생성 */
		JButton b1 = new JButton(new ImageIcon("images/button/Start_logoutBt.PNG"));
		b1.setBounds(300, 400, 140, 60);

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		/* 패널에 컴포넌트 추가 */
		panel.add(b1);
		panel.add(logo2);
		panel.add(logo1);
		panel.add(picture);
		panel.add(background);
		
		/* 패널을 프레임에 추가 */
		this.getContentPane().add(panel);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


