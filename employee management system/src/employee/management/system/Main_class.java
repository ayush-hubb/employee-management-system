package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_class extends JFrame {
	
	Main_class(){
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image);
		
		JLabel heading = new JLabel ("Employee Management System");
		heading.setBounds(340, 155, 400, 40);
		heading.setFont(new Font("Raleway",Font.BOLD,25));
		image.add(heading);
		
		JButton add = new JButton("Add Employee");
		add.setBounds(335, 270, 150, 40);
		add.setForeground(Color.WHITE);
		add.setBackground(Color.black);
		add.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new AddEmployee();
				setVisible(false);
			}
			
			
		});
		image.add(add);
		

		JButton view = new JButton("View Employee");
		view.setBounds(565, 270, 150, 40);
		view.setForeground(Color.WHITE);
		view.setBackground(Color.black);
		view.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new View_Employee();
				setVisible(false);
				}
			});
		image.add(view);

		JButton remove = new JButton("Remove Employee");
		remove.setBounds(335, 370, 150, 40);
		remove.setForeground(Color.WHITE);
		remove.setBackground(Color.black);
		remove.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new RemoveEmployee();
				setVisible(false);
				
				}
			});
		image.add(remove);
		
		setSize(1120,630);
		setLocation(250,100);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main_class();
	}

}
