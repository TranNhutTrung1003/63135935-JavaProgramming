package tnt.tiil.edu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;

public class FormBoxLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FormBoxLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox.add(verticalBox_1);
		
		for(int i = 0; i<3; i++) {
			horizontalBox.add(Box.createHorizontalGlue());
			horizontalBox.add(new JButton("button "+i));
		}
		horizontalBox.add(Box.createHorizontalGlue());
		
		for(int i = 0; i<5; i++) {
			horizontalBox_1.add(new JButton("button " + i));
		}
		
		for(int i = 0; i<5; i++) {
			verticalBox_1.add(Box.createVerticalStrut(5));
			verticalBox_1.add(new JButton("button "+i));
		}
		verticalBox_1.add(Box.createVerticalStrut(5));
	}

}
