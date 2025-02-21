import java.lang.*;
import javax.swing.*;

public class FormFrame extends JFrame{
	JLabel label1,label2,label3;
	JRadioButton yesRB,noRB;
	JCheckBox cb1,cb2,cb3;
	JComboBox fbLangCMB;
	ButtonGroup btng;
	JPanel panel;
	
	public FormFrame(){
		super("Form");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel= new JPanel();
		this.panel.setLayout(null);
		
		this.label1=new JLabel("Do you like Java");
		this.label1.setBounds(30,40,200,20);
		this.panel.add(label1);
		
		this.yesRB=new JRadioButton("YES");
		this.yesRB.setBounds(70,60,80,20);
		this.panel.add(yesRB);
		
		this.noRB=new JRadioButton("NO");
		this.noRB.setBounds(170,60,80,20);
		this.panel.add(noRB);
		
		this.btng= new ButtonGroup();
		this.btng.add(yesRB);
		this.btng.add(noRB);
		
		this.label2=new JLabel("What will we do in the final term?");
		this.label2.setBounds(30,110,200,20);
		this.panel.add(label2);
		
		this.cb1=new JCheckBox("FT");
		this.cb1.setBounds(30,140,50,20);
		this.panel.add(cb1);
		
		this.cb2=new JCheckBox("Project");
		this.cb2.setBounds(30,160,100,20);
		this.panel.add(cb2);
		
		this.cb3=new JCheckBox("Viva");
		this.cb3.setBounds(30,180,50,20);
		this.panel.add(cb3);
		
		this.label3=new JLabel("Select your favourite language?");
		this.label3.setBounds(270,40,200,20);
		this.panel.add(label3);
		
		String data[] =new String[]{"C++","Java","C#","Python","GO","Rust"};
		this.fbLangCMB= new JComboBox(data);
		this.fbLangCMB.setBounds(490,40,50,30);
		this.panel.add(fbLangCMB);
		
		this.add(panel);
	}
}