package uiDesign;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import uiDesign.Renderer;
import listener.TableHeaderMouseListener;
//import listener.Listener;


public class Offering extends JPanel {

	public JPanel contentPane;
	public JTextField line;
	public JTextField item_ID;
	public JTextField dateText;
	public JTextField quantityText;
	public JTextField name;
	public JTextField updateVazhipadu;
	public  JTextField updateQuantity;
	public JButton print,update,plus,btnUpdateVazhipadu,btnDeleteVazhipadu;
	public JButton cancel;
	public JLabel lblHeading,lblpatientId;
	public JComboBox Patient_id;
	public JTable table;
	public JScrollPane tableScrollPane;
	public JLabel lblNewRate;
    
	Date date = new Date();
	SimpleDateFormat fort = new SimpleDateFormat("EEEE, MMMM d, yyyy");
	float totalAmount=0,quantity=0,rate=0;
	
	String[] columnNames = {"Vazhipadu", "Quantity", "Rate", "Total"," ","Action"};
	
	public Object data[][] = new Object[0][4];


	/**
	 * Create the frame.
	 */
	public Offering() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 472);
		//contentPane = new JPanel();
		setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		setLayout(null);
		
		lblHeading = new JLabel("     Vazhipadu.");
		lblHeading.setFont(new Font("Georgia", Font.BOLD, 21));
		lblHeading.setBounds(136, 11, 250, 50);
		add(lblHeading);
		
	
		
		JLabel lblNewLabel_Id = new JLabel("ID");
		lblNewLabel_Id.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_Id.setBounds(50, 113, 107, 26);
		add(lblNewLabel_Id);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(50, 180, 107, 26);
		add(lblNewLabel_1);
	
		JLabel lblNewLabel_2 = new JLabel("Vazhipadu :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(50, 245, 124, 26);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(400, 245, 200, 26);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rate :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(600, 245, 260, 26);
		add(lblNewLabel_4);
		

		line = new JTextField();
		line.setBounds(27, 44, 462, 5);
		add(line);
		line.setColumns(10);
		
	
		JLabel lblId = new JLabel("100");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(130, 117, 204, 26);
		add(lblId);
		
		JLabel lblDate = new JLabel(fort.format(date));
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setBounds(130, 181, 204, 26);
		add(lblDate);
		
		name = new JTextField();
		name.setBounds(130, 245, 204, 26);
		add(name);
		name.setColumns(10);
		
		quantityText = new JTextField();
		quantityText.setBounds(470, 245, 100, 26);
		add(quantityText);
		quantityText.setColumns(10);
		
		
		JLabel lblRate = new JLabel("10");
		lblRate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRate.setBounds(650, 245, 100, 26);
		add(lblRate);
		rate=Float.parseFloat(lblRate.getText());
		
		
		

		DefaultTableModel model = new DefaultTableModel(columnNames, 0){

		    @Override
		    public boolean isCellEditable(int row, int column) {
		       //all cells false
		       return false;
		    }
		};

		table= new JTable();
		table.setModel(model);
		table.setShowGrid(true);
		table.setShowHorizontalLines(true);
	    table.setShowVerticalLines(true);
	    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getTableHeader().setBackground(new Color( 41, 128, 185 ));
		table.getTableHeader().setFont(new Font("SansSerif",Font.BOLD, 12));
		table.getTableHeader().setForeground(new Color(240, 255, 255));
		tableScrollPane = new JScrollPane(table);
		tableScrollPane.setBounds(10, 300, 1000, 100);
		add(tableScrollPane);
		
		
		 
//		JLabel lblTotal = new JLabel(Float.toString(itemTotal));
//		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblTotal.setBounds(850, 245, 100, 26);
//		add(lblTotal);
		
		 plus = new JButton("Add");
		 plus.setBounds(750, 245, 100, 23);
		 add(plus);
		 //submit.addActionListener(patientAdd);
		 plus.setActionCommand("Plus");
		 
		 btnUpdateVazhipadu = new JButton("Update");
     	 btnUpdateVazhipadu.setBounds(750, 245, 100, 23);
		 add(btnUpdateVazhipadu);
		 
//		 JLabel lblUpdateVazhipadu = new JLabel("Vazhipadu :");
//		 lblUpdateVazhipadu.setFont(new Font("Tahoma", Font.BOLD, 13));
//		 lblUpdateVazhipadu.setBounds(50, 435, 100, 26);
//			add(lblUpdateVazhipadu);
//			
//		updateVazhipadu = new JTextField();
//		updateVazhipadu.setBounds(130, 435, 204, 26);
//		add(updateVazhipadu);
//		updateVazhipadu.setColumns(10);
//			
//		 JLabel lblUpdateQuantity = new JLabel("Quantity :");
//		 lblUpdateQuantity.setFont(new Font("Tahoma", Font.BOLD, 13));
//		 lblUpdateQuantity.setBounds(400, 435, 100, 26);
//		 add(lblUpdateQuantity);
//		 
//		 updateQuantity = new JTextField();
//		 updateQuantity.setBounds(470, 435, 100, 26);
//		 add(updateQuantity);
//		 updateQuantity.setColumns(10);
//		 
//		 JLabel lblUpdateRate = new JLabel("Rate :");
//		 lblUpdateRate.setFont(new Font("Tahoma", Font.BOLD, 13));
//		 lblUpdateRate.setBounds(600, 435, 100, 26);
//		 add(lblUpdateRate);
//		 
//		 lblNewRate = new JLabel("10");
//		 lblNewRate.setFont(new Font("Tahoma", Font.BOLD, 13));
//		 lblNewRate.setBounds(645, 435, 100, 26);
//		 add(lblNewRate);
//		 
//		 btnUpdateVazhipadu = new JButton("Update");
//		 btnUpdateVazhipadu.setBounds(750, 435, 100, 23);
//		 add(btnUpdateVazhipadu);
//		 
//		 btnDeleteVazhipadu = new JButton("Delete");
//		 btnDeleteVazhipadu.setBounds(860, 435, 100, 23);
//		 add(btnDeleteVazhipadu);
		 
		 
		 JLabel lblUpdate = new JLabel("Update");
		 lblUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		 
		 JLabel lblDelete = new JLabel("Delete");
		 lblUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		 
		 
//		
//		       updateVazhipadu.setText(model1.getValueAt(selectedRowIndex, 0).toString());
//		       updateQuantity.setText(model1.getValueAt(selectedRowIndex, 1).toString());
//		       lblNewRate.setText(model1.getValueAt(selectedRowIndex, 2).toString());
    
		 ListSelectionModel selectionModel = table.getSelectionModel();
		 
		 selectionModel.addListSelectionListener(new ListSelectionListener() {
			 
			    public void valueChanged(ListSelectionEvent e) {
			    	int row = table.getSelectedRow();
			    	int column = table.getSelectedColumn();
			    	String strSource= e.getSource().toString();
			    	
//			    	updateVazhipadu.setText(model.getValueAt(row, 0).toString());
//         		    updateQuantity.setText(model.getValueAt(row, 1).toString());
//				    lblNewRate.setText(model.getValueAt(row, 2).toString());
				    
				    
				    
			    	

			    }
			});
			
		 JLabel lblTotal = new JLabel("Total :");
		 lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblTotal.setBounds(650, 470, 100, 26);
		 add(lblTotal);
			
		 JLabel lblTotalAmount = new JLabel(Float.toString(totalAmount));
		 lblTotalAmount.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblTotalAmount.setBounds(750, 470, 100, 26);
		 add(lblTotalAmount);
		 
		 plus.addActionListener(new ActionListener() {
    	 

			@Override
			public void actionPerformed(ActionEvent arg0) {
				model.addRow(new Object[]{name.getText(),quantityText.getText(), lblRate.getText(),Float.toString(Float.parseFloat( quantityText.getText())*Float.parseFloat(lblRate.getText())),lblUpdate.getText(),lblDelete.getText()});
				tableScrollPane.setVisible(true);
				totalAmount=totalAmount+(Float.parseFloat( quantityText.getText())*Float.parseFloat(lblRate.getText()));
				lblTotalAmount.setText(Float.toString(totalAmount));
				//table.getColumn("Action").setCellRenderer(new Renderer());
				

//				table.getColumn("Action2").setCellRenderer(new Renderer());
//				table.getColumn("Action1").setCellRenderer(new ButtonRenderer());
//		        table.getColumn("Action1").setCellEditor(
//		                new ButtonEditor(new JCheckBox(), table));
//		        table.getColumn("Action2").setCellRenderer(new ButtonRenderer());
//	            table.getColumn("Action2").setCellEditor(
//	                new ButtonEditor(new JCheckBox(), table));
			}
			  });
		 
		 btnUpdateVazhipadu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int indexUpdate=table.getSelectedRow();
				Float oldValue=Float.parseFloat(table.getValueAt(indexUpdate,3).toString());
				totalAmount=totalAmount-oldValue;
				System.out.println("old Value"+oldValue);
				System.out.println("totalAmount"+totalAmount);
				if(indexUpdate>=0){
					model.setValueAt(name.getText(),indexUpdate,0);
					model.setValueAt(quantityText.getText(),indexUpdate,1);
					model.setValueAt(lblRate.getText(),indexUpdate,2);
					model.setValueAt(Float.toString(Float.parseFloat( quantityText.getText())*Float.parseFloat(table.getValueAt(indexUpdate,2).toString())), indexUpdate, 3);
					
					JOptionPane.showMessageDialog(null,"Value in Updated ");
				}
				
				totalAmount=totalAmount+(Float.parseFloat( quantityText.getText())*Float.parseFloat(lblRate.getText()));
				lblTotalAmount.setText(Float.toString(totalAmount));
				btnUpdateVazhipadu.setVisible(false);
				plus.setVisible(true);
				
			}
		});
		 
		 
		 table.addMouseListener(new java.awt.event.MouseAdapter()

         {

public void mouseClicked(java.awt.event.MouseEvent e)

{

int row=table.rowAtPoint(e.getPoint());

int col= table.columnAtPoint(e.getPoint());
String value=table.getValueAt(row, col).toString();

if(value.equalsIgnoreCase("Delete")){
	
	//((DefaultTableModel)table.getModel()).removeRow(row);
	
	int viewIndex = table.getSelectedRow();
	
	if(viewIndex>-1){
	Float oldRate=Float.parseFloat(table.getValueAt(viewIndex,3).toString());
	totalAmount=totalAmount-oldRate;
	int modelIndex = table.convertRowIndexToModel(viewIndex);
	DefaultTableModel model = (DefaultTableModel)table.getModel();
	model.removeRow(modelIndex);
	table.setModel(model);
	table.addNotify();
	
	JOptionPane.showMessageDialog(null,"Value in Deleted ");
	lblTotalAmount.setText(Float.toString(totalAmount));
	
	}
	
	

	 // converts the row index in the view to the appropriate index in the model
   
    

}
else if(value.equalsIgnoreCase("Update"))
{
	//System.out.println("Value in the cell clicked :"+ ""+table.getValueAt(row,col).toString()+"Row"+row+"Column"+col);
	btnUpdateVazhipadu.setVisible(true);
	plus.setVisible(false);
	name.setText(table.getValueAt(row,0).toString());
    quantityText.setText(table.getValueAt(row,1).toString());
    lblRate.setText(table.getValueAt(row,2).toString());
}



//System.out.println("Value in the cell clicked :"+ ""+table.getValueAt(row,col).toString());

}

});

		

		
		 print = new JButton("Print");
		print.setBounds(160, 520, 98, 23);
		add(print);
		//submit.addActionListener(patientAdd);
		print.setActionCommand("Print");
		
		
		
		
		
		cancel = new JButton("Cancel");
		cancel.setBounds(264, 520, 98, 23);
		add(cancel);
	}
}

