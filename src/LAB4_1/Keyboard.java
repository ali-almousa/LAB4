package LAB4_1;

import java.util.*;
public class Keyboard {

	protected enum SpecialButtons { Space, Backspace, Enter;};
	
	protected ArrayList<String> buttonCodeList;
	protected ArrayList<String> buttonValueList;
	protected String displayedText = "";
	
	public Keyboard() {
	}
	
	protected void showKeyboard(int rows, int cols) {
		TableViewer table = new TableViewer(getAllButtonsCode(), getAllButtonsValue());
		table.viewTable(rows, cols);
	}
	
	protected int getButtonCodeIndex(String buttonCode) {
		return buttonCodeList.indexOf(buttonCode);
	}
	
    public void buttonPressed(String button){

        int Value = getButtonCodeIndex(button);
        if (buttonValueList.get(Value) == SpecialButtons.Space.toString()) {
            space();
            }else if (buttonValueList.get(Value) == SpecialButtons.Backspace.toString()) {
                backspace();
            }else if (buttonValueList.get(Value) == SpecialButtons.Enter.toString()) {
                newLine();
        }else
            addToDisplayedText(buttonValueList.get(Value));
    
		System.out.println("Texted entered: \n" + "-----------------------------------" );
		System.out.println(getDisplayedText());
		System.out.println("-----------------------------------" );
	
	}
	
	protected void backspace() {
		if (displayedText.length() != 0)
			displayedText = displayedText.substring(0,displayedText.length()-1);
	}
	
	protected void space(){
        displayedText += " ";
        }
	protected void newLine(){
        displayedText += "\n";
        }
	protected ArrayList<String> getAllButtonsValue(){
        return buttonValueList;
        }
	protected ArrayList<String> getAllButtonsCode(){
        return buttonCodeList;
        }
	protected String getDisplayedText(){
        return displayedText;
        }
	protected void addToDisplayedText(String NewDisplayedText){
        displayedText += NewDisplayedText;
    }}  

