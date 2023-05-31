package gr.upatras.junit.first;

public class Subtract 
{
	
	public String getSign(int a, int b)
	{
		int sum = a - b; 
		
		if (sum > 0)
			return "POSITIVE";
		else if (sum < 0)
			return "NEGATIVE";
		else 
			return "ZERO";		
	}

}
