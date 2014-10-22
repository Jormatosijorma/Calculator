package gui;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;

import util.Core;
import util.Functions;
import util.UserInterface;

/**
 * 
 * @author Joonas Maliniemi, Toni Nahkala & Pyry Nikunen
 * @version 0.1
 * @since 1.7
 *
 */
public class CalculatorGUI extends JFrame implements UserInterface {
	
	private JButton jbtNum1;
    private JButton jbtNum2;
    private JButton jbtNum3;
    private JButton jbtNum4;
    private JButton jbtNum5;
    private JButton jbtNum6;
    private JButton jbtNum7;
    private JButton jbtNum8;
    private JButton jbtNum9;
    private JButton jbtNum0;
    private JButton jbtEqual;
    private JButton jbtAdd;
    private JButton jbtSubtract;
    private JButton jbtMultiply;
    private JButton jbtDivide;
    private JButton jbtSolve;
    private JButton jbtClear;
    private JButton jbtComma;
    public JTextField jtfResult;
    
	public CalculatorGUI() {
		
        JPanel p1 = new JPanel();

        p1.setLayout(new GridLayout(4, 3));
        p1.add(jbtNum1 = new JButton("1"));
        jbtNum1.setPreferredSize(new Dimension(60, 60));
        p1.add(jbtNum2 = new JButton("2"));
        p1.add(jbtNum3 = new JButton("3"));
        p1.add(jbtNum4 = new JButton("4"));
        p1.add(jbtNum5 = new JButton("5"));
        p1.add(jbtNum6 = new JButton("6"));
        p1.add(jbtNum7 = new JButton("7"));
        p1.add(jbtNum8 = new JButton("8"));
        p1.add(jbtNum9 = new JButton("9"));
        p1.add(jbtNum0 = new JButton("0"));
        p1.add(jbtComma = new JButton(","));
        p1.add(jbtClear = new JButton("C"));
	    
        JPanel p2 = new JPanel();

        p2.setLayout(new BorderLayout());
        p2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);
	    
        JPanel p3 = new JPanel();

        p3.setLayout(new GridLayout(5, 1));
        p3.add(jbtAdd = new JButton("+"));
        jbtAdd.setPreferredSize(new Dimension(48,48));
        p3.add(jbtSubtract = new JButton("-"));
        p3.add(jbtMultiply = new JButton("*"));
        p3.add(jbtDivide = new JButton("/"));
        p3.add(jbtSolve = new JButton("="));
	    
        JPanel p = new JPanel();

        p.setLayout(new FlowLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.SOUTH);
        p.add(p3, BorderLayout.EAST);
	    
        add(p);
        
	}
}

