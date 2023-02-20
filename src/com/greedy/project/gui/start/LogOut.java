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
		JLabel background = new JLabel(new ImageIcon("images/background/Start.PNG"));
		background.setBounds(0, 0, 750, 650);

		/* 짱구의 하루 라벨 생성 */
		JLabel logo1 = new JLabel(new ImageIcon("images/logo/Start_logo.PNG"));
		logo1.setBounds(0, 50, 750, 110);
		logo1.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬

		/* 종료 라벨 생성 */
		JLabel logo2 = new JLabel(new ImageIcon("images/label/Start_logout.PNG"));
		logo2.setBounds(60, 60, 650, 500);
		logo2.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬

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
		panel.add(logo2);
		panel.add(logo1);
		panel.add(background);
		panel.add(b1);

		/* 패널을 프레임에 추가 */
		this.getContentPane().add(panel);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


