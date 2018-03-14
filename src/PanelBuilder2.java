import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class PanelBuilder2 {
	
	Button  buttons=new Button();
	
public JPanel GetSignup()
{
	JLabel l1=new JLabel(new ImageIcon("images/tpb.jpg"));
	JLabel l12=new JLabel(new ImageIcon("images/tpb.jpg"));
	JLabel l2=new JLabel(new ImageIcon("images/tpb.jpg"));
	JLabel l22=new JLabel(new ImageIcon("images/tpb.jpg"));
	JLabel l3=new JLabel(new ImageIcon("images/tpb.jpg"));
	JLabel l32=new JLabel(new ImageIcon("images/tpb.jpg"));
	
	Border blackline = BorderFactory.createLineBorder(Color.black);
	JPanel panel=new JPanel();
	final JPanel panel2=new JPanel();
	final JPanel panel3=new JPanel();
	final JTextField KeyCode=new JTextField();
	JButton Validate=new JButton("Validate");
	Validate.setBounds(227+295, 12, 120, 30);
	KeyCode.setBounds(227+95, 12, 190, 30);
	//panel.setBorder(blackline);
	KeyCode.setText("Key-Code");
	KeyCode.setFont(new Font("", Font.PLAIN, 16));
	panel.setBounds(22, 22, 671, 362);
	panel.setBackground(new Color(0.1f, 0.1f, 0.1f,0.0f));
	JButton back=buttons.GetBack();
	panel.setLayout(null);
	back.setBounds(10, 0, 100, 50);
	
	JLabel newuser=new JLabel("SIGN UP");
	newuser.setFont(new Font("", Font.PLAIN, 24));
	newuser.setBounds(10, 10, 200,30 );
	
	JLabel olduser=new JLabel("RESET PASSWORD");
	olduser.setFont(new Font("", Font.PLAIN, 24));
	olduser.setBounds(10, 10, 300,30 );
	
	
	JTextField Nametf =new JTextField();
	Nametf.setBounds(0,0,200,30);
	Nametf.setBorder(null);
	Nametf.setOpaque(false);
	JLabel Name=new JLabel("Name :");
	Name.setBounds(20, 45, 80, 30);
	Name.setFont(new Font("", Font.ITALIC, 13));
	Name.setForeground(Color.white);
	l3.add(Nametf);
	l3.setBounds(20, 64, 200, 30);
	
	
	JTextField Nametf2 =new JTextField();
	Nametf2.setBounds(0,0,200,30);
	Nametf2.setBorder(null);
	Nametf2.setOpaque(false);
	JLabel Name2=new JLabel("Name :");
	Name2.setBounds(20, 43, 80, 30);
	Name2.setFont(new Font("", Font.ITALIC, 13));
	Name2.setForeground(Color.white);
	l32.add(Nametf2);
	l32.setBounds(20, 64, 200, 30);
	
	JButton save=buttons.GetSave();
	save.setBounds(91, 202, 100, 100);
	panel2.add(save);
	

	JButton save2=buttons.GetSave();
	save2.setBounds(91, 202, 100, 100);
	panel3.add(save2);
	
	JTextField Passtf =new JTextField();
	Passtf.setBounds(0, 0, 200, 30);
	Passtf.setBorder(null);
	Passtf.setOpaque(false);
	JLabel Pass=new JLabel("Password :");
	Pass.setBounds(20, 105, 80, 30);
	Pass.setFont(new Font("", Font.ITALIC, 13));
	Pass.setForeground(Color.white);
	l2.add(Passtf);
	l2.setBounds(20, 125, 200, 30);
	JTextField Passtf2 =new JTextField();
	Passtf2.setBounds(0, 0, 200, 30);
	Passtf2.setBorder(null);
	Passtf2.setOpaque(false);
	JLabel Pass2=new JLabel("New Password :");
	Pass2.setBounds(20, 105, 120, 30);
	Pass2.setFont(new Font("", Font.ITALIC, 13));
	Pass2.setForeground(Color.white);
	l22.add(Passtf2);
	l22.setBounds(20, 125, 200, 30);
	
	JTextField Passctf =new JTextField();
	JLabel Passc=new JLabel("Confirm Password :");
	Passctf.setOpaque(false);
	Passctf.setBorder(null);
	Passc.setBounds(20, 165, 140, 30);
	Passc.setForeground(Color.white);
	Passc.setFont(new Font("", Font.ITALIC, 13));
	Passctf.setBounds(0, 0, 200, 30);
	l1.add(Passctf);
	l1.setBounds(20, 185, 200, 30);
	
	JTextField Passctf2 =new JTextField();
	JLabel Passc2=new JLabel("Confirm New Password :");
	Passctf2.setOpaque(false);
	Passctf2.setBorder(null);
	Passc2.setBounds(20, 165, 190, 30);
	Passc2.setForeground(Color.white);
	Passc2.setFont(new Font("", Font.ITALIC, 13));
	Passctf2.setBounds(0, 0, 200, 30);
	l12.add(Passctf2);
	l12.setBounds(20, 185, 200, 30);
	
	panel2.setBackground(new Color(172, 50, 50));
	panel3.setBackground(new Color(172, 50, 50));
	
	panel2.setBounds(10, 60, 301, 294);
	panel2.setBorder(blackline);
	panel2.setLayout(null);
	panel2.add(newuser);
	panel2.add(l1);
	panel2.add(Passc);
	panel2.add(l2);
	panel2.add(Name);
	panel2.add(Pass);
	panel2.add(l3);
	
	panel3.setBounds(341, 60, 291, 294);
	panel3.setBorder(blackline);
	panel3.setLayout(null);
	panel3.add(olduser);
	panel3.add(l22);
	panel3.add(Pass2);
	panel.add(panel2);
	panel.add(panel3);
	panel3.add(l32);
	panel3.add(Name2);
	panel.add(back);
	panel.add(KeyCode);
	panel3.setVisible(false);
	panel2.setVisible(false);
	panel.add(Validate);
	panel3.add(l12);
	panel3.add(Passc2);
	
	ActionListener Backing=new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			FrameBuilder f1=new FrameBuilder();
			panel2.setVisible(false);
			KeyCode.setText("Key-Code");
			panel3.setVisible(false);
			f1.SignupHide();
		}	
	};
	back.addActionListener(Backing);
	
	ActionListener Validation=new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			String s2=KeyCode.getText();
			if(s2.equals("Tarun"))
			{
				panel2.setVisible(true);
				panel3.setVisible(true);
			}
		}
	};
	Validate.addActionListener(Validation);
	return panel;
}
}
