package util;

import gui.CalculatorGUI;
/**
 * 
 * @author Joonas Maliniemi, Toni Nahkala & Pyry Nikunen
 * @version 0.1
 * @since 1.7
 *
 */
public class Core {
	public static void main(String[] args) {
		CalculatorGUI gui = new CalculatorGUI();
		
		gui.pack();
        gui.setSize(300, 400);
        gui.setVisible(true);
	}
}
