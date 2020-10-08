package cse360assignment02;

/**
 * 
 * @author Brandon Evans
 * This is a program for <b>Assignment 2</b> for CSE360
 * The purpose is to help get students familiar with version control
 */
public class AddingMachine {
	private int total;
	private String record;
	
	/**
	 * The AddingMachine constructor
	 * 
	 */
	public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    record = "0";
	}
	
	/**
	 * Method to retrieve total
	 * @return
	 */
	public int getTotal () {
	    return total;
	}
	
	/**
	 * Method to add values, adds to transaction record
	 * @param value - an integer value for addition
	 */
	public void add (int value) {
		total = total + value;
		record = record + " + " + value;
	}
	
	/**
	 * Method to subtract values, adds to transaction record
	 * @param value - an integer value for subtraction
	 */
	public void subtract (int value) {
		total = total - value;
		record = record + " - " + value; 
	}
	
	/**
	 * Method to return record of transaction string
	 */
	public String toString () {
		return record;
	}
	
	/**
	 * Method to clear the class
	 */
	public void clear() {
		total = 0;
		record = "0";
	}
}