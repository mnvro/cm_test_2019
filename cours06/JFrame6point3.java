package cours06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;

public class JFrame6point3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldCoteCarre;
	private JTextField jTextFieldRayonCercle;
	private JLabel jLabelPerimetreCercle;
	private JLabel jLabelSurfaceCarre;
	private JLabel jLabelSurfaceDisque;
	private JLabel jLabelPerimetreCarre;
	private JTextArea jTextAreaConsole;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
					JFrame6point3 frame = new JFrame6point3();
					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame6point3() {
		setTitle("Exercice 6.3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblImageCarre = new JLabel("");
		lblImageCarre.setIcon(new ImageIcon(JFrame6point3.class.getResource("/ressources/images/carre 100 pixels.png")));
		GridBagConstraints gbc_lblImageCarre = new GridBagConstraints();
		gbc_lblImageCarre.gridheight = 3;
		gbc_lblImageCarre.insets = new Insets(0, 0, 5, 5);
		gbc_lblImageCarre.gridx = 0;
		gbc_lblImageCarre.gridy = 0;
		contentPane.add(lblImageCarre, gbc_lblImageCarre);
		
		JLabel lblCt = new JLabel("c\u00F4t\u00E9 =");
		GridBagConstraints gbc_lblCt = new GridBagConstraints();
		gbc_lblCt.anchor = GridBagConstraints.EAST;
		gbc_lblCt.insets = new Insets(0, 0, 5, 5);
		gbc_lblCt.gridx = 1;
		gbc_lblCt.gridy = 0;
		contentPane.add(lblCt, gbc_lblCt);
		
		jTextFieldCoteCarre = new JTextField();
		jTextFieldCoteCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_jTextFieldCoteCarre = new GridBagConstraints();
		gbc_jTextFieldCoteCarre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldCoteCarre.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldCoteCarre.gridx = 2;
		gbc_jTextFieldCoteCarre.gridy = 0;
		contentPane.add(jTextFieldCoteCarre, gbc_jTextFieldCoteCarre);
		jTextFieldCoteCarre.setColumns(10);
		
		JButton jButtonCalculCarre = new JButton("calcul carr\u00E9");
		jButtonCalculCarre.addActionListener(this);
		GridBagConstraints gbc_jButtonCalculCarre = new GridBagConstraints();
		gbc_jButtonCalculCarre.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonCalculCarre.gridx = 3;
		gbc_jButtonCalculCarre.gridy = 0;
		contentPane.add(jButtonCalculCarre, gbc_jButtonCalculCarre);
		
		JLabel lblPrimtre = new JLabel("p\u00E9rim\u00E8tre =");
		GridBagConstraints gbc_lblPrimtre = new GridBagConstraints();
		gbc_lblPrimtre.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimtre.gridx = 1;
		gbc_lblPrimtre.gridy = 1;
		contentPane.add(lblPrimtre, gbc_lblPrimtre);
		
		jLabelPerimetreCarre = new JLabel("0");
		jLabelPerimetreCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_jLabelPerimetreCarre = new GridBagConstraints();
		gbc_jLabelPerimetreCarre.anchor = GridBagConstraints.EAST;
		gbc_jLabelPerimetreCarre.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelPerimetreCarre.gridx = 2;
		gbc_jLabelPerimetreCarre.gridy = 1;
		contentPane.add(jLabelPerimetreCarre, gbc_jLabelPerimetreCarre);
		
		JLabel lblSurface = new JLabel("surface =");
		GridBagConstraints gbc_lblSurface = new GridBagConstraints();
		gbc_lblSurface.insets = new Insets(0, 0, 5, 5);
		gbc_lblSurface.gridx = 1;
		gbc_lblSurface.gridy = 2;
		contentPane.add(lblSurface, gbc_lblSurface);
		
		jLabelSurfaceCarre = new JLabel("0");
		jLabelSurfaceCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_jLabelSurfaceCarre = new GridBagConstraints();
		gbc_jLabelSurfaceCarre.anchor = GridBagConstraints.EAST;
		gbc_jLabelSurfaceCarre.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelSurfaceCarre.gridx = 2;
		gbc_jLabelSurfaceCarre.gridy = 2;
		contentPane.add(jLabelSurfaceCarre, gbc_jLabelSurfaceCarre);
		
		JLabel lblImageRond = new JLabel("");
		lblImageRond.setIcon(new ImageIcon(JFrame6point3.class.getResource("/ressources/images/rond 100 pixels.png")));
		GridBagConstraints gbc_lblImageRond = new GridBagConstraints();
		gbc_lblImageRond.gridheight = 3;
		gbc_lblImageRond.insets = new Insets(0, 0, 5, 5);
		gbc_lblImageRond.gridx = 0;
		gbc_lblImageRond.gridy = 3;
		contentPane.add(lblImageRond, gbc_lblImageRond);
		
		JLabel lblCt_1 = new JLabel("c\u00F4t\u00E9 =");
		GridBagConstraints gbc_lblCt_1 = new GridBagConstraints();
		gbc_lblCt_1.anchor = GridBagConstraints.EAST;
		gbc_lblCt_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCt_1.gridx = 1;
		gbc_lblCt_1.gridy = 3;
		contentPane.add(lblCt_1, gbc_lblCt_1);
		
		jTextFieldRayonCercle = new JTextField();
		jTextFieldRayonCercle.setHorizontalAlignment(SwingConstants.RIGHT);
		jTextFieldRayonCercle.setColumns(10);
		GridBagConstraints gbc_jTextFieldRayonCercle = new GridBagConstraints();
		gbc_jTextFieldRayonCercle.insets = new Insets(0, 0, 5, 5);
		gbc_jTextFieldRayonCercle.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldRayonCercle.gridx = 2;
		gbc_jTextFieldRayonCercle.gridy = 3;
		contentPane.add(jTextFieldRayonCercle, gbc_jTextFieldRayonCercle);
		
		JButton jButtonCalculCercle = new JButton("calcul cercle");
		jButtonCalculCercle.addActionListener(this);
		GridBagConstraints gbc_jButtonCalculCercle = new GridBagConstraints();
		gbc_jButtonCalculCercle.insets = new Insets(0, 0, 5, 0);
		gbc_jButtonCalculCercle.gridx = 3;
		gbc_jButtonCalculCercle.gridy = 3;
		contentPane.add(jButtonCalculCercle, gbc_jButtonCalculCercle);
		
		JLabel label = new JLabel("p\u00E9rim\u00E8tre =");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 4;
		contentPane.add(label, gbc_label);
		
		jLabelPerimetreCercle = new JLabel("0");
		jLabelPerimetreCercle.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_jLabelPerimetreCercle = new GridBagConstraints();
		gbc_jLabelPerimetreCercle.anchor = GridBagConstraints.EAST;
		gbc_jLabelPerimetreCercle.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelPerimetreCercle.gridx = 2;
		gbc_jLabelPerimetreCercle.gridy = 4;
		contentPane.add(jLabelPerimetreCercle, gbc_jLabelPerimetreCercle);
		
		JLabel label_1 = new JLabel("surface =");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 5;
		contentPane.add(label_1, gbc_label_1);
		
		jLabelSurfaceDisque = new JLabel("0");
		jLabelSurfaceDisque.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_jLabelSurfaceDisque = new GridBagConstraints();
		gbc_jLabelSurfaceDisque.anchor = GridBagConstraints.EAST;
		gbc_jLabelSurfaceDisque.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelSurfaceDisque.gridx = 2;
		gbc_jLabelSurfaceDisque.gridy = 5;
		contentPane.add(jLabelSurfaceDisque, gbc_jLabelSurfaceDisque);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 6;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		jTextAreaConsole = new JTextArea();
		jTextAreaConsole.setText("Console :");
		scrollPane.setViewportView(jTextAreaConsole);
	}
	public void actionPerformed(ActionEvent ae) {
		switch (ae.getActionCommand()) {
		case "calcul carré":
			Carre carre = new Carre(Double.parseDouble(jTextFieldCoteCarre.getText()));
			jLabelPerimetreCarre.setText(carre.getPerimetre()+"");
			jLabelSurfaceCarre.setText(carre.getAire()+"");
			jTextAreaConsole.append("\n"+carre.toString());
			break;
		case "calcul cercle":
			Cercle cercle = new Cercle(Double.parseDouble(jTextFieldRayonCercle.getText()));
			jLabelPerimetreCercle.setText(""+cercle.getPerimetre());
			jLabelSurfaceDisque.setText(""+cercle.getAire());
			jTextAreaConsole.append("\n"+cercle.toString());
			break;
		}
		jTextAreaConsole.setCaretPosition(jTextAreaConsole.getDocument().getLength());
	}
}
