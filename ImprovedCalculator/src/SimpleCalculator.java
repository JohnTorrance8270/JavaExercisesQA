
public class SimpleCalculator 
{
	InputController inputController;
	Calculator calc;
	boolean runAgain = false;
	
	SimpleCalculator()
	{
		inputController = new InputController();
		calc = new Calculator();
	}
	
	private void simpleCalc()
	{
		float firstNum = inputController.numericInputController();
		float secondNum = inputController.numericInputController();
		String operator = inputController.operatorInputController();
		
		float total = (calc.performSimpleCalculation(operator, firstNum, secondNum));
		System.out.println("The Answer is: " + total);
		
		runAgain = inputController.confirmChoiceController();
	}
	
	public void runSimpleCalc()
	{
		do
		{
			simpleCalc();
		}
		while(runAgain);
		inputController.closeReader();
	}
}
