package presentation.bhclerkui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import presentation.icwarehousemanui.stockDepotPanel;

public class DriverInfoJpanelJTable {
	
	private JTable driverInfTable;
	private DriverInfoJpanel DriverInfoJpanel;
	private JScrollPane scrollPane;
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	
	public DriverInfoJpanelJTable(DriverInfoJpanel DriverInfoJpanel){
		this.DriverInfoJpanel = DriverInfoJpanel;
		initTable();
		init();
	}
	
	private void init(){
        scrollPane = new JScrollPane(driverInfTable); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(driverInfTable);
        scrollPane.setColumnHeaderView(driverInfTable.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
		scrollPane.setBounds(0, 0, 730, 571);
        
		DriverInfoJpanel.add(scrollPane);
	}
	
	private void initTable(){
		//假设的数据
		String[] inDepotName = new String[]{"司机编号","姓名"};
		
		Object[][] inDepotValue = new Object[][]{{"fyk","2012-07-"},
				{"sfdf","dfsd"},
			{"2012-07-2","454545"},
					{"dsad","dsad"},
				{"楚奇","232134 KB"}
					};
		//假设的数据： 完善后要从数据库拿取数据来填写表格
		
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		
		driverInfTable = new JTable(tableModel){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		driverInfTable.getTableHeader().setReorderingAllowed(false); //设置列不可重排
		driverInfTable.getTableHeader().setResizingAllowed(false); //设置列不可拖动
		
		//对双击的监听
		driverInfTable.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2){
					int row = driverInfTable.getSelectedRow();
					String value = driverInfTable.getValueAt(row, 0).toString().trim();
					System.out.println(value);
					
					
					//监听的具体实现
				}
			}
		});
		
		driverInfTable.setRowHeight(32);
		driverInfTable.setShowGrid(false);
		TableColumn column = null;
		column = driverInfTable.getColumnModel().getColumn(0);
		column.setPreferredWidth(452);
		column = driverInfTable.getColumnModel().getColumn(1);
		column.setPreferredWidth(274);
		
		
		driverInfTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		driverInfTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		
		driverInfTable.setOpaque(false); 
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
		render.setOpaque(false);
		
		driverInfTable.setDefaultRenderer(Object.class,render);
		
		JTableHeader header = driverInfTable.getTableHeader();
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
