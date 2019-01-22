
public class Calculator 
{
	public float performSimpleCalculation(String operatorChosen, float firstNumber, float secondNumber)
	{
		switch(operatorChosen)
		{
			case "+":
				return add(firstNumber, secondNumber);
			case "-":
				return subtract(firstNumber, secondNumber);	
			case "*":
				return multiply(firstNumber, secondNumber);
			case "/":
				return divide(firstNumber, secondNumber);
			case "%":
				return remainder(firstNumber, secondNumber);
			default:
				System.out.println("Please Enter A Valid Operator - Error");	
		}
		
		return 0;
	}
	
	private static int add(int firstNumber, int secondNumber) 
	{
		return firstNumber + secondNumber;
	}
	
	private int subtract(int firstNumber, int secondNumber) 
	{
		return firstNumber - secondNumber;
	}
	
	private int divide(int firstNumber, int secondNumber) 
	{
		return firstNumber / secondNumber;
	}
	
	private int multiply(int firstNumber, int secondNumber) 
	{
		return firstNumber * secondNumber;
	}
	
	private int remainder(int firstNumber, int secondNumber) 
	{
		return firstNumber % secondNumber;
	}
	
	private static float add(float firstNumber, float secondNumber) 
	{
		return firstNumber + secondNumber;
	}
	
	private float subtract(float firstNumber, float secondNumber) 
	{
		return firstNumber - secondNumber;
	}
	
	private float divide(float firstNumber, float secondNumber) 
	{
		return firstNumber / secondNumber;
	}
	
	private float multiply(float firstNumber, float secondNumber) 
	{
		return firstNumber * secondNumber;
	}
	
	private float remainder(float firstNumber, float secondNumber) 
	{
		return firstNumber % secondNumber;
	}
}
