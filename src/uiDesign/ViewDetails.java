package uiDesign;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import listener.FunctionListener;

public class ViewDetails extends JPanel {
	public JPanel contentPane;
	public JLabel lblHeading,lbl;
	public JTable table= new JTable();
	public JScrollPane tableScrollPane = new JScrollPane(table);
	
	public JButton calender = new JButton("CHOOSE DAY");
	
	public JButton calenderTo = new JButton("CHOOSE DAY");
	public JButton submit = new JButton();
	
	final JRadioButton radVazhipadu = new JRadioButton("Vazhipadu List");
    final JRadioButton radDay = new JRadioButton("Day wise Data");
    final JRadioButton radMonth = new JRadioButton("Month wise Data");
    final JRadioButton radRange = new JRadioButton("Data between Two Days");
    FunctionListener functionListener = new FunctionListener(this);
    
    public JTextField vazhpaduTextSearch = new JTextField();
    
//    public JTextField dayText = new JTextField();
//    public JTextField monthText = new JTextField();
//    public JTextField fromText = new JTextField();
      public JTextField toText = new JTextField();
    
    public JLabel lblVazhipaduSearch = new JLabel();
    
//    public JLabel lblDay = new JLabel("Enter The Date");
//    public JLabel lblMonth = new JLabel("Enter The Month");
//    public JLabel lblFrom = new JLabel("Enter From Date");
     public JLabel lblTo = new JLabel("Enter To Date");
	
	
	
	Object[][] data = {
            {"César Cielo", "Filho", "Brazil", "50m freestyle",1 , "21.30", false },
            {"Amaury", "Leveaux", "France", "50m freestyle", 2, "21.45", false },
            {"Eamon", "Sullivan", "Australia", "100m freestyle", 2, "47.32", false },
            {"Michael", "Phelps", "USA", "200m freestyle", 1, "1:42.96", false },
            {"Ryan", "Lochte", "USA", "200m backstroke", 1, "1:53.94", true },
            {"Hugues", "Duboscq", "France", "100m breaststroke", 3, "59.37", false }
        };
	
	 public ViewDetails(){
		 
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 597, 472);
			//contentPane = new JPanel();
			setBorder(new EmptyBorder(5, 5, 5, 5));
			//setContentPane(contentPane);
			setLayout(null);
			
			lblHeading = new JLabel("Details");
			lblHeading.setFont(new Font("Georgia", Font.BOLD, 21));
			lblHeading.setBounds(136, 11, 250, 50);
			add(lblHeading);
			
			calender.setBounds(404, 170, 89, 26);
			add(calender);
   		 	calender.addActionListener(functionListener);
   		 	calender.setActionCommand("calender");
			
			
			ButtonGroup group = new ButtonGroup();
		      group.add(radVazhipadu);
		      group.add(radDay);
		      group.add(radMonth);
		      group.add(radRange);
		      radVazhipadu.setBounds(20, 100, 250, 50);
		      radDay.setBounds(280, 100, 250, 50);
		      radMonth.setBounds(540, 100, 250, 50);
		      radRange.setBounds(850, 100, 250, 50);
		      add(radVazhipadu);
		      add(radDay);
		      add(radMonth);
		      add(radRange);
			
			
			
			
			radVazhipadu.addItemListener(new ItemListener() {
		         public void itemStateChanged(ItemEvent e) {
		        	 
		        	 if (e.getStateChange() == ItemEvent.SELECTED) {
		        		 
		        		
		        		 
		        		 
		        		 lblVazhipaduSearch.setText("Vazhipadu Name");
		        		 lblVazhipaduSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		        		 lblVazhipaduSearch.setBounds(50, 170, 124, 26);
		        		 add(lblVazhipaduSearch);
		        		 lblVazhipaduSearch.setVisible(true);
		        		 
		        		 
		        		 vazhpaduTextSearch.setBounds(200, 170, 204, 26);
		        		 add( vazhpaduTextSearch);
		        		 vazhpaduTextSearch.setColumns(10);
		        		 vazhpaduTextSearch.setVisible(true);
		        		 
		        		 lblTo.setVisible(false);
		        		 toText.setVisible(false);
		        		 calender.setVisible(false);
		        		 calenderTo.setVisible(false);
		        		 
		        		 
//		        		 String[] vazhipaduColumnNames = {"Vazhipadu", "Rate"};
//		        		 
//		        		 DefaultTableModel vazhipaduModel = new DefaultTableModel(vazhipaduColumnNames, 0){
//
//		        			    @Override
//		        			    public boolean isCellEditable(int row, int column) {
//		        			       //all cells false
//		        			       return false;
//		        			    }
//		        			};
//
//		        			vazhipaduModel.addRow(new Object[]{"First","10"});
//		        			table.setModel(vazhipaduModel);
//		        			table.setShowGrid(true);
//		        			table.setShowHorizontalLines(true);
//		        		    table.setShowVerticalLines(true);
//		        		    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		        			table.getTableHeader().setBackground(new Color( 41, 128, 185 ));
//		        			table.getTableHeader().setFont(new Font("SansSerif",Font.BOLD, 12));
//		        			table.getTableHeader().setForeground(new Color(240, 255, 255));
//		        			tableScrollPane.setBounds(10, 300, 1000, 100);
//		        			add(tableScrollPane);
		        	    }
		        	 
		        	
		         }
		        	 
		      });
			
		      radDay.addItemListener(new ItemListener() {
		         public void itemStateChanged(ItemEvent e) { 
		        	 if (e.getStateChange() == ItemEvent.SELECTED) {
		        		 
		        		 
		        		
		        		 
		        		 
		        		 lblVazhipaduSearch.setText("Enter Date");
		        		 lblVazhipaduSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		        		 lblVazhipaduSearch.setBounds(50, 170, 124, 26);
		        		 add(lblVazhipaduSearch);
		        		 lblVazhipaduSearch.setVisible(true);
		        		 
		        		 
		        		 vazhpaduTextSearch.setBounds(200, 170, 204, 26);
		        		 add(vazhpaduTextSearch);
		        		 vazhpaduTextSearch.setColumns(10);
		        		 vazhpaduTextSearch.setVisible(true);
		        		 
		        		 lblTo.setVisible(false);
		        		 toText.setVisible(false);
		        		 
		        		
		        		 calender.setVisible(true);
		        		
		        		 calenderTo.setVisible(false);
		        		 
		        		 
//                   String[] dayColumnNames = {"Vazhipadu","Quantity","Rate","Total"};
//		        		 
//		        		 DefaultTableModel dayModel = new DefaultTableModel(dayColumnNames, 0){
//
//		        			    @Override
//		        			    public boolean isCellEditable(int row, int column) {
//		        			       //all cells false
//		        			       return false;
//		        			    }
//		        			};
//
//		        			dayModel.addRow(new Object[]{"one","10","10","100"});
//		        			table.setModel(dayModel);
//		        			table.setShowGrid(true);
//		        			table.setShowHorizontalLines(true);
//		        		    table.setShowVerticalLines(true);
//		        		    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		        			table.getTableHeader().setBackground(new Color( 41, 128, 185 ));
//		        			table.getTableHeader().setFont(new Font("SansSerif",Font.BOLD, 12));
//		        			table.getTableHeader().setForeground(new Color(240, 255, 255));
//		        			tableScrollPane.setBounds(10, 300, 1000, 100);
//		        			add(tableScrollPane);
		        	    }
		        	 
		         }
		         
		      });
		      
		      radMonth.addItemListener(new ItemListener() {
		         public void itemStateChanged(ItemEvent e) { 
		        	 if (e.getStateChange() == ItemEvent.SELECTED) {
		        		 
		        		 
		        		 lblVazhipaduSearch.setText("Enter Month");
		        		 lblVazhipaduSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		        		 lblVazhipaduSearch.setBounds(50, 170, 124, 26);
		        		 add(lblVazhipaduSearch);
		        		 lblVazhipaduSearch.setVisible(true);
		        		 
		        		
		        		 vazhpaduTextSearch.setBounds(200, 170, 204, 26);
		        		 add(vazhpaduTextSearch);
		        		 vazhpaduTextSearch.setColumns(10);
		        		 vazhpaduTextSearch.setVisible(true);
		        		 
		        		 lblTo.setVisible(false);
		        		 toText.setVisible(false);
		        		 
		        		 
		        		 calender.setVisible(true);
		        		 calenderTo.setVisible(false);
		        		 
//		        	 String[] monthColumnNames = {"Vazhipadu","Quantity","Rate","Total"};
//		        		 
//		        		 DefaultTableModel monthModel = new DefaultTableModel(monthColumnNames, 0){
//
//		        			    @Override
//		        			    public boolean isCellEditable(int row, int column) {
//		        			       //all cells false
//		        			       return false;
//		        			    }
//		        			};
//
//		        			monthModel.addRow(new Object[]{"two","10","10","100"});
//		        			table.setModel(monthModel);
//		        			table.setShowGrid(true);
//		        			table.setShowHorizontalLines(true);
//		        		    table.setShowVerticalLines(true);
//		        		    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		        			table.getTableHeader().setBackground(new Color( 41, 128, 185 ));
//		        			table.getTableHeader().setFont(new Font("SansSerif",Font.BOLD, 12));
//		        			table.getTableHeader().setForeground(new Color(240, 255, 255));
//		        			tableScrollPane.setBounds(10, 300, 1000, 100);
//		        			add(tableScrollPane);
		        	    }
		        	    
		        	
		         }           
		      });
		      
		      radRange.addItemListener(new ItemListener() {
			         public void itemStateChanged(ItemEvent e) {
			        	 if (e.getStateChange() == ItemEvent.SELECTED) {
			        		 
			        		 
			        		 lblVazhipaduSearch.setText("From Date");
			        		 lblVazhipaduSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
			        		 lblVazhipaduSearch.setBounds(50,170, 124, 26);
			        		 add(lblVazhipaduSearch);
			        		 lblVazhipaduSearch.setVisible(true);
			        		
			        		 vazhpaduTextSearch.setBounds(200,170, 204, 26);
			        		 add(vazhpaduTextSearch);
			        		 vazhpaduTextSearch.setColumns(10);
			        		 vazhpaduTextSearch.setVisible(true);
			        		 
//			        		 calender.setBounds(404, 170, 89, 26);
//			        		 add(calender);
			        		 calender.setVisible(true);
			        		 
			        		 lblTo.setFont(new Font("Tahoma", Font.BOLD, 13));
			        		 lblTo.setBounds(550,170, 124, 26);
			        		 add(lblTo);
			        		 lblTo.setVisible(true);
			        		 
			        		
			        		 toText.setBounds(685, 170, 204, 26);
			        		 add(toText);
			        		 toText.setColumns(10);
			        		 toText.setVisible(true);
			        		 
			        		 calenderTo.setBounds(890, 170, 89, 26);
			        		 add(calenderTo);
			        		 calenderTo.addActionListener(functionListener);
			        		 calenderTo.setActionCommand("calenderTo");
			        		 calenderTo.setVisible(true);
			        		 
			        		 
//			        		 String[] rangeColumnNames = {"Vazhipadu","Quantity","Rate","Total"};
//			        		 
//			        		 DefaultTableModel rangeModel = new DefaultTableModel(rangeColumnNames, 0){
//
//			        			    @Override
//			        			    public boolean isCellEditable(int row, int column) {
//			        			       //all cells false
//			        			       return false;
//			        			    }
//			        			};
//
//			        			rangeModel.addRow(new Object[]{"three","10","10","100"});
//			        			table.setModel(rangeModel);
//			        			table.setShowGrid(true);
//			        			table.setShowHorizontalLines(true);
//			        		    table.setShowVerticalLines(true);
//			        		    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//			        			table.getTableHeader().setBackground(new Color( 41, 128, 185 ));
//			        			table.getTableHeader().setFont(new Font("SansSerif",Font.BOLD, 12));
//			        			table.getTableHeader().setForeground(new Color(240, 255, 255));
//			        			tableScrollPane.setBounds(10, 300, 1000, 100);
//			        			add(tableScrollPane);
			        	    }
			        	 
			         }           
			      });
	 }

}
