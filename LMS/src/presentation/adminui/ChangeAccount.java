package presentation.adminui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vo.accountVO.AccountNumberVO;

public class ChangeAccount extends JPanel {
	private JLabel daBiaoTi;
	private JLabel zhangHao;
	private JLabel zhangHaoNo;
	private JLabel miMa;
	private JTextField miMaF;
	private JLabel miMaTishi;
	private JLabel xinMing;
	private JTextField xinMingF;
	private JLabel xinMingTiShi;
	private JLabel dianHua;
	private JTextField dianHuaF;
	private JLabel dianHuaTiShi;
	private JLabel shenFenZhengHaoMa;
	private JTextField shenFenZhengHaoMaF;
	private JLabel shenFenZhengHaoMaTiShi;
	
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	protected Component aat;
	
	public ChangeAccount(adminui aui,adminJpanel apl,AccountInfo accountInfo,AccountNumberVO accountNumberVO){
		init(accountNumberVO);
		apl.add(this);
		registListener(aui, apl, this,accountNumberVO);
	}
	
private void init(AccountNumberVO accountNumberVO){
		
		Font fontB=new Font("��Բ",Font.BOLD,30);
		Font font=new Font("��Բ",Font.BOLD,20);
		
		
		daBiaoTi = new JLabel("��������ȷ����Ϣ��ȷ��");
		daBiaoTi.setForeground(Color.WHITE);
		daBiaoTi.setFont(fontB);
		daBiaoTi.setBounds(180, 50, 500, 50);
		this.add(daBiaoTi);
		
		
		zhangHao = new JLabel("�˺ţ�");
		zhangHao.setForeground(Color.WHITE);
		zhangHao.setFont(font);
		zhangHao.setBounds(100, 150, 64, 40);
		this.add(zhangHao);
		
		long ID = accountNumberVO.getID();
		zhangHaoNo = new JLabel(String.valueOf(ID));
		zhangHaoNo.setForeground(Color.WHITE);
		zhangHaoNo.setFont(font);
		zhangHaoNo.setBounds(180, 150, 150, 40);
		this.add(zhangHaoNo);
		
		
		miMa = new JLabel("���룺");
		miMa.setForeground(Color.WHITE);
		miMa.setFont(font);
		miMa.setBounds(100, 220, 64, 40);
		this.add(miMa);
		
		miMaF = new JTextField(accountNumberVO.getPassword());
		miMaF.setFont(font);
		miMaF.setBounds(180, 220, 150, 40);
		this.add(miMaF);
		
		miMaTishi = new JLabel("(6����ĸ)");
		miMaTishi.setForeground(Color.WHITE);
		miMaTishi.setFont(font);
		miMaTishi.setBounds(340, 220, 100, 40);
		this.add(miMaTishi);
		
		
		xinMing = new JLabel("������");
		xinMing.setForeground(Color.WHITE);
		xinMing.setFont(font);
		xinMing.setBounds(100, 300, 64, 40);
		this.add(xinMing);
		
		xinMingF = new JTextField(accountNumberVO.getName());
		xinMingF.setFont(font);
		xinMingF.setBounds(180, 300, 120, 40);
		this.add(xinMingF);
		
		xinMingTiShi = new JLabel("(2--4������)");
		xinMingTiShi.setForeground(Color.WHITE);
		xinMingTiShi.setFont(font);
		xinMingTiShi.setBounds(310, 300, 160, 40);
		this.add(xinMingTiShi);
		
			
		dianHua = new JLabel("�绰��");
		dianHua.setFont(font);
		dianHua.setForeground(Color.WHITE);
		dianHua.setBounds(100, 380, 64, 40);
		this.add(dianHua);
		
		dianHuaF = new JTextField(accountNumberVO.getPhone());
		dianHuaF.setFont(font);
		dianHuaF.setBounds(180, 380, 150, 40);
		this.add(dianHuaF);
		
		dianHuaTiShi = new JLabel("(11������)");
		dianHuaTiShi.setForeground(Color.WHITE);
		dianHuaTiShi.setFont(font);
		dianHuaTiShi.setBounds(340, 380, 150, 40);
		this.add(dianHuaTiShi);
		
		
		shenFenZhengHaoMa = new JLabel("����֤���룺");
		shenFenZhengHaoMa.setForeground(Color.WHITE);
		shenFenZhengHaoMa.setFont(font);
		shenFenZhengHaoMa.setBounds(100, 460, 150, 40);
		this.add(shenFenZhengHaoMa);
		
		shenFenZhengHaoMaF = new JTextField(accountNumberVO.getsID());
		shenFenZhengHaoMaF.setFont(font);
		shenFenZhengHaoMaF.setBounds(240, 460, 220, 40);
		this.add(shenFenZhengHaoMaF);
		
		shenFenZhengHaoMaTiShi = new JLabel("(18λ����)");
		shenFenZhengHaoMaTiShi.setForeground(Color.WHITE);
		shenFenZhengHaoMaTiShi.setFont(font);
		shenFenZhengHaoMaTiShi.setBounds(470, 460, 150, 40);
		this.add(shenFenZhengHaoMaTiShi);
		
		
		returnButton=new JButton(returnIcon);		
		returnButton.setBounds(450, 530,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(350, 530,48,48);
		yesButton.setContentAreaFilled(false);	 	 	
	 	this.add(yesButton);
	 	
	 	this.setBounds(260, 60, 730,650);	
	 	this.setLayout(null);
	 	this.setOpaque(false);		
	}

	private void registListener(final adminui aui, final adminJpanel apl, final ChangeAccount changeAccount,final AccountNumberVO accountNumberVO) {

		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				apl.remove(changeAccount);
				
				new AccountInfo(aui, apl, accountNumberVO);

				apl.repaint();
			}
		});

		yesButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (true) {
					changeAccount.miMaTishi.setForeground(Color.RED);
					changeAccount.xinMingTiShi.setForeground(Color.RED);
					changeAccount.dianHuaTiShi.setForeground(Color.RED);
					changeAccount.shenFenZhengHaoMaTiShi.setForeground(Color.RED);

				}

			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(frameIcon.getImage(), -7, -12, null);
	}
}