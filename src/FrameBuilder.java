import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FrameBuilder {

static Button button=new Button();
ImageIcon j1=new ImageIcon("images/bg1.png");
JLabel img=new JLabel(j1);
public static PanelBuilder panels =new PanelBuilder();
public static JPanel SignupPanel=panels.GetSignup();
public static JPanel LoginPanel=panels.GetLogin();
final JFrame login=new JFrame("LOGIN TO CONTINUE");


public JFrame GetLoginFrame()
{
	LoginPanel.setVisible(true);
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	int y=screensize.height;
	int x=screensize.width;
	img.setBounds(0, 0, 400, 400);
	login.setUndecorated(true);
	login.setBackground(new Color(0.1f, 0.1f, 0.1f,0.9f));
	JButton close=button.GetClose();
	close.setBounds(693, 0, 20, 20);
	login.setBounds(x/4-30, y/4-20,713, 384+20);
	login.setLayout(null);
	login.add(close);
	login.getContentPane().setBackground(Color.blue);
	login.add(SignupPanel);
	SignupPanel.setVisible(false);
	login.add(LoginPanel);
	login.add(img);
	ActionListener closing=new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			login.dispose();
			}
	};
	close.addActionListener(closing);
	login.setVisible(true);
	return login;
}
public void SignupShow()
{
	SignupPanel.setVisible(true);
	LoginPanel.setVisible(false);
}
public void SignupHide()
{
	SignupPanel.setVisible(false);
	LoginPanel.setVisible(true);
}

	
}
