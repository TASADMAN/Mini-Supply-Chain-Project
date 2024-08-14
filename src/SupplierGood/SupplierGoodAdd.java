package SupplierGood;

import javax.swing.JLabel;
import javax.swing.JTextField;

import Main_menu.Main;
import Main_menu.main_Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class SupplierGoodAdd extends JPanel implements ActionListener  {
	
	
	JTextField tfId_sup;
	JTextField tfId_good;
	JTextField tfPrice;
	

	
	Main W11Main; 


	public SupplierGoodAdd(Main ex9MainParam) {
		
		W11Main = ex9MainParam;
		
		setPreferredSize(new Dimension( W11Main.JMenu.FRAME_HEIGHT, W11Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel(" SupplierGoodadd");
		lbHeader.setBounds((W11Main.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
				lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
		add(lbHeader);
		
		int width;
		int height;
		int xl = 10; 
		int yl = 50;
		int xt = 90;
		int yt = 50;
		
		JLabel lbId_sup = new JLabel("Id_sup");
		width = lbId_sup.getPreferredSize().width;
		height = lbId_sup.getPreferredSize().height;
		lbId_sup.setBounds(xl, yl,50, height);
		lbId_sup.setForeground( Color.red);
		add(lbId_sup);
				
		tfId_sup = new JTextField(30);
		width = tfId_sup.getPreferredSize().width;
		height = tfId_sup.getPreferredSize().height;
		tfId_sup.setBounds(xt, yt, width, height);
		add(tfId_sup);
		
		yl += 25;
		yt += 25;
		
		JLabel lbId_good = new JLabel("Id_good");
		width = lbId_good.getPreferredSize().width;
		height = lbId_good.getPreferredSize().height;
		lbId_good.setBounds(xl, yl, width, height);
		lbId_good.setForeground( Color.red);
		add(lbId_good);
				
		tfId_good = new JTextField(30);
		width = tfId_good.getPreferredSize().width;
		height = tfId_good.getPreferredSize().height;
		tfId_good.setBounds(xt, yt, width, height);
		add(tfId_good);
		
		yl += 25;
		yt += 25;
		
		JLabel lbPrice = new JLabel("Price");
		width = lbPrice.getPreferredSize().width;
		height = lbPrice.getPreferredSize().height;
		lbPrice.setBounds(xl, yl, width, height);
		lbPrice.setForeground( Color.red);
		add(lbPrice);
		
		tfPrice = new JTextField(30);
		width = tfPrice.getPreferredSize().width;
		height = tfPrice.getPreferredSize().height;
		tfPrice.setBounds(xt, yt, width, height);
		add(tfPrice);
		
		yl += 25;
		yt += 25;
		
		
		JButton btAdd = new JButton(main_Menu.ADD_SUP);
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
	
	public void actionPerformed(ActionEvent evt) {
		
		String command = evt.getActionCommand();
		if(command.equals(main_Menu.ADD_SUP)) {
//			String strID = null;
			String strId_sup = tfId_sup.getText();
			String strId_good = tfId_good.getText();
			String strPrice = tfPrice.getText();
			try {
//				int ID = Integer.parseInt(strID);
				double Price = Double.parseDouble(strPrice);
				int Id_sup = Integer.parseInt(strId_sup);
				int Id_good = Integer.parseInt(strId_good);
				
				SupplierGood SupplierGood = new SupplierGood(Id_sup,Id_good,Price);
				SupplierGoodDAO SupplierGoodDAO = new SupplierGoodDAO();
				SupplierGoodDAO.addSupplierGood(SupplierGood);

			} catch(NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
		
	}

}
