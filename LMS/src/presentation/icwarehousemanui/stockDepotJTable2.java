package presentation.icwarehousemanui;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class stockDepotJTable2 {
	
	private JTable stockDepotTable;
	private stockDepotPanel2 stockDepotPanel2;
	private JScrollPane scrollPane;
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	
	public stockDepotJTable2(stockDepotPanel2 stockDepotPanel2){
		this.stockDepotPanel2 = stockDepotPanel2;
		initTable();
		init();
	}
	
	private void init(){
        scrollPane = new JScrollPane(stockDepotTable); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(stockDepotTable);
        scrollPane.setColumnHeaderView(stockDepotTable.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
		scrollPane.setBounds(0, 57, 730, 475);
        
		stockDepotPanel2.add(scrollPane);
	}
	
	private void initTable(){
		//���������
		String[] inDepotName = new String[]{" "," "," "," "," "," "," "};
		
		Object[][] inDepotValue = new Object[][]{{"����","2321","fyk","2012-07-","545","dfdf","wew"},
				{"������","232134 KB","fykhlp","2012","455","sfdf","dfsd"},
			{"������","2324 KB","fhlp","2012-07-2","454545","fdsf","dsf"},
					{"���㴫��","2324 KB","fykhlp","2012-07","455","dsad","dsad"},
				{"����","232134 KB","fykhlp","2012-07","455","dsada","sadad"}
					};
		//��������ݣ� ���ƺ�Ҫ�����ݿ���ȡ��������д����
		
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		
		stockDepotTable = new JTable(tableModel);
		stockDepotTable.setRowHeight(32);
		stockDepotTable.setShowGrid(false);
		TableColumn column = null;
		column = stockDepotTable.getColumnModel().getColumn(0);
		column.setPreferredWidth(177);
		column = stockDepotTable.getColumnModel().getColumn(1);
		column.setPreferredWidth(91);
		column = stockDepotTable.getColumnModel().getColumn(2);
		column.setPreferredWidth(91);
		column = stockDepotTable.getColumnModel().getColumn(3);
		column.setPreferredWidth(91);
		column = stockDepotTable.getColumnModel().getColumn(4);
		column.setPreferredWidth(91);
		column = stockDepotTable.getColumnModel().getColumn(5);
		column.setPreferredWidth(91);
		column = stockDepotTable.getColumnModel().getColumn(6);
		column.setPreferredWidth(91);
		
		
		stockDepotTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		stockDepotTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		
		stockDepotTable.setOpaque(false); 
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
		render.setOpaque(false);
		
		stockDepotTable.setDefaultRenderer(Object.class,render);
		
		JTableHeader header = stockDepotTable.getTableHeader();
		header.setOpaque(false);
		header.getTable().setOpaque(false);
		
		header.setDefaultRenderer(render); 
		TableCellRenderer headerRenderer = header.getDefaultRenderer();
		if (headerRenderer instanceof JLabel) {
			((JLabel) headerRenderer).setHorizontalAlignment(JLabel.CENTER);
			((JLabel) headerRenderer).setOpaque(false); 
		}
	}
}