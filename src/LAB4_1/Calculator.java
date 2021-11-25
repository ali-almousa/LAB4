package LAB4_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator extends Keyboard {
	char ch1 = '\n';
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
				
				try {
					int result = EvaluateString.evaluate(s[s.length-1]);
					addToDisplayedText(" "+String.valueOf(result));
				}
				catch(UnsupportedOperationException e){
					System.out.println("Please enter the code of the button or -1 to exit:");
					System.out.println("****** Unacceptable expression! I will delete it ******");
					
					backspace();
					while(!String.valueOf(displayedText.charAt(displayedText.length()-1)).matches("\n") && displayedText.length()-1 != 0) {
						backspace();
					}
					backspace();
				}
				
				
				
				if (displayedText.length() != 0) 
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
	
