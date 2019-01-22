import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import People.People;

public class Main 
{
	public static void main(String[] args) 
	{
		//int cardReturned = blackjackBasic(22, 22);
		//System.out.println(cardReturned);
		
		//int retunedValue = uniqueSum(1, 1, 2);
		//System.out.println(retunedValue);
		
		//boolean isHot = tooHotCheck(60, true);
		//System.out.println(isHot);
	}
	
	private static boolean tooHotCheck(int temperature, boolean isSummer)
	{
		int upperLimit = (isSummer) ? 90 : 100;		
		boolean isHot = ((temperature >= 60) & (temperature <= upperLimit)) ? true : false;
		
		return isHot;
	}
	
	//very over the top, wanted to practice hashset
	private static int uniqueSum(int firstValue, int secondValue, int thirdValue)
	{
		if((firstValue == secondValue) && (thirdValue == firstValue))
		{
			firstValue = 0;
			secondValue = 0;
			thirdValue = 0;
		}
		else if (firstValue == secondValue)
		{
			firstValue = 0;
			secondValue = 0;
		}
		else if(secondValue == thirdValue)
		{
			thirdValue = 0;
			secondValue = 0;
		}
		else if(thirdValue == firstValue)
		{
			firstValue = 0;
			thirdValue = 0;
		}
		
		HashSet<Integer> uniqueNumbers = new HashSet<Integer>();
		
		uniqueNumbers.add(firstValue);
		uniqueNumbers.add(secondValue);
		uniqueNumbers.add(thirdValue);
		
		int total = 0;
 
		for(Integer i : uniqueNumbers)
		{
			total += i;
		}
	
		return total;
	}
	
	private static int blackjackBasic(int firstCard, int secondCard)
	{
		int targetValue = 21;
		if(firstCard > 0 && secondCard > 0)
		{
			if(firstCard - secondCard > 0 && firstCard <= targetValue)
			{
				return firstCard;
			}
			else if(secondCard <= targetValue)
			{
				return secondCard;
			}
			else
			{
				return 0;
			}
		}
		return 0;
	}
}
