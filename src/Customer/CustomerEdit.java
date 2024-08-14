package Customer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import Main_menu.Main;
import Main_menu.main_Menu;

public class CustomerEdit extends JPanel implements ActionListener {


	JTextField tfID;
	JTextField tfName;
	JTextField tfAddress;
	JTextField tfPhone;
	JTextField tfEmail;
	JTextField tfUsername;
	JTextField tfPassword;

	
	Main Le12Main;
	int index = -1;
	final static String SEARCH_CUS = "Search";
	public CustomerEdit(Main ex9MainParam) {
		Le12Main = ex9MainParam;
		setPreferredSize(new Dimension( ex9MainParam.JMenu.FRAME_WIDTH, ex9MainParam.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("Customer Edit");
		lbHeader.setBounds((ex9MainParam.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
				lbHeader.getPreferredSize().width+200, lbHeader.getPreferredSize().height);
		add(lbHeader);

		int width;
		int height;
		int xl = 10;
		int yl = 50;
		int xt = 65;
		int yt = 50;
		
		JLabel lbID = new JLabel("ID");
		width = lbID.getPreferredSize().width;
		height = lbID.getPreferredSize().height;
		lbID.setBounds(80, yl, 50, height);
		lbID.setForeground( Color.red);
		add(lbID);	
		
		tfID = new JTextField(13);
		width = tfID.getPreferredSize().width;
		height = tfID.getPreferredSize().height;
		tfID.setBounds(100, yt, width, height);
		add(tfID);
		
		
		JButton btSearch = new JButton(SEARCH_CUS);
		width = btSearch.getPreferredSize().width;
		height = btSearch.getPreferredSize().height;
		btSearch.setBounds(main_Menu.FRAME_WIDTH/2, 45, width, height);
		btSearch.setForeground( Color.blue);
		btSearch.setBackground(Color.cyan);
		add(btSearch);
		btSearch.addActionListener(this);
		
		yl += 25;
		yt += 25;
		
		JLabel lbName = new JLabel("name");
		width = lbName.getPreferredSize().width;
		height = lbName.getPreferredSize().height;
		lbName.setBounds(xl, yl, width, height);
		lbName.setForeground( Color.red);
		add(lbName);
				
		tfName = new JTextField(30);
		width = tfName.getPreferredSize().width;
		height = tfName.getPreferredSize().height;
		tfName.setBounds(70, yt, width, height);
		
		add(tfName);
		
		yl += 25;
		yt += 25;
		
		JLabel IbAddress = new JLabel("address");
		width = IbAddress.getPreferredSize().width;
		height = IbAddress.getPreferredSize().height;
		IbAddress.setBounds(xl, yl, width, height);
		IbAddress.setForeground( Color.red);
		add(IbAddress);
				
		tfAddress = new JTextField(30);
		width = tfAddress.getPreferredSize().width;
		height = tfAddress.getPreferredSize().height;
		tfAddress.setBounds(70, yt, width, height);
		
		add(tfAddress);
		
		yl += 25;
		yt += 25;
		
		JLabel IbPhone = new JLabel("phone");
		width = IbPhone.getPreferredSize().width;
		height = IbPhone.getPreferredSize().height;
		IbPhone.setBounds(xl, yl, width, height);
		IbPhone.setForeground( Color.red);
		add(IbPhone);
		
		tfPhone = new JTextField(30);
		width = tfPhone.getPreferredSize().width;
		height = tfPhone.getPreferredSize().height;
		tfPhone.setBounds(70, yt, width, height);
		add(tfPhone);
		
		yl += 25;
		yt += 25;
		
		JLabel IbEmail = new JLabel("Email");
		width = IbEmail.getPreferredSize().width;
		height = IbEmail.getPreferredSize().height;
		IbEmail.setBounds(xl, yl, width, height);
		IbEmail.setForeground( Color.red);
		add(IbEmail);
		
		tfEmail = new JTextField(30);
		width = tfEmail.getPreferredSize().width;
		height = tfEmail.getPreferredSize().height;
		tfEmail.setBounds(70, yt, width, height);
		add(tfEmail);
		
		yl += 25;
		yt += 25;
		
		JLabel IbUsername = new JLabel("Username");
		width = IbUsername.getPreferredSize().width;
		height = IbUsername.getPreferredSize().height;
		IbUsername.setBounds(xl, yl, width, height);
		IbUsername.setForeground( Color.red);
		add(IbUsername);
		
		tfUsername = new JTextField(30);
		width = tfUsername.getPreferredSize().width;
		height = tfUsername.getPreferredSize().height;
		tfUsername.setBounds(70, yt, width, height);
		add(tfUsername);
		
		yl += 25;
		yt += 25;
		
		JLabel IbPassword = new JLabel("Password");
		width = IbPassword.getPreferredSize().width;
		height = IbPassword.getPreferredSize().height;
		IbPassword.setBounds(xl, yl, width, height);
		IbPassword.setForeground( Color.red);
		add(IbPassword);
		
		tfPassword = new JTextField(30);
		width = tfPassword.getPreferredSize().width;
		height = tfPassword.getPreferredSize().height;
		tfPassword.setBounds(70, yt, width, height);
		add(tfPassword);
		
		yl += 25;
		yt += 25;
		
		JButton btAdd = new JButton(main_Menu.EDIT_CUS);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH/2-width-130, yt, width+15, height);
		btAdd.setForeground( Color.blue);
		btAdd.setBackground(Color.cyan);
		add(btAdd);
		btAdd.addActionListener(this);
		
		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH/2-110, yt, width, height);
		btCancel.setForeground( Color.blue);
		btCancel.setBackground(Color.cyan);
		add(btCancel);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println("command:" + command);
		
		if (command.equals(SEARCH_CUS)) {
			String strID = tfID.getText();
			int ID = Integer.parseInt(strID);
			Customer Customers = new Customer(ID);
		
			CustomerDAO CustomerDAO = new CustomerDAO();
			Customer Cus=CustomerDAO.searchCustomers(Customers);
			tfName.setText(Cus.getName());
			tfAddress.setText(Cus.getAddress());
			tfPhone.setText(Cus.getPhone());
			tfEmail.setText(Cus.getEmail());
			tfUsername.setText(Cus.getUsername());
			tfPassword.setText(Cus.getPassword());
			

		}
		
		if (command.equals(main_Menu.EDIT_CUS )) {
			int ID = Integer.parseInt(tfID.getText());
			String strName = tfName.getText();
			String strAddress = tfAddress.getText();
			String strPhone = tfPhone.getText();
			String strEmail = tfEmail.getText();
			String strUsername = tfUsername.getText();
			String strPassword = tfPassword.getText();
			Customer cus = new Customer(ID,strName,strAddress,strPhone,strEmail,strUsername,strPassword);
			CustomerDAO CustomerDAO = new CustomerDAO();
			CustomerDAO.editCustomers(cus);
			tfID.setText(null);
			tfName.setText(null);
			tfAddress.setText(null);
			tfPhone.setText(null);
			tfEmail.setText(null);
			tfUsername.setText(null);
			tfPassword.setText(null);

		}
	}
	
}
