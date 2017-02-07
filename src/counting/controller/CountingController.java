package counting.controller;

import counting.view.*;
import counting.model.*;
import javax.swing.*;

public class CountingController 
{
	private CountingFrame baseFrame;
	private RecursionTool mathTool;
	private Timer countingTimer;
	
	public CountingController()
	{
		this.mathTool = new RecursionTool();
		this.baseFrame = new CountingFrame(this);
		this.countingTimer = new Timer();
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "look we are doing math");
	}
	
	public String transferFactorial(String input)
	{
		String factorialInfo = "The factorial of" + input + " is ";
		
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateFactorial(Integer.parseDouble(input));
			
		}
		return factorialInfo;
	}
	
	private boolean isValid(String testValue)
	{
		try
		{
			int test = Double.parseDouble(testValue);
			if(test >=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid number >= 0");
			return false;
		}
	}
}
