package LAB4_1_packages;

import java.util.ArrayList;
public class Keyboard {

	protected enum SpecialButtons { Space, Backspace, Enter;};
	
	protected ArrayList<String> buttonCodeList;
	protected ArrayList<String> buttonValueList;
	protected String displayedText = "";
	
	public Keyboard() {
	}
	
	public void showKeyboard(int rows, int cols) {
		TableViewer table = new TableViewer(getAllButtonsCode(), getAllButtonsValue());
		table.viewTable(rows, cols);
	}
	
	protected int getButtonCodeIndex(String buttonCode) {
		return buttonCodeList.indexOf(buttonCode);
	}
	
	public void buttonPressed(String buttoncode) {
		
		if (getAllButtonsCode().contains(buttoncode)) {
			int x = getButtonCodeIndex(buttoncode);
			
			if ((buttonValueList.get(x)).equals(SpecialButtons.Space.toString()))
				space();
			else if ((buttonValueList.get(x)).equals(SpecialButtons.Backspace.toString()))
				backspace();
			else if ((buttonValueList.get(x)).equals(SpecialButtons.Enter.toString()))
				newLine();
			else
				addToDisplayedText(getAllButtonsValue().get(x));
		}
		
		System.out.println("Texted entered: \n" + "-----------------------------------" );
		System.out.println(getDisplayedText());
		System.out.println("-----------------------------------" );
	
	}
	
	protected void backspace() {
		if (displayedText.length() != 0)
			displayedText = displayedText.substring(0,displayedText.length()-1);
	}
	
	protected void space()	{
		addToDisplayedText(" ");
	}

	protected void newLine() {
		addToDisplayedText("\n");
	}
	
	protected ArrayList<String> getAllButtonsValue(){
		return buttonValueList;
	}
	
	protected ArrayList<String> getAllButtonsCode(){
		return buttonCodeList;
	}
	
	protected String getDisplayedText() {
		return displayedText;
	}
	
	protected void addToDisplayedText(String newdisplayedText) {
		displayedText += newdisplayedText;
	}

}

