package Supplier;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Main_menu.Main;
import Main_menu.main_Menu;

public class SupplierAdd extends JPanel implements ActionListener {

	JTextField tfName;
	JTextField tfEmail;
	JTextField tfPhone;
	JTextField tfAddress;

	Main W11Main;

	public SupplierAdd(Main ex9MainParam) {

		W11Main = ex9MainParam;

		setPreferredSize(new Dimension(W11Main.JMenu.FRAME_HEIGHT, W11Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel(" SupplierAdd");
		lbHeader.setBounds((W11Main.JMenu.FRAME_WIDTH - lbHeader.getPreferredSize().width) / 2, 10,
				lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
		add(lbHeader);

		int width;
		int height;
		int xl = 10;
		int yl = 50;
		int xt = 90;
		int yt = 50;

		// JName

		JLabel lbName = new JLabel("Name");
		width = lbName.getPreferredSize().width;
		height = lbName.getPreferredSize().height;
		lbName.setBounds(xl, yl, 50, height);
		lbName.setForeground( Color.red);
		add(lbName);

		tfName = new JTextField(30);
		width = tfName.getPreferredSize().width;
		height = tfName.getPreferredSize().height;
		tfName.setBounds(xt, yt, width, height);
		add(tfName);

		yl += 25;
		yt += 25;

		JLabel lbAddress = new JLabel("Address");
		width = lbAddress.getPreferredSize().width;
		height = lbAddress.getPreferredSize().height;
		lbAddress.setBounds(xl, yl, width, height);
		lbAddress.setForeground( Color.red);
		add(lbAddress);

		tfAddress = new JTextField(30);
		width = tfAddress.getPreferredSize().width;
		height = tfAddress.getPreferredSize().height;
		tfAddress.setBounds(xt, yt, width, height);
		add(tfAddress);

		yl += 25;
		yt += 25;
		
		JLabel lbPhone = new JLabel("Phone");
		width = lbPhone.getPreferredSize().width;
		height = lbPhone.getPreferredSize().height;
		lbPhone.setBounds(xl, yl, width, height);
		lbPhone.setForeground( Color.red);
		add(lbPhone);

		tfPhone = new JTextField(30);
		width = tfPhone.getPreferredSize().width;
		height = tfPhone.getPreferredSize().height;
		tfPhone.setBounds(xt, yt, width, height);
		add(tfPhone);

		yl += 25;
		yt += 25;
		
		// JEmail

		JLabel lbEmail = new JLabel("Email");
		width = lbEmail.getPreferredSize().width;
		height = lbEmail.getPreferredSize().height;
		lbEmail.setBounds(xl, yl, width, height);
		lbEmail.setForeground( Color.red);
		add(lbEmail);

		tfEmail = new JTextField(30);
		width = tfEmail.getPreferredSize().width;
		height = tfEmail.getPreferredSize().height;
		tfEmail.setBounds(xt, yt, width, height);
		add(tfEmail);

		yl += 25;
		yt += 25;

//		// JPhone

		

		// Address

		

		JButton btAdd = new JButton(main_Menu.ADD_SUP);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH / 2 - width - 135, yt, width, height);
		btAdd.setForeground( Color.blue);
		btAdd.setBackground(Color.cyan);
		add(btAdd);
		btAdd.addActionListener(this);

		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH / 2 -125, yt, width, height);
		btCancel.setForeground( Color.blue);
		btCancel.setBackground(Color.cyan);
		add(btCancel);

	}

	public void actionPerformed(ActionEvent evt) {

		String command = evt.getActionCommand();
		if (command.equals(main_Menu.ADD_SUP)) {
			String strID = null;
			String strName = tfName.getText();
			String strAddress = tfAddress.getText();
			String strPhone = tfPhone.getText();
			String strEmail = tfEmail.getText();
			
			

			try {

				Supplier Supplier = new Supplier(strName, strAddress, strPhone, strEmail);
				SupplierDAO SupplierDAO = new SupplierDAO();
				SupplierDAO.addSupplier(Supplier);

			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}

	}

}
