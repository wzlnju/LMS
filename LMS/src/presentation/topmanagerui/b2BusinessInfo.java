package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import businesslogic.organizationbl.BusinessController;
import vo.orgVO.BussinessOrgVO;

public class b2BusinessInfo extends JPanel {
	private JLabel suoShu,suoShuC,suoZai,suoZaiC,bianHao,bianHaoC,kuaiDiYuan,yeWuYuan;
	private JButton change,delete,returnButton;
	private JComboBox kuaiDiYuanb,yeWuYuanb;

	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");	
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	
	private void init(b2topmanagerui b2ui,topmanagerJpanel tjpl,String ID) {
		
		BusinessController businessController = new BusinessController();
		String[] temp = ID.split("-");
		Font bFont = new Font("幼圆", Font.BOLD, 30);
		Font sFont = new Font("幼圆", Font.BOLD, 20);
		
		suoShu = new JLabel("所属中转中心编号");
		suoShu.setFont(bFont);
		suoShu.setForeground(Color.WHITE);
		suoShu.setBounds(100, 70, 240, 50);
		this.add(suoShu);
		
		suoShuC = new JLabel(temp[0]);
		suoShuC.setFont(bFont);
		suoShuC.setForeground(Color.WHITE);
		suoShuC.setBounds(350, 70, 200, 50);
		this.add(suoShuC);
		
		suoZai = new JLabel("所在地区");
		suoZai.setFont(bFont);
		suoZai.setForeground(Color.WHITE);
		suoZai.setBounds(100, 130, 180, 50);
		this.add(suoZai);
		
		suoZaiC = new JLabel(businessController.getInfo(ID));
		suoZaiC.setFont(bFont);
		suoZaiC.setForeground(Color.WHITE);
		suoZaiC.setBounds(290, 130, 150, 50);
		this.add(suoZaiC);
		
		bianHao = new JLabel("机构编号");
		bianHao.setFont(bFont);
		bianHao.setForeground(Color.WHITE);
		bianHao.setBounds(100, 190, 200, 50);
		this.add(bianHao);
		
		bianHaoC = new JLabel(temp[1]);
		bianHaoC.setFont(bFont);
		bianHaoC.setForeground(Color.WHITE);
		bianHaoC.setBounds(310, 190, 180, 50);
		this.add(bianHaoC);
		
		kuaiDiYuan = new JLabel("快递员列表:");
		kuaiDiYuan.setFont(sFont);
		kuaiDiYuan.setForeground(Color.WHITE);
		kuaiDiYuan.setBounds(120, 260, 180, 40);
		this.add(kuaiDiYuan);
		
		yeWuYuan = new JLabel("业务员列表:");
		yeWuYuan.setFont(sFont);
		yeWuYuan.setForeground(Color.WHITE);
		yeWuYuan.setBounds(330, 260, 180, 40);
		this.add(yeWuYuan);
		
		kuaiDiYuanb = new JComboBox(businessController.getCourierList(ID));
		kuaiDiYuanb.setFont(sFont);
		kuaiDiYuanb.setForeground(Color.BLACK);
		kuaiDiYuanb.setBounds(120, 310, 180, 40);
		this.add(kuaiDiYuanb);
		
		yeWuYuanb = new JComboBox(businessController.getBussinessmanList(ID));
		yeWuYuanb.setFont(sFont);
		yeWuYuanb.setForeground(Color.BLACK);
		
		
		
		
		//到时候再加图片
		change = new JButton("修改");
		change.setForeground(Color.BLACK);
		change.setContentAreaFilled(true);
		change.setBorderPainted(true);
		change.setBounds(120, 500, 160, 50);
		this.add(change);

		delete = new JButton("删除");
		delete.setForeground(Color.BLACK);
		delete.setContentAreaFilled(true);
		delete.setBorderPainted(true);
		delete.setBounds(310, 500, 160, 50);
		this.add(delete);

		returnButton = new JButton(returnIcon);
		returnButton.setBounds(500, 500, 48, 48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);

		this.setBounds(260, 60, 730, 650);
		this.setLayout(null);
		this.setOpaque(false);
		
	}

}
