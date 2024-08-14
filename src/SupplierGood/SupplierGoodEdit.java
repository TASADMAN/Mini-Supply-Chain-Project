package SupplierGood;

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
public class SupplierGoodEdit extends JPanel implements ActionListener {
	
	JTextField tfID;
	JTextField tfId_sup;
	JTextField tfGood_id;
	JTextField tfPrice;
	
	
	Main Le12Main;
	int index = -1;
	final static String SEARCH_CUS = "Search";
	public SupplierGoodEdit(Main ex9MainParam) {
		Le12Main = ex9MainParam;
		setPreferredSize(new Dimension( ex9MainParam.JMenu.FRAME_WIDTH, ex9MainParam.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("SupplierGood Edit");
		lbHeader.setBounds((ex9MainParam.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
				lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
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
		lbID.setBounds(80, yl, width, height);
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
		
		JLabel lbId_sup = new JLabel("Id_sup");
		width = lbId_sup.getPreferredSize().width;
		height = lbId_sup.getPreferredSize().height;
		lbId_sup.setBounds(xl, yl, width, height);
		lbId_sup.setForeground( Color.red);
		add(lbId_sup);
				
		tfId_sup = new JTextField(30);
		width = tfId_sup.getPreferredSize().width;
		height = tfId_sup.getPreferredSize().height;
		tfId_sup.setBounds(xt, yt, width, height);
		add(tfId_sup);
		
		yl += 25;
		yt += 25;
		
		JLabel IbGood_id = new JLabel("Good_id");
		width = IbGood_id.getPreferredSize().width;
		height = IbGood_id.getPreferredSize().height;
		IbGood_id.setBounds(xl, yl, width, height);
		IbGood_id.setForeground( Color.red);
		add(IbGood_id);
				
		tfGood_id = new JTextField(30);
		width = tfGood_id.getPreferredSize().width;
		height = tfGood_id.getPreferredSize().height;
		tfGood_id.setBounds(xt, yt, width, height);
		add(tfGood_id);
		
		yl += 25;
		yt += 25;
		
		JLabel IbPrice = new JLabel("Price");
		width = IbPrice.getPreferredSize().width;
		height = IbPrice.getPreferredSize().height;
		IbPrice.setBounds(xl, yl, width, height);
		IbPrice.setForeground( Color.red);
		add(IbPrice);
		
		tfPrice = new JTextField(30);
		width = tfPrice.getPreferredSize().width;
		height = tfPrice.getPreferredSize().height;
		tfPrice.setBounds(xt, yt, width, height);
		add(tfPrice);
		
		yl += 25;
		yt += 25;
		
		
		
	;
		
		JButton btAdd = new JButton(main_Menu.EDIT_CUS);
		width = btAdd.getPreferredSize().width;
		height = btAdd.getPreferredSize().height;
		btAdd.setBounds(main_Menu.FRAME_WIDTH/2-width-130, yt, width, height);
		btAdd.setForeground( Color.blue);
		btAdd.setBackground(Color.cyan);
		add(btAdd);
		btAdd.addActionListener(this);
		
		JButton btCancel = new JButton(main_Menu.CANCEL_STR);
		width = btCancel.getPreferredSize().width;
		height = btCancel.getPreferredSize().height;
		btCancel.setBounds(main_Menu.FRAME_WIDTH/2-120, yt, width, height);
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
			SupplierGood SupplierGoods = new SupplierGood(ID);
		
			SupplierGoodDAO SupplierGoodDAO = new SupplierGoodDAO();
			SupplierGood Supg=SupplierGoodDAO.searchSupplierGood(SupplierGoods);
			tfId_sup.setText(String.valueOf(Supg.getId_sup()));
			tfGood_id.setText(String.valueOf(Supg.getId_good()));
			tfPrice.setText(String.valueOf(Supg.getPrice()));
			
			

		}
		
		if (command.equals(main_Menu.EDIT_CUS )) {
			int ID = Integer.parseInt(tfID.getText());
			String strId_sup = tfId_sup.getText();
			String strGood_id = tfGood_id.getText();
			String strPrice = tfPrice.getText();
			double Price = Double.parseDouble(strPrice);
			int Id_sup = Integer.parseInt(strPrice);
			int Good_id = Integer.parseInt(strGood_id);
			SupplierGood cus = new SupplierGood(ID,Id_sup,Good_id,Price);
			SupplierGoodDAO SupplierGoodDAO = new SupplierGoodDAO();
			SupplierGoodDAO.editSupplierGood(cus);
			tfID.setText(null);
			tfId_sup.setText(null);
			tfGood_id.setText(null);
			tfPrice.setText(null);
			
		}
	}

}
