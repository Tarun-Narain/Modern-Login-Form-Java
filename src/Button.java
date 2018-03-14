
import java.awt.Insets;

import javax.swing.*;
public class Button {
	ImageIcon icon;
	ImageIcon icon2;
	ImageIcon icon3;
	
	
	public JButton GetClose()
	{
		icon=new ImageIcon("images/cross2.png");
		icon2=new ImageIcon("images/cross.png");
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon2);
		log.setRolloverIcon(icon);
		log.setPressedIcon(icon);
		log.setDisabledIcon(icon);
		
		return log;
	}
	public JButton GetBack()
	{
		icon=new ImageIcon("images/back2.png");
		icon2=new ImageIcon("images/back.png");
		icon3=new ImageIcon("images/back3.png");
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon2);
		log.setRolloverIcon(icon);
		log.setPressedIcon(icon);
		log.setDisabledIcon(icon);
		
		return log;
	}
	public JButton GetLogin()
	{
		 icon=new ImageIcon("images/login1.jpg");
		 icon2=new ImageIcon("images/login2.jpg");
	 icon3=new ImageIcon("images/login3.jpg");
		
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon);
		log.setOpaque(false);
		log.setRolloverIcon(icon2);
		log.setPressedIcon(icon3);
		log.setDisabledIcon(icon);
		return log;
	}
	
	public JButton GetSave()
	{
		 icon=new ImageIcon("images/save1.jpg");
		 icon2=new ImageIcon("images/save2.jpg");
	 icon3=new ImageIcon("images/save3.jpg");
		
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon);
		log.setOpaque(false);
		log.setRolloverIcon(icon2);
		log.setPressedIcon(icon3);
		log.setDisabledIcon(icon);
		return log;
	}
	public JButton GetSet()
	{
		icon=new ImageIcon("images/sup1.jpg");
		 icon2=new ImageIcon("images/sup2.jpg");
	 icon3=new ImageIcon("images/sup3.jpg");
		
		
		JButton log=new JButton();
		log.setBorderPainted(false);
		log.setBorder(null);
		log.setMargin(new Insets(0, 0, 0, 0));
		log.setContentAreaFilled(false);
		log.setIcon(icon);
		log.setOpaque(false);
		log.setRolloverIcon(icon2);
		log.setPressedIcon(icon3);
		log.setDisabledIcon(icon);
		return log;
	}
}
