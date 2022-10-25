package com.cupidsays;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CupidSays {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=352,734
	 */
	private final JSlider slider = new JSlider();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CupidSays window = new CupidSays();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CupidSays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 64));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 330, 1256, 356);
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(CupidSays.class.getResource("/images/bow-and-arrow (2).png")));
		lblNewLabel_4.setBounds(10, 10, 254, 307);
		panel.add(lblNewLabel_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CupidSays.class.getResource("/images/hearts (2).png")));
		label.setBounds(968, 10, 278, 266);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(243, 233, 193));
		panel_1.setBounds(304, 241, 657, 406);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Gabriola", Font.PLAIN, 90));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(239, 56, 288, 95);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("to");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 90));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(503, 56, 84, 65);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cupid Says");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 90));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(578, 56, 382, 95);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(CupidSays.class.getResource("/images/love-letter (1).png")));
		lblNewLabel.setBounds(913, 37, 133, 114);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Calculate your chances of love with someone special!");
		lblNewLabel_5.setFont(new Font("MS PGothic", Font.BOLD, 40));
		lblNewLabel_5.setForeground(new Color(195, 151, 159));
		lblNewLabel_5.setBounds(190, 131, 969, 58);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Disclaimer: This is just a fun, past time game and in no way predicts actually chances of falling in love.");
		lblNewLabel_6.setFont(new Font("MS PGothic", Font.BOLD, 20));
		lblNewLabel_6.setForeground(new Color(112, 141, 129));
		lblNewLabel_6.setBounds(200, 175, 922, 32);
		frame.getContentPane().add(lblNewLabel_6);
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1270, 790);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
