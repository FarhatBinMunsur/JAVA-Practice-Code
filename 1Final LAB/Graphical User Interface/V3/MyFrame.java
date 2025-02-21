import java.lang.*;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame{
	
	private JLabel titleLabel,userIDLabel,passLabel;
	private JTextField userIdTF;
	private JPasswordField passPF;
	private JButton showBtn,loginBtn,regBtn,exitBtn;
	private JPanel panel;
	private Color color1,color2,color3,color4,color5;
	private Font font1;
	
	
	public MyFrame(){
		
		super("Sample Management System");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.color1=new Color(179, 32, 76);
		this.color2=new Color(224, 211, 211);
		this.color3=new Color(230, 197, 14);
		
		this.font1=new Font("Aptos",Font.PLAIN,15);
		
		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.panel.setBackground(color3);
		
		this.titleLabel=new JLabel(" School Management System");
		this.titleLabel.setBounds(100,10,200,20);
		this.titleLabel.setOpaque(true);
		this.titleLabel.setBackground(color1);
		this.titleLabel.setForeground(color2);
		this.titleLabel.setFont(font1);
		this.panel.add(titleLabel);
		
		this.userIDLabel=new JLabel("User ID: ");
		this.userIDLabel.setBounds(40,60,50,20);
		this.panel.add(userIDLabel);
		
		this.passLabel=new JLabel("Password: ");
		this.passLabel.setBounds(40,90,70,20);
		this.panel.add(passLabel);
		
		this.userIdTF=new JTextField();
		this.userIdTF.setBounds(100,60,100,20);
		this.panel.add(userIdTF);
		
		this.passPF =new JPasswordField();
		this.passPF.setBounds(110,90,90,20);
		this.panel.add(passPF);
		
		this.showBtn=new JButton("Show");
		this.showBtn.setBounds(210,90,70,20);
		this.panel.add(showBtn);
		
		this.color4=new Color(230, 93, 14);
		this.color5=new Color(14, 219, 230);
		
		this.loginBtn=new JButton("Login");
		this.loginBtn.setBounds(60,130,70,20);
		this.loginBtn.setBackground(color4);
		this.loginBtn.setForeground(color5);
		this.panel.add(loginBtn);
		
		this.regBtn=new JButton("Registration");
		this.regBtn.setBounds(140,130,110,20);
		this.panel.add(regBtn);
		
		this.exitBtn=new JButton("Exit");
		this.exitBtn.setBounds(100,160,70,20);
		this.panel.add(exitBtn);
		
		
		this.add(panel);
	}
	
	
}