package uiDesign;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class Renderer extends DefaultTableCellRenderer {
	
	JLabel lblDelete = new JLabel();
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
			  boolean hasFocus, int row, int column) {
			lblDelete.setText("Delete");
			//lbl.setIcon(icon);
			return lblDelete;
			}
	
//	lblDelete.addMouseListener(new MouseAdapter()  
//	{  
//	    public void mouseClicked(MouseEvent e)  
//	    {  
//	       // you can open a new frame here as
//	       // i have assumed you have declared "frame" as instance variable
//	    	 JFrame jf=new JFrame("new one");
//	         jf.setSize(new Dimension(200,70));
//	         jf.setVisible(true);
//	       
//
//	    }  
//	}); 

	
}
