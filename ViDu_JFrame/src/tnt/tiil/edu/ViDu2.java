/**
 * 
 */
package tnt.tiil.edu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * 
 */
public class ViDu2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello JFrame");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		
		JButton btnOK = new JButton("nhan vao OK di");
		JButton btnCancel = new JButton("nhan vao cancel di");
		
		frame.add(btnOK);
		frame.add(btnCancel);
		
		frame.show();
	}

}
