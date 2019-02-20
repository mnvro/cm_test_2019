package cours06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JScrollPane;

public class JFrame6Point2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ArrayList<JLabel> listJLabel = new ArrayList<JLabel>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
					JFrame6Point2 frame = new JFrame6Point2();
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
	public JFrame6Point2() {
		setTitle("Exercice 6.2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAjouteUnJlabel = new JButton("Ajouter un JLabel");
		btnAjouteUnJlabel.addActionListener(this);
		contentPane.add(btnAjouteUnJlabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JLabel jLabel = new JLabel("Label "+listJLabel.size());
		listJLabel.add(jLabel);
		getContentPane().add(jLabel);	
//		this.setSize(this.getWidth(), this.getHeight()+1);
//		this.setSize(this.getWidth(), this.getHeight()-1);
	}

}
