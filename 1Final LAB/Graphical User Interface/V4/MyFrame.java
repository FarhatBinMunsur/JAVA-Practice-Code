import java.lang.*;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame{
	
	private JLabel titleLabel,userIDLabel,passLabel;
	private JTextField userIdTF;
	private JPasswordField passPF;
	private JButton showBtn,loginBtn,regBtn,exitBtn;
	private JPanel panel;
	private ImageIcon img;
	private JLabel imgLabel;
	private ImageIcon backImg;
	
	public MyFrame(){
		
		super("Sample Management System");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.backImg=new ImageIcon("Image/school2.png");
		
		this.panel = new JPanel()
		{
			protected void paintComponent(Graphics g){
				super.paintComponent(g);
				g.drawImage(backImg.getImage(),0,0,null);
			}
		};
		
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
		
		this.img= new ImageIcon("Image/school.jpg");
		this.imgLabel=new JLabel(img);
		this.imgLabel.setBounds(60,180,229,200);
		this.panel.add(imgLabel);
		
		this.add(panel);
	}
	
	
}