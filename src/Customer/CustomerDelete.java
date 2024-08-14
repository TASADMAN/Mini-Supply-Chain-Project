package Customer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import Main_menu.Main;
import Main_menu.main_Menu;

public class CustomerDelete extends JPanel  implements ActionListener{
	
	JTextField tfID;
	

	Main W11Main;


	public CustomerDelete(Main ex11MainParam) {
		
		W11Main = ex11MainParam;
		
		setPreferredSize(new Dimension( W11Main.JMenu.FRAME_HEIGHT, W11Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel(" Customer Delete");
		lbHeader.setBounds((W11Main.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
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
		lbID.setBounds(150, yl, 50, height);
		lbID.setForeground( Color.red);
		add(lbID);	
		
		tfID = new JTextField(13);
		width = tfID.getPreferredSize().width;
		height = tfID.getPreferredSize().height;
		tfID.setBounds(170, yt, width, height);
		add(tfID);
		

		
		yl += 25;
		yt += 25;
		JButton btAdd = new JButton(main_Menu.DELETE_CUS);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH/2-width-10, yt, width+15, height);
		btAdd.setForeground( Color.blue);
		btAdd.setBackground(Color.cyan);
		add(btAdd);
		btAdd.addActionListener(this);
		
		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH/2+10, yt, width, height);
		btCancel.setForeground( Color.blue);
		btCancel.setBackground(Color.cyan);
		add(btCancel);
		
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals(main_Menu.DELETE_CUS)) {
			String strID = tfID.getText();
			try {
				int cus = Integer.parseInt(strID);
				CustomerDAO CusDAO = new CustomerDAO();
				CusDAO.deleteCustomers(cus);
			} catch(NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
	}
}
