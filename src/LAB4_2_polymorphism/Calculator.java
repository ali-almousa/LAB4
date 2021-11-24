package LAB4_2_polymorphism;

import LAB4_1_packages.EvaluateString;
import LAB4_2_polymorphism_OS.OperatingSystem.SpecialButtons;

public class Calculator extends Keyboard{
	public Calculator(int first_code, String[] keyboardButtonsValues, String[]
			generalButtonsValues, String[] generalButtonsActions, SpecialButtons[]
					SpecialButtonsList)
	{
		super(first_code, keyboardButtonsValues, generalButtonsValues,
				generalButtonsActions, SpecialButtonsList);
		
	}
	
	public void buttonPressed(String button_code) {
		
		if (getAllButtonsCode().contains(button_code)) {
			
			if (getButtonValue(button_code) == "=") {
				addToDisplayedText(getButtonValue(button_code));
				
				
				String[] s = getDisplayedText().split("\n",0);
				int result = EvaluateString.evaluate(s[s.length-1]);
				addToDisplayedText(" "+String.valueOf(result)+"\n");
				
				
				System.out.println("Texted entered: \n" + "---------------------------------------" );
				System.out.println(getDisplayedText());
				System.out.println("---------------------------------------" );
				
			}
			else 
				super.buttonPressed(button_code);
			
		}
	
	}

}
