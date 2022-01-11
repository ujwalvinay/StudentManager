                                          //creating the mainframe
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainFrame extends JFrame implements ActionListener
{
	StudentTrail std = new StudentTrail();
	Container container = getContentPane();
	JLabel name =new JLabel("Name : ");
	JLabel regno = new JLabel("Reg no. : ");
	JLabel mark = new JLabel("Mark : ");
	JTextField nameField = new JTextField();
	JTextField regnoField = new JTextField();
	JTextField markField = new JTextField();
	JButton loginButton = new JButton("Enter");
	JButton viewButton = new JButton("View");
	
	MainFrame()
	{
		setTitle("Student Entry");
		setVisible(true);
		setBounds(10,10,400,600);
		setDefaultCloseOperation(3);
		setResizable(false);
		setLayoutManager();
		setLocationAndSize();
		addComponents();
	}
	public void setLayoutManager()
	{
		container.setLayout(null);
	}
	public void setLocationAndSize()
	{
		name.setBounds(50,150,100,30);
		regno.setBounds(50,220,100,30);
		mark.setBounds(50,290,100,30);
		nameField.setBounds(150,150,150,30);
		regnoField.setBounds(150,220,150,30);
		markField.setBounds(150,290,150,30);
		loginButton.setBounds(20,370,150,30);
		viewButton.setBounds(180,370,150,30);
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameData = nameField.getText();
				String regData = regnoField.getText();
				String markData = markField.getText();
				std.readData(nameData, regData, markData);
				
				}
		});;
		
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewFrame();
				
				}
		});;
		
	}
	public void addComponents()
	{
		container.add(name);
		container.add(regno);
		container.add(nameField);
		container.add(regnoField);
		container.add(mark);
		container.add(markField);
		container.add(loginButton);
		container.add(viewButton);
	}

}
