package cours06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameSwap extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameSwap frame = new JFrameSwap();
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
	public JFrameSwap() {
		setTitle("Exercice 6.1 : Swap de deux champs texte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		JLabel lblerChamp = new JLabel("1er champ :");
		GridBagConstraints gbc_lblerChamp = new GridBagConstraints();
		gbc_lblerChamp.anchor = GridBagConstraints.EAST;
		gbc_lblerChamp.insets = new Insets(0, 0, 5, 5);
		gbc_lblerChamp.gridx = 0;
		gbc_lblerChamp.gridy = 0;
		contentPane.add(lblerChamp, gbc_lblerChamp);

		jTextField1 = new JTextField();
		GridBagConstraints gbc_jTextField1 = new GridBagConstraints();
		gbc_jTextField1.insets = new Insets(0, 0, 5, 0);
		gbc_jTextField1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField1.gridx = 1;
		gbc_jTextField1.gridy = 0;
		contentPane.add(jTextField1, gbc_jTextField1);
		jTextField1.setColumns(10);

		JLabel lblmeChamp = new JLabel("2\u00E8me champ :");
		GridBagConstraints gbc_lblmeChamp = new GridBagConstraints();
		gbc_lblmeChamp.anchor = GridBagConstraints.EAST;
		gbc_lblmeChamp.insets = new Insets(0, 0, 5, 5);
		gbc_lblmeChamp.gridx = 0;
		gbc_lblmeChamp.gridy = 1;
		contentPane.add(lblmeChamp, gbc_lblmeChamp);

		jTextField2 = new JTextField();
		GridBagConstraints gbc_jTextField2 = new GridBagConstraints();
		gbc_jTextField2.insets = new Insets(0, 0, 5, 0);
		gbc_jTextField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextField2.gridx = 1;
		gbc_jTextField2.gridy = 1;
		contentPane.add(jTextField2, gbc_jTextField2);
		jTextField2.setColumns(10);

		JButton btnSwap = new JButton("Swap");
		btnSwap.addActionListener(this);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 0;
		gbc_btnCancel.gridy = 2;
		contentPane.add(btnCancel, gbc_btnCancel);
		GridBagConstraints gbc_btnSwap = new GridBagConstraints();
		gbc_btnSwap.gridx = 1;
		gbc_btnSwap.gridy = 2;
		contentPane.add(btnSwap, gbc_btnSwap);

		this.pack();
	}

	public void actionPerformed(ActionEvent ae) {
		switch (ae.getActionCommand()) {
		case "Swap":
			String s = jTextField1.getText();
			jTextField1.setText(jTextField2.getText());
			jTextField2.setText(s);
			break;
		case "Cancel":
			jTextField1.setText("");
			jTextField2.setText("");
			break;
		}
	}

}
