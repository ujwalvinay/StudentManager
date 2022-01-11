import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

class viewFrame extends JFrame
{
	Container container = getContentPane();
	JLabel StdName =new JLabel("Name : ");
	JLabel Stdreg = new JLabel("Reg no. : ");
	JLabel Stdmrk = new JLabel("Mark : ");
	JLabel Stdgrde = new JLabel("Grade : ");
	JTextField nameShow = new JTextField();
	JTextField regnoShow = new JTextField();
	JTextField markShow = new JTextField();
	
	viewFrame()
	{
		setTitle("View Data");
		setVisible(true);
		setBounds(450,10,400,600);
		setDefaultCloseOperation(3);
		setResizable(false);
		setLayoutManager();
		setLocation();
		addComponents();
	}
	public void setLayoutManager()
	{
		container.setLayout(null);
	}
	public void setLocation()
	{
		StdName.setBounds(20, 110, 200, 20);
        Stdreg.setBounds(20, 140, 200, 20);
        Stdmrk.setBounds(20, 170, 200, 20);
        Stdgrde.setBounds(20, 200, 200, 20);
	}
	public void addComponents()
	{
		container.add(StdName);
		container.add(Stdreg);
		container.add(Stdmrk);
		container.add(Stdgrde);
		container.add(nameShow);
		container.add(regnoShow);
		container.add(markShow);
		
	}
	
}