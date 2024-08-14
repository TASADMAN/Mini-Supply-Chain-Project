package Receipt;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Receipt.Receipt;
import Receipt.ReceiptDAO;
import Main_menu.Main;

public class ReceiptView extends JPanel {
	
	JTextField tfID;
	JTextField tfName;
	JTextField tfPrice;
	JTextField tfDescription;
	JTextField tfStock;
	
	Main Le12Main;


	public ReceiptView(Main ex9MainParam) {
		
		Le12Main = ex9MainParam;
		
		setPreferredSize(new Dimension( Le12Main.JMenu.FRAME_HEIGHT, Le12Main.JMenu.FRAME_HEIGHT));
		setLayout(null);
		JLabel lbHeader = new JLabel("View Receipt");
		lbHeader.setBounds((Le12Main.JMenu.FRAME_WIDTH-lbHeader.getPreferredSize().width)/2, 10, 
		lbHeader.getPreferredSize().width, lbHeader.getPreferredSize().height);
		add(lbHeader);
		
		int width;
		int height;
		int xl = 10;
		int yl = 30;
		int xt = 65;
		int yt = 50;
		
		ReceiptDAO Receipt = new ReceiptDAO();
		ArrayList<Receipt> cars = Receipt.viewReceipt();
		
		yl += 15;
		
		JTable table = new JTable();
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		model.addColumn("ID");
		model.addColumn("Data");
		model.addColumn("Cus_Id");
		model.addColumn("Total");
		
		Iterator it = cars.iterator();
		int i=0;
		while (it.hasNext()) {
			Receipt user = (Receipt) it.next();
			model.addRow(new Object[0]);
			model.setValueAt(user.getid(), i, 0);
			model.setValueAt(user.getData(), i, 1);
			model.setValueAt(user.getCus_Id(), i, 2);
			model.setValueAt(user.getTotal(), i, 3);
			
			
			
			i++;
		}
		table.setPreferredScrollableViewportSize(new Dimension (100,300));

		JScrollPane sp = new JScrollPane(table);
		sp.setBounds((Le12Main.JMenu.FRAME_WIDTH-300)/2,yl,300,100);
		add(sp);

	
	}


	
}
