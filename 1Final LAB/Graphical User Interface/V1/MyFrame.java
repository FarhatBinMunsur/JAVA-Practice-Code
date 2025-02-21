import java.lang.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	
	private JLabel titleLabel,userIDLabel,passLabel;
	private JTextField userIdTF;
	private JPasswordField passPF;
	private JButton showBtn,loginBtn,regBtn,exitBtn;
	private JPanel panel;
	
	public MyFrame(){
		
		super("Sample Management System");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel = new JPanel();
		this.panel.setLayout(null);
		
		this.titleLabel=new JLabel("School Management System");
		this.titleLabel.setBounds(100,10,200,20);
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
		
		this.loginBtn=new JButton("Login");
		this.loginBtn.setBounds(60,130,70,20);
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