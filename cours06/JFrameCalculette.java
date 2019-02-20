package cours06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class JFrameCalculette extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldResultat;
	private JButton tabJButton[] = new JButton[10];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameCalculette frame = new JFrameCalculette();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameCalculette() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 210, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		for (int i = 0; i < tabJButton.length; i++) {
			tabJButton[i] = new JButton(i+"");
			tabJButton[i].addActionListener(this);
		}
		
		jTextFieldResultat = new JTextField();
		gbc.gridwidth = 4;
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		contentPane.add(jTextFieldResultat, gbc);
		jTextFieldResultat.setColumns(10);
		
		tabJButton[7] = new JButton("7");
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 1;
		contentPane.add(tabJButton[7], gbc);
		
		tabJButton[8] = new JButton("8");
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 1;
		contentPane.add(tabJButton[8], gbc);
		
		tabJButton[9] = new JButton("9");
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 2;
		gbc.gridy = 1;
		contentPane.add(tabJButton[9], gbc);
		
		JButton button_10 = new JButton("+");
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 3;
		gbc.gridy = 1;
		contentPane.add(button_10, gbc);
		
		
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 2;
		contentPane.add(tabJButton[4], gbc);
		
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 2;
		contentPane.add(tabJButton[5], gbc);
		
		JButton button_6 = new JButton("6");
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 2;
		gbc.gridy = 2;
		contentPane.add(button_6, gbc);
		
		JButton button_12 = new JButton("-");
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 3;
		gbc.gridy = 2;
		contentPane.add(button_12, gbc);
		
		JButton button_1 = new JButton("1");
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 3;
		contentPane.add(button_1, gbc);
		
		JButton button_2 = new JButton("2");
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 1;
		gbc.gridy = 3;
		contentPane.add(button_2, gbc);
		
		JButton button_3 = new JButton("3");
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 2;
		gbc.gridy = 3;
		contentPane.add(button_3, gbc);
		
		JButton button_13 = new JButton("*");
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridx = 3;
		gbc.gridy = 3;
		contentPane.add(button_13, gbc);
		
		JButton button = new JButton("0");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridx = 0;
		gbc.gridy = 4;
		contentPane.add(button, gbc);
		
		JButton btnC = new JButton("C");
		gbc.insets = new Insets(0, 0, 0, 5);
		gbc.gridwidth = 1;
		gbc.gridx = 1;
		gbc.gridy = 4;
		contentPane.add(btnC, gbc);
		
		JButton button_11 = new JButton("=");
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 2;
		gbc.gridx = 2;
		gbc.gridy = 4;
		contentPane.add(button_11, gbc);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jTextFieldResultat.setText(jTextFieldResultat.getText()+e.getActionCommand());
		
	}

}
