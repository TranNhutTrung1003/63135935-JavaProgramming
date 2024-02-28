package tnt.tiil.edu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhPhuongTrinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKq;

	/**
	 * Create the frame.
	 */
	public ManHinhPhuongTrinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 139, 139));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 579, 53);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 78, 579, 253);
		contentPane.add(panel);
		
		Border southborderm = BorderFactory.createLineBorder(Color.RED);
		TitledBorder southTitleBorder =	new TitledBorder(southborderm, "Nhap a,b,c");
		panel.setBorder(southTitleBorder);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(162, 18, 52, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("b:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(162, 62, 52, 34);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("c:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(162, 106, 52, 34);
		panel.add(lblNewLabel_1_1_1);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(202, 21, 186, 34);
		panel.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(202, 62, 186, 34);
		panel.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(202, 106, 186, 34);
		panel.add(txtC);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Kết quả:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(121, 169, 79, 34);
		panel.add(lblNewLabel_1_1_1_1);
		
		txtKq = new JTextField();
		txtKq.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKq.setEditable(false);
		txtKq.setColumns(10);
		txtKq.setBounds(202, 172, 227, 34);
		panel.add(txtKq);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 351, 579, 93);
		contentPane.add(panel_1);
		
		Border southborderm_1 = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder southTitleBorder_1 =	new TitledBorder(southborderm_1, "Chọn thao tác");
		panel_1.setBorder(southTitleBorder_1);
		panel_1.setLayout(null);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Double.parseDouble(txtA.getText());
				Double b = Double.parseDouble(txtB.getText());
				Double c = Double.parseDouble(txtC.getText());
				Double kq, x1, x2;
				
				if(a == 0) {
					if(b == 0) {
						if(c == 0) {
							txtKq.setText("phuong trinh vo so nghiem");
						}else {
							txtKq.setText("phuong trinh vo nghiem");
						}
					} else {
						kq = -c/b;
						txtKq.setText("x = " + kq);
					}
				} else {
					Double delta = Math.pow(b, 2) - (4*a*c);
					if(delta < 0)
						txtKq.setText("phuong trinh vo nghiem");
					else if(delta == 0) {
						kq = -b/(2*a);
						txtKq.setText("x = " + kq);
					} else {
						x1 = (-b - Math.sqrt(delta))/(2*a);
						x2 = (-b + Math.sqrt(delta))/(2*a);
						txtKq.setText("x1 = " + x1 + ", x2 = " + x2);
					}	
				}
			}
		});
		btnGiai.setBackground(new Color(255, 255, 255));
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGiai.setBounds(58, 35, 95, 34);
		panel_1.add(btnGiai);
		
		JButton btnXoa = new JButton("Xóa Trắng");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				txtKq.setText("");
				txtA.requestFocus();
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnXoa.setBackground(Color.WHITE);
		btnXoa.setBounds(234, 35, 116, 34);
		panel_1.add(btnXoa);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(null, "Ban co chac la muon thoat khoi chuong trinh khong", "Thoát" ,JOptionPane.YES_NO_OPTION);
				if(res == JOptionPane.YES_NO_OPTION)
					System.exit(0);
			}
		});
		btnThot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnThot.setBackground(Color.WHITE);
		btnThot.setBounds(431, 35, 95, 34);
		panel_1.add(btnThot);
	}
}
