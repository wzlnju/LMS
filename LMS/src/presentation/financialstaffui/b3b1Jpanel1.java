package presentation.financialstaffui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class b3b1Jpanel1 extends JPanel{
	private JLabel bianhaoJLabel,riqiJLabel,danjumingJLabel,jineJLabel,tiaomuJLabel,zhanghaoJLabel,beizhuJLabel,fukuanrenxingmingJLabel;
	private JTextField bianhaoField,danjumingField,jineField,riqiField,zhanghaoField,fukuanrenxingmingField;
	private JList<String> tiaomuJList,beizhuJList;
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton,yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private ImageIcon yesIcon=new ImageIcon("picture/确定.png");
	public b3b1Jpanel1(b3financialstaffui b3financialstaffui,financialstaffJpanel financialstaffJpanel) {
		// TODO Auto-generated constructor stub
		init();
		financialstaffJpanel.add(this);
		registListener(b3financialstaffui,financialstaffJpanel,this);
	}
	private void init(){
		Font font=new Font("幼圆",Font.BOLD,20);
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(602, 575,48,48);
		yesButton.setContentAreaFilled(false);
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		bianhaoJLabel=new JLabel("付款单编号:");
		bianhaoJLabel.setForeground(Color.white);
		bianhaoJLabel.setFont(font);
		bianhaoJLabel.setBounds(50, 50, 150, 30);
		bianhaoField=new JTextField();
		bianhaoField.setFont(font);
		bianhaoField.setBounds(200, 50, 150, 30);
		riqiJLabel=new JLabel("付款日期:");
		riqiJLabel.setForeground(Color.white);
		riqiJLabel.setFont(font);
		riqiJLabel.setBounds(50, 150, 150, 30);
		DateChooser date = DateChooser.getInstance("yyyy-MM-dd");//选择日期类
		riqiField=new JTextField("点击选择日期");
		riqiField.setFont(font);
		date.register(riqiField);
		riqiField.setBounds(200, 150, 150, 30);
		fukuanrenxingmingJLabel=new JLabel("付款人姓名:");
		fukuanrenxingmingJLabel.setForeground(Color.white);
		fukuanrenxingmingJLabel.setFont(font);
		fukuanrenxingmingJLabel.setBounds(50, 250, 150, 30);
		fukuanrenxingmingField=new JTextField();
		fukuanrenxingmingField.setFont(font);
		fukuanrenxingmingField.setBounds(200, 250, 150, 30);
		danjumingJLabel=new JLabel("单据名:");
		danjumingJLabel.setForeground(Color.white);
		danjumingJLabel.setFont(font);
		danjumingJLabel.setBounds(370, 50, 150, 30);
		danjumingField=new JTextField();
		danjumingField.setFont(font);
		danjumingField.setBounds(500, 50, 150, 30);
		jineJLabel=new JLabel("付款金额:");
		jineJLabel.setForeground(Color.white);
		jineJLabel.setFont(font);
		jineJLabel.setBounds(370, 150, 150, 30);
		jineField=new JTextField();
		jineField.setFont(font);
		jineField.setBounds(500, 150, 150, 30);
		zhanghaoJLabel=new JLabel("付款账号:");
		zhanghaoJLabel.setForeground(Color.white);
		zhanghaoJLabel.setFont(font);
		zhanghaoJLabel.setBounds(370, 250, 150, 30);
		zhanghaoField=new JTextField();
		zhanghaoField.setFont(font);
		zhanghaoField.setBounds(500, 250, 150, 30);
		beizhuJLabel=new JLabel("备注:");
		beizhuJLabel.setForeground(Color.white);
		beizhuJLabel.setFont(font);
		beizhuJLabel.setBounds(370, 350, 150, 30);
		tiaomuJLabel=new JLabel("条目:");
		tiaomuJLabel.setForeground(Color.white);
		tiaomuJLabel.setFont(font);
		tiaomuJLabel.setBounds(50, 350, 150, 30);
		DefaultListModel tiaomulistModel = new DefaultListModel();
		tiaomulistModel.addElement("租金(按年收)");
		tiaomulistModel.addElement("运费(按次计算)");
		tiaomulistModel.addElement("人员工资(按月统计)");
		tiaomulistModel.addElement("奖励(一次性)");
		DefaultListModel beizhulistModel = new DefaultListModel();
		beizhulistModel.addElement("租金年份");
		beizhulistModel.addElement("运单号");
		beizhulistModel.addElement("工资月份");
		beizhulistModel.addElement("快递员提成");
		beizhulistModel.addElement("司机计次");
		beizhulistModel.addElement("业务员月薪");
		tiaomuJList=new JList<String>(tiaomulistModel);
		tiaomuJList.setBounds(150, 350, 200, 150);
		tiaomuJList.setFont(font);
		tiaomuJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		beizhuJList=new JList<String>(beizhulistModel);
		beizhuJList.setBounds(500, 350, 150, 150);
		beizhuJList.setFont(font);
		beizhuJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.add(bianhaoJLabel);
		this.add(bianhaoField);
		this.add(riqiJLabel);
		this.add(riqiField);
		this.add(fukuanrenxingmingJLabel);
		this.add(fukuanrenxingmingField);
		this.add(danjumingJLabel);
		this.add(danjumingField);
		this.add(jineField);
		this.add(jineJLabel);
		this.add(zhanghaoField);
		this.add(zhanghaoJLabel);
		this.add(beizhuJLabel);
		this.add(tiaomuJLabel);
		this.add(tiaomuJList);
		this.add(beizhuJList);
	 	this.setBounds(260, 60, 730,650);
	 	this.add(yesButton);
	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final b3financialstaffui b3financialstaffui,final financialstaffJpanel financialstaffJpanel,final b3b1Jpanel1 b3b1Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				financialstaffJpanel.remove(b3b1Jpanel1);
				financialstaffJpanel.add(b3financialstaffui.operationJpanel);
				b3financialstaffui.b1.setEnabled(true);
				b3financialstaffui.b2.setEnabled(true);
				financialstaffJpanel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new finishfukuandanDialog(b3financialstaffui, "新建付款单完成", true);
				financialstaffJpanel.remove(b3b1Jpanel1);
				financialstaffJpanel.add(b3financialstaffui.operationJpanel);
				b3financialstaffui.b1.setEnabled(true);
				b3financialstaffui.b2.setEnabled(true);
				financialstaffJpanel.repaint();
			}
		});
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}
class finishfukuandanDialog extends JDialog{
	private dialogJpanel jPanel;
	private JButton jButton;
	private JLabel jLabel;
	public finishfukuandanDialog(JFrame frame,String title,boolean modal) {
		super(frame,title,modal);
		init();
		registerListener();
		this.setVisible(true);
	}
	private void init(){
		ImageIcon yesIcon=new ImageIcon("picture/登录.png");
		jLabel=new JLabel("", JLabel.CENTER);
		jLabel.setText("<html>新建付款单完成</html>"); 
		jLabel.setForeground(Color.white);
		jLabel.setFont(new Font("幼圆",Font.BOLD,27));
		jPanel=new dialogJpanel();
		jButton=new JButton(yesIcon);
		jButton.setContentAreaFilled(false);
		jPanel.setLayout(null);
		jButton.setBounds(218, 190, 64, 64);
		jLabel.setBounds(0, 0, 500, 200);
		jPanel.add(jLabel);
		jPanel.add(jButton);
		this.add(jPanel);
		this.setSize(500, 300);
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int dialogWidth=this.getWidth();
		int dialogHeight=this.getHeight();
		this.setLocation((screenWidth-dialogWidth)/2, (screenHeight-dialogHeight)/2);
		this.setResizable(false);
	}
	private void registerListener(){
		jButton.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				finishfukuandanDialog.this.dispose();
			}
		});
	}
}

