package hensel.day1_exceptions;

import javax.swing.JOptionPane;

public class hw {

	public static void main(String[] args) {
		
		InputDialog();
		
	}
	
	static void InputDialog() {
		String number = JOptionPane.showInputDialog("Please provide an integer!");
		long parsedNum = 0;
		try {
			parsedNum = Long.parseLong(number);
			JOptionPane.showMessageDialog(null,parsedNum);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null,"Keine gültige Zahl! Nochmal!","Fehler",JOptionPane.ERROR_MESSAGE);
			InputDialog();
		}
		
	}

}
