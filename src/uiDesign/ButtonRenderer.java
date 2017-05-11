package uiDesign;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import uiDesign.Offering;;

public class ButtonRenderer extends JButton implements TableCellRenderer {
	String label; 
    public ButtonRenderer() {
        setOpaque(true);
    }


	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		final Offering offering=new Offering();
		setText((value == null) ? "" : value.toString());
		label=value.toString();
		System.out.println("label"+value.toString());
		System.out.println("table"+table.getValueAt(row, 0));
		System.out.println("row"+row);
		
		
		 if (label.equalsIgnoreCase("Update")) {
			 System.out.println("insiderow"+(String)table.getValueAt(row, 0));
		offering.updateVazhipadu.setText((String)table.getValueAt(row, 0));
    	offering.updateQuantity.setText((String)table.getValueAt(row, 1));
    	offering.lblNewRate.setText(Integer.toString(row));
    	offering.lblNewRate.setVisible(false);
		 }
        return this;
		// TODO Auto-generated method stub
		
	}
	
}


