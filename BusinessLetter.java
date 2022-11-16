import javax.swing.*;
public class BusinessLetter
{
	public static void main(String[] args)
	{
		String name;
		String firstName = "";
		String lastName = "";
		int x;
		char c;
		name = JOptionPane.showInputDialog(null, "Please enter the customer's first and last name:");
		x = 0;
		while(x < name.length())
		{
			if(name.charAt(x) == ' ')
			{
				firstName = name.substring(0, x);
				lastName = name.substring(x + 1, name.length());
			}
			++x;
		}
		JOptionPane.showMessageDialog(null, "Dear " + firstName + ",\nI am so glad we are on a first name basis because I would like the opportunity to talk to you about affordable insurance.\nThis is a protection plan for the entire " + lastName + " family.\nCall A-One Family Insurance today! (1-800-555-9287)");
	}
}