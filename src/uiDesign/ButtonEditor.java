package uiDesign;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import uiDesign.Offering;

public class ButtonEditor extends DefaultCellEditor {
    protected JButton button;

    private String label;
    JTable t1;
    private boolean isPushed;
    int index,rowIndex;
    String vazhipadu;
    Float quantity,rate;
    

    public ButtonEditor(JCheckBox checkBox, JTable t1) {
        super(checkBox);
        this.t1 = t1;
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fireEditingStopped();
			}
        });
    }
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {

        index = Integer.parseInt(t1.getModel().getValueAt(row, 0).toString());
        vazhipadu = t1.getModel().getValueAt(row, 1).toString();
        quantity = Float.parseFloat(t1.getModel().getValueAt(row, 2).toString());
        rate = Float.parseFloat(t1.getModel().getValueAt(row, 3).toString());
        rowIndex=row;

        label = (value == null) ? "" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }

    // update, delete
    public Object getCellEditorValue() {
        if (isPushed) {
            String url = "jdbc:mysql://localhost:3307/mydb";
            String userid = "root";
            String password = "root";

            try {
                Connection connection = DriverManager.getConnection(url,
                        userid, password);
                Statement stmt = connection.createStatement();

                if (label.equalsIgnoreCase("Update")) {
                	final Offering offering=new Offering();
                	System.out.println("Oke");
                	offering.updateVazhipadu.setText((String)t1.getValueAt(rowIndex, 0));
                	offering.updateQuantity.setText((String)t1.getValueAt(rowIndex, 1));
                	offering.lblNewRate.setText(Integer.toString(rowIndex));
//                    stmt
//                            .executeUpdate("update emp set name='" + name
//                                    + "', city='" + city + "' where id='"
//                                    + index + "'");

                    JOptionPane.showMessageDialog(button, label
                            + ":Update recoed success");

                } else if (label.equalsIgnoreCase("Delete")) {
//                    stmt.executeUpdate("delete from emp where id='" + index
//                            + "'");

                    JOptionPane.showMessageDialog(button, label
                            + ":Delete record success");

                }

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        isPushed = false;
        return new String(label);
    }

    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}