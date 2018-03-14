import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;


	public class PanelBuilder extends PanelBuilder2{
	public Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	int x = (int) screensize.getWidth();
	int y = (int) screensize.getHeight();
	public static JTextField usnmtf=new JTextField();
	public JLabel text=new JLabel("LOGIN"); 
	public JLabel usnm=new JLabel("Username");
	 public JLabel pass=new JLabel("Password");
	public  JPanel panel = new JPanel();
	final JPasswordField passtf=new JPasswordField();
	
	public JPanel GetLogin()
	{
		JLabel l1=new JLabel(new ImageIcon("images/tpb.jpg"));
		JLabel l2=new JLabel(new ImageIcon("images/tpb.jpg"));
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		Button buttons=new Button();
		final JButton login=buttons.GetLogin();
		panel.setLayout(null);
		JButton settings=buttons.GetSet();
		settings.setBounds(x/10-90, y/3-20, 77, 35);
		usnmtf.setBorder(null);
		login.setBounds(x/10+10, y/3-20,77,35);
		passtf.setBorder(null);
		usnmtf.setFont(new Font("", Font.PLAIN, 16));
		usnmtf.setOpaque(false);
		usnmtf.setForeground(Color.white);
		passtf.setForeground(Color.white);
		
		l1.setBounds(x/50, 90, 220, 30);
		l1.setLayout(null);
		usnmtf.setBounds(0, 2, 220, 28);
		l1.add(usnmtf);
		panel.add(l1);
		
		l2.setBounds(x/50, 170, 220, 30);
		l2.setLayout(null);
		passtf.setOpaque(false);
		passtf.setBounds(0, 2, 220, 28);
		l2.add(passtf);
		panel.add(l2);
		text.setFont(new Font("", Font.ITALIC, 20));
		text.setBounds(x/10-30, 10, 100, 30);
		text.setForeground(Color.white);
		 usnm.setFont(new Font("", Font.ITALIC, 13));
		 usnm.setBounds(x/50, 60, 100, 30);
		 usnm.setForeground(Color.white);
		 pass.setFont(new Font("", Font.ITALIC, 13));
		 pass.setBounds(x/50, 140, 100, 30);
		 pass.setForeground(Color.white);
		
		panel.add(usnm);
		panel.add(pass);
		panel.add(text);
		panel.add(login);
		panel.setBorder(blackline);
		panel.setBackground(new Color(1.0f, 0.2f, 0.2f, 0.6f));
		panel.add(settings);
		panel.setBounds(384, 48, 273, 298);
		usnmtf.setText("User-name");
		passtf.setText("password");
		
		
	////////////////kl for enter///////////////
		usnmtf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)	
			passtf.requestFocusInWindow(); 
			}
		});
		///////////select all text on focus/////////////
		usnmtf.addFocusListener(new java.awt.event.FocusAdapter() {
		    public void focusGained(java.awt.event.FocusEvent evt) {
		        usnmtf.selectAll();
		    }
		});
		passtf.addFocusListener(new java.awt.event.FocusAdapter() {
		    public void focusGained(java.awt.event.FocusEvent evt) {
		        passtf.selectAll();
		    }
		});
		/////////al for login/////////////
		ActionListener al=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
			loged();	
			}
		};
		login.addActionListener(al);
		passtf.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{	if(e.getKeyCode()==KeyEvent.VK_ENTER)
			loged();
			}
		});
		////////al for signup/////////////
		ActionListener al3=new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				FrameBuilder fb=new FrameBuilder();
				fb.SignupShow();
			}
		};
		settings.addActionListener(al3);
		
		return  panel;
	}
	
	public void focusinit()
	{
		usnmtf.setText("User-name");
		usnmtf.requestFocusInWindow();
		usnmtf.selectAll();
		usnmtf.requestFocusInWindow();
	}
	private void loged()
	{
		String user=usnmtf.getText();
		String passw=String.valueOf(passtf.getPassword());
		if(user.equals("admin")&&passw.equals("admin"))   
		{
			MAIN obj=new MAIN();
			obj.Successful();
		}
		else{
			
			JOptionPane.showMessageDialog(null, "Wrong Username Or Password","", JOptionPane.ERROR_MESSAGE);	
			passtf.setText("");
			usnmtf.setText("User-name");
			usnmtf.requestFocusInWindow();
		}	
	}

	
}
