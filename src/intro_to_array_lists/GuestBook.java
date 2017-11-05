package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	static JFrame frame=new JFrame();
	static JPanel panel=new JPanel();
	static JButton butt1=new JButton();
	static JButton butt2=new JButton();
	static ArrayList<String> names=new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook g1=new GuestBook();
		
		
	}
	public GuestBook() {
		createUI();
	}
	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		butt1.setText("Add Name");
		butt1.addActionListener(this);
		panel.add(butt1);
		butt2.setText("View Names");
		butt2.addActionListener(this);
		panel.add(butt2);
		frame.pack();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String output="";
		if(e.getSource()==butt1) {
			String name=JOptionPane.showInputDialog("Enter your name");
			
			names.add(name);
		}
		
		else if(e.getSource()==butt2) {
			int i=1;
			for (String d : names) {
				
				output+=("Guest # "+ i++ +":"+" "+d+"\n");
			}
			JOptionPane.showMessageDialog(null, output);
		}
	}
}
