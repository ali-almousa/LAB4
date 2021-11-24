package LAB4_2_polymorphism;

import LAB4_2_polymorphism_OS.OperatingSystem.SpecialButtons;

public class SpecialActionButton extends KeyboardButton {
	
	private SpecialButtons buttonType;
	
	public SpecialActionButton(SpecialButtons BS, int code) {
		super(BS.toString(), code);
		buttonType = BS;
	}

	
	public String act(String disp_text) {
		if (disp_text.contains(buttonType.toString()))
			disp_text = Backspace(disp_text);
		return disp_text;
	}
	
	
	private String Backspace(String disp_Text) {
		if (disp_Text.length() != 0)
			disp_Text = disp_Text.substring(0,disp_Text.length()-10);
		return disp_Text;
	}
	
}
