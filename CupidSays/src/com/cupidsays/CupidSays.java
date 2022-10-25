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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CupidSays {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=352,734
	 */
	private final JSlider slider = new JSlider();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		panel.setBounds(0, 330, 1256, 393);
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
		
		JLabel lblNewLabel_7 = new JLabel("Lover #1:");
		lblNewLabel_7.setForeground(new Color(0, 20, 39));
		lblNewLabel_7.setFont(new Font("MS PGothic", Font.ITALIC, 40));
		lblNewLabel_7.setBounds(331, 33, 184, 50);
		panel.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(508, 29, 322, 50);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(195, 151, 159));
		panel_2.setBounds(493, 10, 349, 88);
		panel.add(panel_2);
		
		JLabel lblNewLabel_7_1 = new JLabel("Lover #2:");
		lblNewLabel_7_1.setForeground(new Color(0, 20, 39));
		lblNewLabel_7_1.setFont(new Font("MS PGothic", Font.ITALIC, 40));
		lblNewLabel_7_1.setBounds(331, 164, 184, 50);
		panel.add(lblNewLabel_7_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(508, 160, 322, 50);
		panel.add(textField_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(195, 151, 159));
		panel_2_1.setBounds(493, 141, 349, 88);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Love Results:");
		lblNewLabel_7_2.setForeground(new Color(0, 20, 39));
		lblNewLabel_7_2.setFont(new Font("MS PGothic", Font.ITALIC, 40));
		lblNewLabel_7_2.setBounds(401, 316, 243, 50);
		panel.add(lblNewLabel_7_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(654, 305, 96, 61);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(195, 151, 159));
		panel_3.setBounds(639, 288, 125, 95);
		panel.add(panel_3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(112, 141, 129));
		btnNewButton.setFont(new Font("MS PGothic", Font.BOLD, 20));
		btnNewButton.setBounds(532, 239, 125, 37);
		panel.add(btnNewButton);
		
		JButton btnTryAgain = new JButton("TRY AGAIN");
		btnTryAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//for clearing the text field when users click try again button
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnTryAgain.setForeground(new Color(255, 255, 255));
		btnTryAgain.setFont(new Font("MS PGothic", Font.BOLD, 20));
		btnTryAgain.setBackground(new Color(128, 0, 64));
		btnTryAgain.setBounds(654, 239, 147, 37);
		panel.add(btnTryAgain);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(243, 233, 193));
		panel_1.setBounds(304, 241, 657, 482);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("See what Cupid Says...");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_1.setForeground(new Color(0, 20, 39));
		lblNewLabel_5_1.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 90));
		lblNewLabel_5_1.setBounds(0, 10, 666, 80);
		panel_1.add(lblNewLabel_5_1);
		
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
		lblNewLabel_6.setBounds(200, 187, 922, 32);
		frame.getContentPane().add(lblNewLabel_6);
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1270, 790);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
