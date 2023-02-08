package model;

/**
 * @Viktoriia Denys - vdenys
 * CIS175 - Spring 2023
 * Feb 7, 2023
 */
public class NumberSubtracter {

	private int firstNum;
	private int secondNum;
	private int sub;
	
	public NumberSubtracter() {
		super();
	}
	public NumberSubtracter(int first, int second) {
		super();
		this.firstNum = first;
		this.secondNum = second;
		setFirstNum(first);
		setSecondNum(second);
		setSub();
	}
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public int getSub() {
		return sub;
	}
	public void setSub() {
		sub = sub(firstNum, secondNum);
	}
	
	public int sub(int first, int second) {
		return  first-second;
	}
	
	public String printResult() {
		return "Difference between " + secondNum + " and " + firstNum + " is " + sub;
	}
}
