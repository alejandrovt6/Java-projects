/* 
The next program will calculate the ideal weight of a person based on their gender and 
their height using the well-known Lorentz formula. 
*/

package projects01;

import javax.swing.*;

	public class IdealWeightCalculator {

	    public static void main(String[] args) {
	        String gender = "";
	        boolean validGender = false;

	        // Ask for gender until valid input is received
	        while (!validGender) {
	            gender = JOptionPane.showInputDialog("What is your gender? (M/F)");
	            if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
	                validGender = true;
	            } else {
	                JOptionPane.showMessageDialog(null, "Invalid input. Please enter M or F.");
	            }
	        }

	        int height = 0;
	        boolean validHeight = false;

	        // Ask for height until valid input is received
	        while (!validHeight) {
	            try {
	                height = Integer.parseInt(JOptionPane.showInputDialog("What is your height? (cm)"));
	                validHeight = true;
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Invalid input. Please enter numbers only.");
	            }
	        }

	        int ideal_weight = 0;

	        // Calculate ideal weight based on gender
	        if (gender.equalsIgnoreCase("M")) {
	            ideal_weight = height - 110;
	        } else if (gender.equalsIgnoreCase("F")) {
	            ideal_weight = height - 120;
	        }

	        JOptionPane.showMessageDialog(null, "Your ideal weight is: " + ideal_weight);
	    }
	}