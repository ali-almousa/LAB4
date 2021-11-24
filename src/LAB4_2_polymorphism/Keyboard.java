package LAB4_2_polymorphism;

import java.util.ArrayList;

import LAB4_2_polymorphism_OS.OperatingSystem.SpecialButtons;
public class Keyboard {
	
	protected ArrayList<KeyboardButton> buttons;
	protected String displayedText = "";
	
	public Keyboard(int first_code, String[] keyboardButtonsValues, String[]generalButtonsValues,
					String[] generalButtonsActions, SpecialButtons[] SpecialButtonsList) 
	{
		buttons = new ArrayList<KeyboardButton>(keyboardButtonsValues.length+generalButtonsValues.length+SpecialButtonsList.length);
		
		int A = first_code;
		KeyboardButton list;
		
		for (int i = 0; i < keyboardButtonsValues.length; i++) {
			list = new NamedButtons(keyboardButtonsValues[i], A);
			buttons.add(list);
			((NamedButtons) list).setAction(keyboardButtonsValues[i]);
			A++;
		}
		
		for (int j = 0; j < generalButtonsValues.length; j++) {
			list = new NamedButtons(generalButtonsValues[j], A);
			buttons.add(list);
			((NamedButtons) list).setAction(generalButtonsActions[j]);
			A++;
		}
		
		for (int k = 0; k < SpecialButtonsList.length; k++) {
			list = new NamedButtons(SpecialButtonsList[k].toString(), A);
			buttons.add(list);
			((NamedButtons) list).setAction(SpecialButtonsList[k].toString());
			A++;
		}
		
		showKeyboard(10,10);
		
	}
	
	protected void showKeyboard(int rows, int cols) {
		TableViewer table = new TableViewer(getAllButtonsCode(), getAllButtonsValue());
		table.viewTable(rows, cols);
	}
	
	protected String getButtonValue(String button) {
		int x = getAllButtonsCode().indexOf(button);
		NamedButtons list = (NamedButtons) buttons.get(x);
		return list.getAction();
	}
	
	
	public void buttonPressed(String buttoncode) {
		if (getAllButtonsCode().contains(buttoncode)) {
			addToDisplayedText(getButtonValue(buttoncode));
			
			int x = getAllButtonsCode().indexOf(buttoncode);
			KeyboardButton list = new SpecialActionButton( SpecialButtons.Backspace , x);
			displayedText = ((SpecialActionButton)list).act(getDisplayedText());
			
		}
		
		System.out.println("Texted entered: \n" + "-----------------------------------" );
		System.out.println(getDisplayedText());
		System.out.println("-----------------------------------" );
	
	}
	
	protected ArrayList<String> getAllButtonsValue(){
		ArrayList<String> ButtonsValue = new ArrayList<String>();
		for (int i = 0; i < buttons.size(); i++) {
				ButtonsValue.add(i, buttons.get(i).getName());
		}
		return ButtonsValue;
	}
	
	
	public ArrayList<String> getAllButtonsCode() {
		ArrayList<String> buttonCodeList = new ArrayList<String>() ;
		for (int i =0 ; i<buttons.size();i++) {
			buttonCodeList.add( buttons.get(i).getCode()+"");
		}
		return buttonCodeList;
	}
	
	protected String getDisplayedText() {
		return displayedText;
	}
	
	protected void addToDisplayedText(String newdisplayedText) {
		displayedText += newdisplayedText;
	}

}


