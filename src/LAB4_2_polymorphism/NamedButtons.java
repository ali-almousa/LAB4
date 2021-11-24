package LAB4_2_polymorphism;

public class NamedButtons extends KeyboardButton {
	
	private String action;
	
	public NamedButtons(String name, int code) {
		super(name, code);
	}
	
	
	public String getAction() {
		return action;
	}
	
	
	public void setAction(String action) {
		this.action = action;
	}
	
	
	public String toString() {
		return "";
	}
	

}
