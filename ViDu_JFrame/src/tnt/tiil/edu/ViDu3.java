/**
 * 
 */
package tnt.tiil.edu;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * 
 */
public class ViDu3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Khoi tao va thiet lap man hinh
		JFrame frame = new JFrame("Hello JFrame");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		
		// 2. Thiet lap layout
		frame.setLayout(new FlowLayout());
		
		// 3. Khoi tao cac doi tuong hien thi tren man hinh
		JButton btnOK = new JButton("nhan vao OK di");
		JButton btnCancel = new JButton("nhan vao cancel di");
		
		// 4. Gan cac doi tuong len man hinh
		frame.add(btnOK);
		frame.add(btnCancel);
		
		// 5. Hien thi man hinh
		frame.show();
	}

}
