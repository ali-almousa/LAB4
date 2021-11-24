package LAB4_1_packages;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator extends Keyboard {
	
	public Calculator() {
		super.buttonCodeList = new ArrayList<String>(
				Arrays.asList("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"
			,"17","18","19"));
		
		super.buttonValueList =	new ArrayList<String>(
				Arrays.asList("0","1","2","3","4","5","6","7","8","9","+","-","/","*","=","(",")"
			,"Backspace","Space","Enter"));
		
		showKeyboard(10, 10);
	}
	
	public void buttonPressed(String buttonCode) {
		if (getAllButtonsCode().contains(buttonCode)) {
		
			int x = getButtonCodeIndex(buttonCode);
			if (getAllButtonsValue().get(x) == "=") {
				super.buttonPressed(buttonCode);
				String[] s = getDisplayedText().split("\n",0);
				
				int result = EvaluateString.evaluate(s[s.length-1]);
				addToDisplayedText(" "+String.valueOf(result));
				newLine();
				System.out.println("Texted entered: \n" + "-----------------------------------" );
				System.out.println(getDisplayedText());
				System.out.println("-----------------------------------" );
			}
			else
				super.buttonPressed(buttonCode);
		}
	}
	
}